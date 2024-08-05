import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CatalogTest {
	@Test
	void productFound() {
		SellOneItemTest.Catalog catalog = createCatalogWith(Map.of(
				"12345", 895
		));
		assertEquals(895, catalog.findPrice("12345"));
	}

	public SellOneItemTest.Catalog createCatalogWith(Map<String, Integer> productMap) {
		return new InMemoryCatalog(productMap);
	}

	@Test
	void productNotFound() {
		SellOneItemTest.Catalog catalog = createCatalogWithout(Map.of(
				"99999", 895
		));
		assertNull(catalog.findPrice("99999"));
	}

	public SellOneItemTest.Catalog createCatalogWithout(Map<String, Integer> productMap) {
		return new InMemoryCatalog(Collections.emptyMap());
	}
}

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public abstract class AbstractCatalogTest {
	@Test
	void productFound() {
		SellOneItemTest.Catalog catalog = createCatalogWith(Map.of(
				"12345", 895
		));
		assertEquals(895, catalog.findPrice("12345"));
	}

	public abstract InMemoryCatalog createCatalogWith(Map<String, Integer> productMap);

	@Test
	void productNotFound() {
		SellOneItemTest.Catalog catalog = createCatalogWithout(Map.of(
				"99999", 895
		));
		assertNull(catalog.findPrice("99999"));
	}

	public abstract InMemoryCatalog createCatalogWithout(Map<String, Integer> productMap);
}

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CatalogTest {
	@Test
	void productFound() {
		SellOneItemTest.Catalog catalog = new InMemoryCatalog(Map.of(
				"12345", 895
		));
		assertEquals(895, catalog.findPrice("12345"));
	}

	@Test
	void productNotFound() {
		SellOneItemTest.Catalog catalog = new InMemoryCatalog(Map.of(
				"12345", 895
		));
		assertNull(catalog.findPrice("99999"));
	}
}

import java.util.Collections;
import java.util.Map;

public class InMemoryCatalogTest extends CatalogContract {

	@Override
	public SellOneItemTest.Catalog createCatalogWith(Map<String, Integer> productMap) {
		return new InMemoryCatalog(productMap);
	}

	@Override
	public SellOneItemTest.Catalog createCatalogWithout(Map<String, Integer> productMap) {
		return new InMemoryCatalog(Collections.emptyMap());
	}
}

import java.util.Collections;
import java.util.Map;

public class InMemoryCatalogTest extends AbstractCatalogTest {
	@Override
	public InMemoryCatalog createCatalogWith(Map<String, Integer> productMap) {
		return new InMemoryCatalog(productMap);
	}

	@Override
	public InMemoryCatalog createCatalogWithout(Map<String, Integer> productMap) {
		return new InMemoryCatalog(Collections.emptyMap());
	}
}

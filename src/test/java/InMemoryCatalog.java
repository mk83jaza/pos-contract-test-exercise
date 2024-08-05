import java.util.Map;

public class InMemoryCatalog implements SellOneItemTest.Catalog {
	private final Map<String, Integer> productMap;

	public InMemoryCatalog(Map<String, Integer> productMap) {
		this.productMap = productMap;
	}

	@Override
	public Integer findPrice(String barcode) {
		return productMap.get(barcode);
	}
}

public class PointOfSale {
	private final SellOneItemTest.Catalog catalog;
	private final SellOneItemTest.Display display;

	public PointOfSale(SellOneItemTest.Catalog catalog, SellOneItemTest.Display display) {
		this.catalog = catalog;
		this.display = display;
	}

	public void onBarcode(String barcode) {
		int price = catalog.findPrice(barcode);
		display.displayPrice(price);
	}
}

public class PointOfSale {
	private final SellOneItemTest.Catalog catalog;
	private final SellOneItemTest.Display display;

	public PointOfSale(SellOneItemTest.Catalog catalog, SellOneItemTest.Display display) {
		this.catalog = catalog;
		this.display = display;
	}

	public void onBarcode(String barcode) {
		Integer price = catalog.findPrice(barcode);
		if (price == null) {
			display.displayProductNotFound();
		} else {
			display.displayPrice(price);
		}
	}
}

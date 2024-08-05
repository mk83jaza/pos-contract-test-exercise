import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class SellOneItemTest {
	@Test
	void productFound() {
		Display display = mock(Display.class);
		Catalog catalog = mock(Catalog.class);
		PointOfSale pos = new PointOfSale(catalog, display);
		when(catalog.findPrice("12345")).thenReturn(895);

		pos.onBarcode("12345");

		verify(catalog).findPrice("12345");
		verify(display).displayPrice(895);
	}

	@Test
	void productNotFound() {
		Display display = mock(Display.class);
		Catalog catalog = mock(Catalog.class);
		PointOfSale pos = new PointOfSale(catalog, display);
		when(catalog.findPrice("99999")).thenReturn(null);

		pos.onBarcode("99999");

		verify(catalog).findPrice("99999");
		verify(display).displayProductNotFound();
	}

	public interface Display {
		void displayPrice(int priceInCents);
		void displayProductNotFound();
	}

	public interface Catalog {
		Integer findPrice(String barcode);
	}

}

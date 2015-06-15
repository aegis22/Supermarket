import java.text.DecimalFormat;


public class Supermarket {
	private Product[] products;
	
	public Supermarket() {
		products = new Product[4];
		products[0] = new Product(00, "Apple", 0.40f, new PriceDiscount(3, 1));
		products[1] = new Product(01, "Bread", 1.25f, new NoDiscount());
		products[2] = new Product(02, "Cheese", 0.199f, new NoDiscount());
		products[3] = new Product(03, "Drink", 0.70f, new FreeDiscount(3));
	}
	
	public String calculateTotal(int[] numberProducts) {
		float accumulatedTotal = 0.0f;
		DecimalFormat df = new DecimalFormat("###.##");
		
		for (int i=0;i<4;i++) {
			accumulatedTotal += products[i].getDiscount().applyDiscount(numberProducts[i], products[i].getPrice());
		}
		
		return df.format(accumulatedTotal);
	}
}

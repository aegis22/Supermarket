
public class DiscountFactory {
	public final static int NONE = 0;
	public final static int FREE_TYPE = 1;
	public final static int PRICE_TYPE = 2;
	
	public static Discount getDiscount(int type, int quantity, int price) {
		switch (type) {
			case NONE:
				return new NoDiscount();
			case FREE_TYPE:
				return new FreeDiscount(quantity);
			case PRICE_TYPE:
				return new PriceDiscount(quantity, price);
			default:
				return null;
		}
	}
}

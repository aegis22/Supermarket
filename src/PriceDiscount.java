
public class PriceDiscount implements Discount {
	private String type;
	private int quantity;
	private int discountPrice;
	
	public PriceDiscount(int quantity, int price) {
		this.type = "PRICE";
		this.quantity = quantity;
		this.discountPrice = price;
	}
	
	public float applyDiscount(int amount, float price) {
		return (amount / quantity) * discountPrice + (amount % quantity) * price;
	}
	
	public String toString() {
		return "Type: " + type + ", discount: " + Integer.toString(quantity) + "per £" + Integer.toString(discountPrice);
	}
}

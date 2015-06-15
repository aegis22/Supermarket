package Discounts;


public class FreeDiscount implements Discount {
	private String type;
	private int quantity;
	
	public FreeDiscount(int quantity) {
		this.type = "FREE";
		this.quantity = quantity;
	}
	
	public float applyDiscount(int amount, float price) {
		return (amount - (amount / quantity)) * price;
	}
	
	public String toString() {
		return "Type: " + type + ", discount: " + Integer.toString(quantity) + "x" + Integer.toString(quantity - 1);
	}
}

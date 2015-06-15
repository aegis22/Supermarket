package Discounts;


public class NoDiscount implements Discount {
	private String type;
	
	public NoDiscount() {
		this.type = "NONE";
	}
	
	public float applyDiscount(int amount, float price) {
		return amount * price;
	}
	
	public String toString() {
		return "Type: " + type;
	}
}


public class Product {
	private int reference;
	private String name;
	private float price;
	private Discount discount;
	

	public Product(int reference, String name, float price, Discount discount) {
		this.reference = reference;
		this.name = name;
		this.price = price;
		this.discount = discount;
	}
	
	public int getReference() {
		return reference;
	}

	public void setReference(int reference) {
		this.reference = reference;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

}

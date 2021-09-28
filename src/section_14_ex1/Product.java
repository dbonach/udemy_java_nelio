package section_14_ex1;

public class Product {

	protected String name;
	protected Double price;
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String priceTag() {
		return name + " $ " + String.format("%.2f", price);
	}
}

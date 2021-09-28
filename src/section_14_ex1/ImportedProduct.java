package section_14_ex1;

public class ImportedProduct extends Product {
	
	private Double customsFee;

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		return 0.1;
	}

	@Override
	public String priceTag() {
		return name +
				" $ " +
				String.format("%.2f", price) +
				" (Customs fee: $ " +
				String.format("%.2f", customsFee)
				+ ")";
	}
}

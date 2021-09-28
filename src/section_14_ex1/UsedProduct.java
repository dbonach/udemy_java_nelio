package section_14_ex1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufacturedDate;
	
	public UsedProduct(String name, Double price, Date manufacturedDate) {
		super(name, price);
		this.manufacturedDate = manufacturedDate;
	}
	
	@Override
	public String priceTag() {
		return name +
				" (used) $ " +
				String.format("%.2f", price) +
				" (Manufacture date: " +
				sdf.format(manufacturedDate) + 
				"";
	}
}

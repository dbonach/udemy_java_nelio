package section_14_ex1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		List<Product> products = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int numberProducts = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < numberProducts; i++) {
			System.out.println();
			System.out.println("Product #" + (i + 1) + " data:");
			
			System.out.print("Common, used or imported (c/u/i)? ");
			char productType = sc.nextLine().toLowerCase().charAt(0);
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
			sc.nextLine();
			
			if (productType == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				sc.nextLine();
				
				Product prod = new ImportedProduct(name, price, customsFee);
				products.add(prod);
				
			} else if (productType == 'u') {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufacturedDate = sdf.parse(sc.nextLine());
				
				Product prod = new UsedProduct(name, price, manufacturedDate);
				products.add(prod);
				
			} else if (productType == 'c') {
				Product prod = new Product(name, price);
				products.add(prod);
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product prod : products) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();
	}
}

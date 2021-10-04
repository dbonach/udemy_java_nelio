package section_17_ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Product> products = new ArrayList<Product>();
		String sourcePath = System.getProperty("user.dir") + "/src/section_17_ex1/products.csv";
		String destinyPath = System.getProperty("user.dir") + "/src/section_17_ex1/out/";

		try (BufferedReader br = new BufferedReader(new FileReader(sourcePath))) {
			String line = br.readLine();

			while (line != null) {

				String[] productInfo = line.split(",");

				String name = productInfo[0];
				Double price = Double.valueOf(productInfo[1]);
				Integer quantity = Integer.valueOf(productInfo[2]);

				products.add(new Product(name, price, quantity));

				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		try {

			Path path = Paths.get(destinyPath);

			Files.createDirectories(path);

		} catch (IOException e) {

			System.err.println("Failed to create directory!" + e.getMessage());

		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(destinyPath + "/summary.csv"))) {
			for (Product prod : products) {
				bw.write(prod.getSummary());
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}
}

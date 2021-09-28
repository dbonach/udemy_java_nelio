package section_8_ex1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and heigth: ");
		double width = sc.nextDouble();
		double height = sc.nextDouble();
		
		Rectangle rect = new Rectangle(width, height);
		
		System.out.printf("Area: %.2f%n", rect.area());
		System.out.printf("Perimeter: %.2f%n", rect.perimeter());
		System.out.printf("Diagonal: %.2f%n", rect.diagonal());
		
		sc.close();
	}
}

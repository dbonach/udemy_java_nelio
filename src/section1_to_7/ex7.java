package section1_to_7;
import java.util.Scanner;

public class ex7 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double a, b, c;
		
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		
		System.out.printf("Triangulo: %.3f%n", a * c / 2);
		System.out.printf("Circulo: %.3f%n", c * c * 3.14159);
		System.out.printf("Trapezio: %.3f%n", (a + b) / 2 * c);
		System.out.printf("Quadrado: %.3f%n", b * b);
		System.out.printf("Retangulo: %.3f%n", a * b);
		
		scanner.close();
	}
}

package section1_to_7;
import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double pi = 3.14159, raio;
		
		System.out.print("Digite o raio: ");
		raio = scanner.nextDouble();
		
		System.out.printf("Area: %.4f", (pi * Math.pow(raio, 2.0)));
		
		scanner.close();
	}
}

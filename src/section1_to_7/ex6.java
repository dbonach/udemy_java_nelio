package section1_to_7;
import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numP1, numP2;
		double valorP1, valorP2;
		
		numP1 = scanner.nextInt();
		valorP1 = scanner.nextDouble();
		
		numP2 = scanner.nextInt();
		valorP2 = scanner.nextDouble();
		
		System.out.printf("Valor a pagar: R$ %.2f%n", (numP1*valorP1 + numP2*valorP2));
		
		scanner.close();
	}
}

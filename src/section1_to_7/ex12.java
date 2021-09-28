package section1_to_7;
import java.util.Scanner;

public class ex12 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int codigo = scanner.nextInt();
		int quantidade = scanner.nextInt();
		
		if (codigo == 1) {
			System.out.printf("Total: R$ %.2f", 4.0*quantidade);
		} else if (codigo == 2) {
			System.out.printf("Total: R$ %.2f", 4.5*quantidade);
		} else if (codigo == 3) {
			System.out.printf("Total: R$ %.2f", 5.0*quantidade);
		} else if (codigo == 4) {
			System.out.printf("Total: R$ %.2f", 2.0*quantidade);
		} else {
			System.out.printf("Total: R$ %.2f", 1.5*quantidade);
		}
		
		scanner.close();
	}
}

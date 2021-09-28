package section1_to_7;
import java.util.Scanner;

public class ex15 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double salario = scanner.nextDouble();
		
		if (salario < 2000.01) {
			System.out.println("Isento");
		} else if (salario < 3000.01) {
			System.out.printf("R$ %.2f", (salario - 1000) * 0.08);
		} else if (salario < 4500.0) {
			System.out.printf("R$ %.2f", 80 + (salario - 3000) * 0.18);
		} else {
			System.out.printf("R$ %.2f", 80 +  270 + (salario - 4500) * 0.28);
		}
		
		scanner.close();
	}
}

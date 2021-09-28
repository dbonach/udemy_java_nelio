package section1_to_7;
import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a, b, c, d;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		d = scanner.nextInt();
		
		System.out.println("Diferenca: " + (a*b - c*d));
		
		scanner.close();
	}
}

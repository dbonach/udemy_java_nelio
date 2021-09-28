package section1_to_7;
import java.util.Scanner;

public class ex22 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int valor = scanner.nextInt();
		
		for (int i = 0; i < valor; i++) {
			double primeiro = scanner.nextDouble();
			double segundo = scanner.nextDouble();
			double terceiro = scanner.nextDouble();
			
			System.out.printf("%.1f%n", (primeiro*2 + segundo*3 + terceiro*5)/10);
		}
		
		scanner.close();
	}
}

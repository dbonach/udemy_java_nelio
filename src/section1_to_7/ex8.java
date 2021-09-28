package section1_to_7;
import java.util.Scanner;

public class ex8 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		if (num > 0) {
			System.out.println("Nao negativo");
		} else {
			System.out.println("Negativo");
		}
		
		scanner.close();
	}
}

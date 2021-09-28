package section1_to_7;
import java.util.Scanner;

public class ex9 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		if (num % 2 == 1) {
			System.out.println("Impar");
		} else {
			System.out.println("Par");
		}
		
		scanner.close();
	}
}

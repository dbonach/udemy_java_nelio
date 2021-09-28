package section1_to_7;
import java.util.Scanner;

public class ex24 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		int total = 1;
		
		for (int i = 1; i <= num; i++) {
			total *= i;
		}
		
		System.out.println(total);
		
		scanner.close();
	}
}

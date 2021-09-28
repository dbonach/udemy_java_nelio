package section1_to_7;
import java.util.Scanner;

public class ex23 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		for (int i = 0; i < num; i++) {
			int first = scanner.nextInt();
			int second = scanner.nextInt();
			
			if (second != 0) {
				System.out.println(1.0 * first/second);
			} else {
				System.out.println("Divisao impossivel");
			}
		}
		
		scanner.close();
	}
}

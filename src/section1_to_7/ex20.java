package section1_to_7;
import java.util.Scanner;

public class ex20 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		for (int i = 1; i <= num; i += 2) {
			System.out.println(i);
		}
		
		scanner.close();
	}
}

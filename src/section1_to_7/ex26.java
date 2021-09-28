package section1_to_7;
import java.util.Scanner;

public class ex26 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
			System.out.print(i*i + " ");
			System.out.println(i*i*i + " ");
		}
		
		scanner.close();
	}
}

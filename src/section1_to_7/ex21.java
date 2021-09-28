package section1_to_7;
import java.util.Scanner;

public class ex21 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int in = 0;
		int out = 0;
		int num = scanner.nextInt();
		
		for (int i = 0; i < num; i++) {
			int valor = scanner.nextInt();
			
			if (valor >= 10 && valor <= 20) {
				in++;
			} else {
				out++;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		scanner.close();
	}
}

package section1_to_7;
import java.util.Scanner;

public class ex11 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int inicio = scanner.nextInt();
		int fim = scanner.nextInt();
		
		if (fim > inicio) {
			System.out.println("O jogo durou " + (fim - inicio) + " hora(s)");
		} else {
			System.out.println("O jogo durou " + (24 - inicio + fim) + " hora(s)");
		}
		
		scanner.close();
	}
}

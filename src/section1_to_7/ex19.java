package section1_to_7;
import java.util.Scanner;

public class ex19 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int num = -1;
		
		while (num != 4) {
			if (num == 1) {
				alcool++;
			} else if (num == 2) {
				gasolina++;
			} else if (num == 3) {
				diesel++;
			}
			
			num = scanner.nextInt();
		}
		
		System.out.println("Muito obrigado!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		scanner.close();
	}
}

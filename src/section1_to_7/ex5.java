package section1_to_7;
import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numFuncionario;
		int numHorasTrabalhadas;
		double valorPorHora;
		
		numFuncionario = scanner.nextInt();
		numHorasTrabalhadas = scanner.nextInt();
		valorPorHora = scanner.nextDouble();
		
		System.out.println("Number: " + numFuncionario);
		System.out.printf("Salary: U$ %.2f%n", valorPorHora * numHorasTrabalhadas);
		
		scanner.close();
	}
}

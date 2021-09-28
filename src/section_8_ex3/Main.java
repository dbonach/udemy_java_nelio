package section_8_ex3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do aluno: ");
		String name = sc.nextLine();
		
		System.out.println("Insira as notas: ");
		double score1 = sc.nextDouble();
		double score2 = sc.nextDouble();
		double score3 = sc.nextDouble();
		
		Student student = new Student(name, score1, score2, score3);
		
		student.printFinalResults();
		
		sc.close();
	}
}

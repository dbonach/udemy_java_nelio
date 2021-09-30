package section_14_ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Pessoa> pessoas = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int numberPayers = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < numberPayers; i++) {
			System.out.println();
			
			System.out.println("Tax payer #" + (i + 1) + " data:");
			System.out.print("Individual or company (i/c)? ");
			char individualOrCompany = sc.nextLine().toLowerCase().charAt(0);
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			sc.nextLine();
			
			if (individualOrCompany == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				sc.nextLine();
				
				pessoas.add(new PessoaFisica(name, anualIncome, healthExpenditures));
			}
			
			if (individualOrCompany == 'c') {
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				sc.nextLine();
				
				pessoas.add(new PessoaJuridica(name, anualIncome, numberEmployees));
			}
		}
		
		System.out.println();
		System.out.println("Taxes Paid:");
		
		Double totalTaxes = 0.0;
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getName() + ": $ " + String.format("%.2f", pessoa.tax()));
			totalTaxes += pessoa.tax();
		}
		
		System.out.println();
		System.out.println("Total Taxes: $ " + String.format("%.2f", totalTaxes));
		
		sc.close();
	}
}

package section_15_ex1;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter acccount data");
		
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Initial balance: ");
		Double initialBalance = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		sc.nextLine();
		
		Account account = new Account(number, holder, initialBalance, withdrawLimit);
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		Double amount = sc.nextDouble();
		sc.nextLine();
		
		try {
			account.withdraw(amount);
			System.out.print("New balance: " + String.format("%.2f", account.getBalance()));
		}
		catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		sc.close();
	}
}

package section_9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String owner = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char isThereInitialValue = sc.nextLine().toLowerCase().charAt(0);
		
		if (isThereInitialValue == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialValue = sc.nextDouble();
			account = new Account(number, owner, initialValue);
		} else {
			account = new Account(number, owner);
		}
		
		System.out.println("\nAccount data:");
		System.out.println(account);
		
		System.out.print("\nEnter a deposit value: ");
		double amount = sc.nextDouble();
		
		account.deposit(amount);
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.print("\nEnter a withdraw value: ");
		amount = sc.nextDouble();
		
		account.withdraw(amount);
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		sc.close();
	}
}

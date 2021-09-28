package section_8_ex2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		double salary = sc.nextDouble();
		
		System.out.print("Tax: ");
		double tax = sc.nextDouble();
		
		Employee employee = new Employee(name, salary, tax);
		
		System.out.println();
		System.out.println("Employee: " + employee.toString());
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");
		double increase = sc.nextDouble();
		
		employee.increaseSalary(increase);
		
		System.out.println();
		System.out.println("Updated data: " + employee.toString());
		
		sc.close();
	}
}

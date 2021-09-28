package section_10_ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<Employee>();
		
		System.out.print("How many employees will be registered? ");
		int totalEmployees = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < totalEmployees; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			employees.add(new Employee(id, name, salary));
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		Employee uniqueEmp = employees.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null);
		
		if (uniqueEmp != null) {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			
			uniqueEmp.increaseSalary(percentage);
		} else {
			System.out.println("This id does not exist!");
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee emp : employees) {
			System.out.println(emp);
		}
		
		sc.close();
	}
}

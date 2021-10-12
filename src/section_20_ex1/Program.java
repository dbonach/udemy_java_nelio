package section_20_ex1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Person> people = new ArrayList<>();
		
		String sourcePath = System.getProperty("user.dir")
				+ "/src/section_20_ex1/in.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourcePath))) {
			String line = br.readLine();
			
			while (line != null) {
				String[] personInfo = line.split(",");
				String name = personInfo[0];
				String email = personInfo[1];
				Double salary = Double.parseDouble(personInfo[2]);
				
				people.add(new Person(name, email, salary));
				
				line = br.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		System.out.print("Enter salary: ");
		Double salary = sc.nextDouble();
		
		
		System.out.println();
		System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary));
		
//		List<String> emails = people.stream()
//		.filter(person -> person.getSalary() > salary)
//		.map(person -> person.getEmail())
//		.collect(Collectors.toList());
		
//		emails.forEach(System.out::println);
		
		people.stream().filter(person -> person.getSalary() > salary)
		.map(person -> person.getEmail())
		.sorted()
		.forEach(System.out::println);
		
		System.out.println();
		System.out.print("Sum of salary from people whose name starts with 'M': ");
		
		Double salaryPeopleM = people.stream().filter(person -> person.getName().charAt(0) == 'M')
			.mapToDouble(person -> person.getSalary())
			.reduce(0.0, (acc, current) -> acc + current);
		
		System.out.printf("%.2f", salaryPeopleM);

		
		sc.close();
	}
}

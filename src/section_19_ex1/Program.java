package section_19_ex1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> courseA = new HashSet<>();
		Set<Integer> courseB = new HashSet<>();
		Set<Integer> courseC = new HashSet<>();
		
		addStudent("A", courseA, sc);
		addStudent("B", courseB, sc);
		addStudent("C", courseC, sc);
		
		Set<Integer> allStudents = new HashSet<>(courseA);
		
		allStudents.addAll(courseB);		
		allStudents.addAll(courseC);

			
		System.out.println("Total students: " + allStudents.size());
		
		sc.close();
	}
	
	public static void addStudent(String course, Set<Integer> students, Scanner sc) {
		
		System.out.print("How many students for course " + course + "? ");
		int studentsCourseA = sc.nextInt();
		
		for (int i = 0; i < studentsCourseA; i++) {
			int student = sc.nextInt();
			students.add(student);
		}
	}
	
	public static void printItems(Set<Integer> set) {
		for (Integer student: set) {
			System.out.println(student);
		}
	}
}

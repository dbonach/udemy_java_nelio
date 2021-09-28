package section_10_ex1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Room[] rooms = new Room[10];
		
		System.out.print("How many rooms will be rented? ");
		int roomsQuantity = sc.nextInt();
		sc.nextLine();
		
		int rentNumber = 1;
		
		for (int i = 0; i < roomsQuantity; i++) {
			System.out.println();
			System.out.println("Rent #" + rentNumber++);
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			sc.nextLine();
			
			rooms[roomNumber] = new Room(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.println(i + ": " + rooms[i]);
			}
		}
		
		sc.close();
	}
}

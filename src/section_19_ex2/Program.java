package section_19_ex2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> votes = new TreeMap<>();
		
		String sourcePath = System.getProperty("user.dir") 
				+ "/src/section_19_ex2/in.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourcePath))) {
			String line = br.readLine();
			
			while (line != null) {
				String[] voteInfo = line.split(",");
				String name = voteInfo[0];
				int voteNumber = Integer.parseInt(voteInfo[1]);
				
				if (votes.containsKey(name)) {
					voteNumber += votes.get(name);
				}
				
				votes.put(name, voteNumber);
				
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		for (String key : votes.keySet()) {
			System.out.println(key + ": " + votes.get(key));
		}
		
		sc.close();
	}
}

package section_8_ex3;

public class Student {

	public String name;
	public double score1;
	public double score2;
	public double score3;
	
	public Student(String name, double score1, double score2, double score3) {
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
	}
	
	public void printFinalResults() {
		double finalGrade = score1 + score2 + score3;
		
		System.out.printf("Final grade: %.2f%n", finalGrade);
		
		if (finalGrade >= 60.0) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("Missing %.2f points", 60.0 - finalGrade);
		}
	}
}

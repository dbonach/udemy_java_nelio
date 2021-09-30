package section_14_ex2;

public abstract class Pessoa {

	private String name;
	private Double anualIncome;
	
	public Pessoa(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}
	
	public String getName() {
		return name;
	}
	
	public Double getAnualIncome() {
		return anualIncome;
	}

	public abstract Double tax();
}

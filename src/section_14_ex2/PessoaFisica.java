package section_14_ex2;

public class PessoaFisica extends Pessoa {

	private Double healthExpenditures;
	
	public PessoaFisica(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		
		if (getAnualIncome() < 20000.00) { 
			return getAnualIncome() * 0.15 - healthExpenditures * 0.5;
		} else {
			return getAnualIncome() * 0.25 - healthExpenditures * 0.5;
		}
	}
}

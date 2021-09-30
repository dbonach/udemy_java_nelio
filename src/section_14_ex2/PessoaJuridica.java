package section_14_ex2;

public class PessoaJuridica extends Pessoa {

	private Integer numFuncionarios;

	public PessoaJuridica(String name, Double anualIncome, Integer numFuncionarios) {
		super(name, anualIncome);
		this.numFuncionarios = numFuncionarios;
	}

	@Override
	public Double tax() {
		
		if (numFuncionarios > 10) {
			return getAnualIncome() * 0.14;
		} else {
			return getAnualIncome() * 0.16;
		}
	}
}

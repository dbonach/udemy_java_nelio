package section_9;

public class Account {

	private int accountNumber;
	private String accountOwner;
	private double availableMoney;

	public Account(int accountNumber, String accountOwner, double initialValue) {
		this.accountNumber = accountNumber;
		this.accountOwner = accountOwner;
		deposit(initialValue);
	}

	public Account(int accountNumber, String accountOwner) {
		this.accountNumber = accountNumber;
		this.accountOwner = accountOwner;
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}

	public void deposit(double amount) {
		if (amount > 0.0) {
			availableMoney += amount;
		}
	}

	public void withdraw(double amount) {
		availableMoney -= 5.0 + amount;
	}
	
	@Override
	public String toString() {
		return "Account "
				+ accountNumber
				+ ", Holder: "
				+ accountOwner
				+ ", Balance: $ "
				+ String.format("%.2f", availableMoney);
 	}
}

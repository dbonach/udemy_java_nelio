package section_8_ex4;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double dollarToReal(double dollarPrice, double amount) {
		return amount * dollarPrice * (1 + IOF);
	}
}

package section_18_ex1.services;

public interface OnlinePaymentService {

	double paymentFee(double amount);
	double interest(double amount, int months);
}

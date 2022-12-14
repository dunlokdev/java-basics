package modules;

public class LoanAccount extends Account implements Withdraw {
	final double LOAN_ACCOUNT_WITHDRAW_FEE = 0.05;
	final double LOAN_ACCOUNT_WITHDRAW_PREMIUM_FEE = 0.01;
	final double LOAN_ACCOUNT_MAX_BALANCE = 100_000_000;

	public LoanAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean withDraw(double amount) {
		// TODO Auto-generated method stub
		double newBalance = 0.0;
		if (isAccepted(amount)) {

		}
		return false;
	}

	@Override
	public boolean isAccepted(double amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
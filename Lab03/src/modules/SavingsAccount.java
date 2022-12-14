package modules;

public class SavingsAccount extends Account implements ReportService, Withdraw {

	final double SAVINGS_ACCOUNT_MAX_WITHDRAW = 5_000_000;

	@Override
	public void log(double amount) {
		// TODO Auto-generated method stub

	}

	public SavingsAccount(String accountNumber, double balance) {
		super(accountNumber, balance);

	}

	@Override
	public boolean withDraw(double amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccepted(double amount) {
		// TODO Auto-generated method stub
		return false; // TODO Auto-generated constructor stub
	}
}
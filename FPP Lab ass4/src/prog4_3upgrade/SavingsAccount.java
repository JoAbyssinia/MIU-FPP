package prog4_3upgrade;

public class SavingsAccount extends Account {

	private static final double SAVING_INTEREST = 0.25;
	public SavingsAccount(Employee emp, double startbalance) {
		super(emp, startbalance);
	}
	
	public void updateAccount() {
		setBalance(super.getBalance() + (super.getBalance() * 0.25));
	}
	
	@Override
	public double getBalance() {
		double baseBalace = super.getBalance();
		double interset = (SAVING_INTEREST * baseBalace);
		return baseBalace + interset;
	}
	
	@Override
	public boolean makeWithdrawal(double amount) {
		if(getBalance() < amount) return false;
			
		setBalance(getBalance() - amount);
		return true;
	}
	
	
	
	
	public AccountType getAccountType() {
		return AccountType.SAVING;
	}

}

package prog4_3upgrade;

public class RetirementAccount extends Account {

	private static final double RETIRMENT_PENALITY = 0.02;
	public RetirementAccount(Employee emp, double startbalance) {
		super(emp, startbalance);
	}
	
	public void updateBalance() {
		setBalance(getBalance()- (getBalance()*0.02));
	}
	
	@Override
	public double getBalance() {
		double baseBalace = super.getBalance();
		double penality = (RETIRMENT_PENALITY * baseBalace);
		return baseBalace - penality;
	}
	
	public AccountType getAccountType() {
		return AccountType.RETIREMENT;
	}

}

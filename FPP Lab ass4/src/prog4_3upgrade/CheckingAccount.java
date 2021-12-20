package prog4_3upgrade;

public class CheckingAccount extends Account {

	private static final int MONTHLY_SERIVCE_CHARGE = 5;
	
	CheckingAccount(Employee emp, double startbalance) {
		super(emp , startbalance);
	}
	
	public void updateBalance() {
		setBalance(getBalance()-MONTHLY_SERIVCE_CHARGE);
	}
	
	
	@Override
	public double getBalance() {
		double balance = super.getBalance();
		
		return balance-MONTHLY_SERIVCE_CHARGE;
	}
	
	public AccountType getAcctType() {
		return AccountType.CHECKING;
	}

}

package prog4_7;

public class RetirementAccount extends Account {
	private final double PENALTY_PERCENT = 2.0;

	public RetirementAccount(Employee e, double startBalance){
		super(e,startBalance);
	}
	public RetirementAccount(Employee e){
		super(e);
	}	
	
	public boolean makeWithdrawal(double amount){
		double bal = getBalance();
		
		double penalty = bal * (PENALTY_PERCENT/100);
		bal = bal - amount - penalty;
		if(bal < 0){
			return false;
		}
		setBalance(bal);
		return true;
	}
	public AccountType getAcctType(){
		return AccountType.RETIREMENT;
	}	

}

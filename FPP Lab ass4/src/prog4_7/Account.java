package prog4_7;

import java.time.LocalDate;

abstract public class Account implements Comparable<Account> {
	private Employee emp;
	private double balance;

	@Override
	public int compareTo(Account a) {
		double e1 = this.getBalance();
		double e2 = a.getBalance();
		if(e1 == e2) {
			return 0;
		}else if(e1 < e2) {
			return -1;
		}else {
			return 1;
		}
	}
	Account(Employee e, double startBalance) {
		emp = e;
		balance = startBalance;
	}
	Account(Employee e) {
		this(e,0.0);
	}
	
	abstract public AccountType getAcctType();

	void makeDeposit(double amount){
		balance += amount;
	}
	boolean makeWithdrawal(double amount){
		if(amount > balance){
			return false;
		}
		if(getAcctType()==AccountType.RETIREMENT) {
			balance = balance - amount - (amount * 0.2);
		}else {
			balance -= amount;
		}
		return true;
	}
	double getBalance(){
		if(getAcctType() == AccountType.CHECKING) {
			updateBalance();
			return balance;
		}else if(getAcctType()== AccountType.SAVINGS) {
			updateBalance();
			return balance;
		}
		return balance;
	}
	/** used by subclasses only */
	void setBalance(double bal){
		balance = bal;
	}
	void updateBalance() {
		//by default do nothing
	}
	public Employee getEmp(){
		return emp;
	}
	private String newline = System.getProperty("line.separator");
	
	public String toString(){
		String ret =
			"Account type: "+getAcctType().toString().toLowerCase()+newline+
			"Current bal:  "+balance;
		return ret;
	}
}

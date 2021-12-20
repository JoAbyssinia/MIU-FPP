package prog3_2;



public class Account {
	
	private final static double DEFAULT_BALANCE = 0.0;
	
	private double balance;
	private AccountType acctType;
	private Employee employee;


	public Account(Employee emp, AccountType acctType, double balance) {
		employee = emp;
		this.acctType = acctType;
		this.balance = balance;
	}

	Account(Employee emp,  AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public double getBalance() {
		return balance;
	}

	public AccountType getAcctType() {
		return acctType;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAcctType(AccountType acctType) {
		this.acctType = acctType;
	}

	public String toString() {
		return "Account type = " + acctType + "\nCurrent Balance = " + balance;
	}
	
	public void makeDeposit(double deposit) {
		this.balance += deposit;		
	}

	public boolean makeWithdrawal(double amount) {
		if(amount < getBalance()) {
			this.balance -=amount;
			return true;
		}
		
		return false;
	}
}

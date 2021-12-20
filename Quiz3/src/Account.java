
public class Account implements Comparable<Account>{
	private int accountNumber;
	private String name;
	private double balance;
	
	public Account() {
		this.accountNumber = 654124;
		this.name = "Jeremy Menard";
		this.balance = 465.8;
	}
	
	public Account(int accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}

	@Override
	public int compareTo(Account o) {
		return name.compareTo(o.getName());
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Account)) return false;
		Account a = (Account) obj;
		return name.equals(a.getName());
	}
	
	
	
}


public class Checking extends Account {
	private String interestType;
	
	public Checking() {
		super(568897, "Noura Jones", 40.4);
		this.interestType = "Yearly";
	}

	public Checking(int accountNumber, String name, double balance, String interestType) {
		super(accountNumber, name, balance);
		this.interestType = interestType;
	}

	public String getInterestType() {
		return interestType;
	}

	public void setInterestType(String interestType) {
		this.interestType = interestType;
	}

	@Override
	public String toString() {
		return super.toString() + " Checking [interestType=" + interestType + "]";
	}

	@Override
	public int compareTo(Account o) {
		return (int) (super.getBalance() - o.getBalance());
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Account)) return false;
		Account c = (Account) obj;
		return super.getBalance() == c.getBalance();
	}
	
	
}

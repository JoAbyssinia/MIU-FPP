
public class Savings extends Account{
	private float interest;
	
	public Savings() {
		super(653214, "Haley Mcduff", 78.6);
		this.interest = 1.5f;
	}

	public Savings(int accountNumber, String name, double balance, float interest) {
		super(accountNumber, name, balance);
		this.interest = interest;
	}

	public float getInterest() {
		return interest;
	}

	public void setInterest(float interest) {
		this.interest = interest;
	}

	@Override
	public String toString() {
		return super.toString() + " Savings [interest=" + interest + "]";
	}
	
	
}

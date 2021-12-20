
public class Retirement extends Account{
	private String retirementPlan;
	
	public Retirement() {
		super(568897, "Jora Dones", 344.4);
		this.retirementPlan = "Full";
	}

	public Retirement(int accountNumber, String name, double balance, String retirementPlan) {
		super(accountNumber, name, balance);
		this.retirementPlan = retirementPlan;
	}

	public String getRetirementPlan() {
		return retirementPlan;
	}

	public void setRetirementPlan(String retirementPlan) {
		this.retirementPlan = retirementPlan;
	}

	@Override
	public String toString() {
		return super.toString() + " Retirement [retirementPlan=" + retirementPlan + "]";
	}
	
	
}

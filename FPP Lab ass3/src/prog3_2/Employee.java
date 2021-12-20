package prog3_2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.GregorianCalendar;



public class Employee {
	// instance fields

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;

	private String name;
	private String nickName;
	private double salary;
	private LocalDate hireDay;
	
	// constructor
	public Employee(String aName, int aYear, int aMonth, int aDay ) {
		name = aName;
		hireDay  = LocalDate.of(aYear, aMonth, aDay);	
	}

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}

	public void createNewChecking(double startAmount) {
		checkingAcct = new Account(this, AccountType.CHECKING,startAmount);
	}
	
	public void createNewSavings(double startAmount) {
		savingsAcct = new Account(this, AccountType.SAVING, startAmount );
	}
	
	public void createNewRetirement(double startAmount) {
		retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
	}
	
	public void deposit (AccountType accountType, double amt ) {
		switch (accountType) {
		case  SAVING: 
			savingsAcct.setBalance(amt);
			break;
		case CHECKING:
			checkingAcct.setBalance(amt);
			break;
		case RETIREMENT: 
			retirementAcct.setBalance(amt);
			break;
		}
	}
	
	public void withdraw(AccountType accountType, double amt) {
		switch (accountType) {
		case  SAVING: 
			savingsAcct.makeWithdrawal(amt);
			break;
		case CHECKING:
			checkingAcct.makeWithdrawal(amt);
			break;
		case RETIREMENT: 
			retirementAcct.makeWithdrawal(amt);
			break;
		}
	}
	
	public String getFormattedAcctInfo() {
		String info="";
		
			if(savingsAcct !=null) {
				info += String.format("%s%n", savingsAcct);
			}
			if(checkingAcct !=null) {
				info += String.format("%s%n", checkingAcct);
			}
			if(retirementAcct !=null) {
				info += String.format("%s%n",retirementAcct);
			}
		
		return info;
	}
	
	
	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	private String format = "name = %s, salary = %.2f, hireDay = %s";
	
	public String toString() {
		return String.format(format, name, salary,(hireDay));
	}
	
	
}

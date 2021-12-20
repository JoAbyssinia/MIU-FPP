package prog4_3upgrade;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.GregorianCalendar;

import prog4_3.MyStringList;
import prog4_3upgrade.AccountList;



public class Employee {
	// instance fields

	private AccountList accList;

	private String name;
	private LocalDate hireDay;
	
	// constructor
	public Employee(String aName, int aYear, int aMonth, int aDay ) {
		name = aName;
		hireDay  = LocalDate.of(aYear, aMonth, aDay);	
		
		accList = new AccountList();
	}

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

//	public String getNickName() {
//		return nickName;
//	}
//
//	public void setNickName(String nickName) {
//		this.nickName = nickName;
//	}
//
//	public double getSalary() {
//		return salary;
//	}
//	
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}

	public LocalDate getHireDay() {
		return hireDay;
	}

	public void createNewChecking(double startAmount) {
		Account acc = new Account(this, startAmount);
		accList.add(acc);
	}
	
	public void createNewSavings(double startAmount) {
		Account acc = new Account(this, startAmount);
		accList.add(acc);
	}
	
	public void createNewRetirement(double startAmount) {
		Account acc = new Account(this, startAmount);
		accList.add(acc);
	}
	
	public void deposit (int accountIndex, double amt ) {
		Account selected = accList.get(accountIndex);
		selected.makeDeposit(amt);
	}
	
	public boolean withdraw(int accountIndex, double amt) {
		boolean withdrawSuccesssful = false;
		Account selected = accList.get(accountIndex);
		withdrawSuccesssful = selected.makeWithdrawal(amt);
		
		if(withdrawSuccesssful)
			System.out.println("Withdrawal successful");
		else
			System.out.println("Sorry. No enough funds available.");
		
		return withdrawSuccesssful;
		
	}
	
	public String getFormattedAcctInfo() {
		String info="";
		
			for(int i=0; i < accList.size(); i++) {
				
				if(accList.get(i) !=null) {
				info += String.format("%s%n", accList.get(i).toString());
				}
			}
		
		return info;
	}
	
	
//	public void raiseSalary(double byPercent) {
//		double raise = salary * byPercent / 100;
//		salary += raise;
//	}
	private String format = "name = %s,hireDay = %s";
	
	public String toString() {
		return String.format(format, name,(hireDay));
	}
	
	public MyStringList getNamesOfAccounts() {
		MyStringList acctNameList = new MyStringList();
		for(int i = 0; i < accList.size(); ++i) {
			acctNameList.add(accList.get(i).getAcctType().toString());
		}
		return acctNameList;
	}
	
	
}

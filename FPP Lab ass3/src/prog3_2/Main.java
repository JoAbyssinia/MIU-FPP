package prog3_2;

import java.util.Scanner;

public class Main {
	Employee[] emps = null; 
	public static void main(String[] args) {
		
		new Main();
	
	}
	
	Main(){
	emps = new Employee[3];
		
		emps[0] = new Employee("Yohannes",2020,9,9);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2,13);
		
		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("See a report of all account balances? (y/n) ");
		
		if(((String)sc.next()).equals("y")) {
			String info = getFormattedAccountInfo();
			System.out.println(info);
		
		}else {
			System.out.println("oops :( ");
		}
		
		sc.close();
	}

	private String getFormattedAccountInfo() {
		String info = "";
		
		for (Employee e : emps) {
			info +=String.format("%nACCOUNT INFO FOR %s: %n %n", e.getName()); 
			info +=  e.getFormattedAcctInfo();
		}
		return info;
	}
	
	
	
}

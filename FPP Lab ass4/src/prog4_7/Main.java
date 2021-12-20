package prog4_7;
import java.util.Arrays;
import java.util.Scanner;

import prog4_3.employeeinfo.Account;
import prog4_3.employeeinfo.AccountList;
import prog4_3.employeeinfo.Employee;

public class Main {

	Employee[] emps;
	
	private AccountList accounts;
	
	public static void main(String[] args) {
		new Main();
	}
	Main(){
		
		
	accounts = new AccountList();
//	accounts.add(new Account(new Employee("Jim Daley", 2000, 9, 4),15000));
		
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2,13);
		
//		Arrays.sort(emps);
		
		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);
		
		//using Comparable implementation on Employee 
		//to sort emps 
//		System.out.println("yes");
//		Arrays.sort(emps);
		int employee;
		int accountNumber;
		Scanner in = new Scanner(System.in);
		System.out.println("A. See a report of all accounts.\r\n"
				+ "B. Make a deposit.\r\n"
				+ "C. Make a withdrawal.\r\n"
				+ "Make a selection (A/B/C):");
		switch(in.next()) {
		case "a":
		case "A":
			
			for(int i=0; i<emps.length; i++) {
				System.out.println();
				
				System.out.println("ACCOUNT INFO FOR "+ emps[i].getName());
				System.out.println();
//				System.out.println(emps[i].getNamesOfAccounts());
				System.out.println(emps[i]);
//				for(int j=0; j < emps[i].getNamesOfAccounts().size(); j++) {
//					System.out.println("Account type: " + emps[j].getNamesOfAccounts().get(j) );
//					System.out.println(" "+emps[j]);
//				}
				
//				System.out.println("Account Balance: " + emps[i]);
//				
//				System.out.println("Account type: " + emps[i].getAccountTypeSaving());
//				System.out.println("Account Balance: " + emps[i].getBalaceSaving());
//				
//				System.out.println("Account type: " + emps[i].getAccountTypeRetirement());
//				System.out.println("Account Balance: " + emps[i].getBalaceRetirement());
			}
			
			break;
		case "B":
		case "b":
			for(int i=0; i<emps.length; i++) {
				System.out.println(i+". "+emps[i].getName());
			}
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Select an employee: (type a number) ");
				 employee = sc.nextInt();
					
				 	for(int i=0; i <emps[employee].getNamesOfAccounts().size(); i++ ) {
				 		System.out.println(i+" "+emps[employee].getNamesOfAccounts().get(i));
				 	}
					System.out.println("Select an account: (type a number) ");
					accountNumber = sc.nextInt();
					
					System.out.println("Deposit amount: "+emps[employee].getNamesOfAccounts().get(accountNumber));
					
			break;
		case "c":
		case "C":
			
			break;
			default:
				System.out.println("choose only A,B,C... ");
		}
		
		System.out.println(Arrays.toString(emps));
		
	}

}










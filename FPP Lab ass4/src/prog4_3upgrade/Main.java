package prog4_3upgrade;

import java.util.Iterator;
import java.util.Scanner;

import prog4_3.MyStringList;

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
		System.out.println("A. See a report of all accounts.\r\n"
				+ "B. Make a deposit.\r\n"
				+ "C. Make a withdrawal.");
		System.out.println("Make a selection (A/B/C): ");
		String input = sc.next();
		if(input.equals("a")) {
			String info = getFormattedAccountInfo();
			System.out.println(info);
		sc.close();
		}else if(input.equals("b")) {
			
			for(int i=0; i< emps.length; i ++) {
				System.out.println(i+" "+emps[i].getName()  );
			}
			
			System.out.println("Select an employee: (type a number)");
			
			Scanner in1 = new Scanner(System.in);
			
			String inp =  in1.next();
			if(inp.equals("0")) {
				accountInfoFetcher(inp);
			} else if(inp.equals("1")) {
				accountInfoFetcher(inp);
			} else if(inp.equals("2")) {
				accountInfoFetcher(inp);
			}
		
		in1.close();
		sc.close();
		}else if(((String)sc.next()).equals("c")) {
			
			
		
		} else {
			System.out.println("oops :( ");
		}
		
		
		
		sc.close();
	}

	private void accountInfoFetcher(String index) {
//		MyStringList accLst = emps[Integer.parseInt(index)].getNamesOfAccounts();
//			for(int i=0; i < accLst.size(); i ++ ) {
//				System.out.println(i + ". " + accLst.get(i));
//			}
//			
//			System.out.println("Select an account: (type a number)");
		
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

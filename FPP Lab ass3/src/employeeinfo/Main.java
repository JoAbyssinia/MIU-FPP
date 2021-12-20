package employeeinfo;


public class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee("Yohannes","john",20000,2020,9,9);
		Account checking = new Account(e1, AccountType.CHECKING,300);
		Account saving = new Account(e1, AccountType.SAVING,300);
		Account retirment = new Account(e1, AccountType.RETIREMENT,300);
		
		System.out.println(checking);
		System.out.println(saving);
		System.out.println(retirment);
		
	}
}

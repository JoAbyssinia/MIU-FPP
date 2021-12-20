import java.util.Arrays;
import java.util.Comparator;

public class Tester {

	class accountNumberAscending implements Comparator<Account>{

		@Override
		public int compare(Account o1, Account o2) {
			return o1.getAccountNumber() - o2.getAccountNumber();
		}
		
	}
	
	static class accountNumberDescending implements Comparator<Account>{

		@Override
		public int compare(Account o1, Account o2) {
			return (o1.getAccountNumber() - o2.getAccountNumber()) * -1;
		}
	}
	
	public static void main(String[] args) {
		Checking c = new Checking();
		Checking c2 = new Checking(234241,"Anderson", 50, "Monthly");
		Savings s = new Savings();
		Retirement r = new Retirement();
		Savings s2 = new Savings(21231, "Some name", 40.4, 60);
		
		Account[] arr = {c, c2, s, r};
		printer(arr);
		Arrays.sort(arr);
		printer(arr);
		
		sortByNameDescending sbnd = new sortByNameDescending();
		Arrays.sort(arr, sbnd);
		printer(arr);
		Arrays.sort(arr, new sortByBalanceDescending());
		printer(arr);
		Arrays.sort(arr, new Comparator<Account>() {

			@Override
			public int compare(Account o1, Account o2) {
				
				return (int) (o1.getBalance() - o2.getAccountNumber()) * -1 ;
			}
		});
		printer(arr);
		
		System.out.println(c.compareTo(s2));
		System.out.println(c.equals(s2));
//		Local class
		class balanceAscending implements Comparator<Account>{

			@Override
			public int compare(Account o1, Account o2) {
				return (int) (o1.getBalance() - o2.getBalance());
			}
			
		}
		
		Tester t = new Tester();
		accountNumberAscending ana = t.new accountNumberAscending();
		Arrays.sort(arr, ana);
		printer(arr);
		
		accountNumberDescending and = new accountNumberDescending();
		Arrays.sort(arr, and);
		printer(arr);
			
		balanceAscending ba = new balanceAscending();
		Arrays.sort(arr, ba);
		printer(arr);
		
		Arrays.sort(arr, new Comparator<Account>() {

			@Override
			public int compare(Account o1, Account o2) {
				return (int) ((o1.getBalance() - o2.getBalance()) * -1);
			}
			
		});
		printer(arr);
	}
	
	static void printer(Account[] accounts) {
		for(Account a : accounts) {
			System.out.println(a);
		}
		
		System.out.println("******************************\n\n*******************************");
	}

}

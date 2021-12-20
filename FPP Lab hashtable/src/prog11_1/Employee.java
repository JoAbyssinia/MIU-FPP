package prog11_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Employee {
	private String firstName;
	private String lastName;
	private HashMap<String, Double> salaryRecord;
	
	public Employee() {
		salaryRecord = new HashMap<String, Double>();
	}
	
	public void addEntry(String date, double salary) {
		
		salaryRecord.put(date, salary);
	}
	public void printPaymentAmount(String date) {
		
		String fullname = getFirstName()+" "+getLastName();
		
		if(salaryRecord.get(date)==null) {
			System.out.println(fullname +" does not receive a paychack on "
					+date);
		}else {
		System.out.println(fullname +" was paid "+salaryRecord.get(date)+" on "
	+date);
		}
		
	}
	public void printAveragePaycheck() {
		double total = 0;
		int no = 0;
		for (Entry<String, Double> sel : salaryRecord.entrySet()) {
			total += sel.getValue();
			no++;
		}
		
		System.out.println("Average paycheck for Jim Jones was "+(total/no));
		
		
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setFirstName("Jim");
		e.setLastName("Jones");
		for(int i = 1; i <= 12; ++i) {
			e.addEntry(i+"/15/2011", 3070+5*i);
		}
		e.printPaymentAmount("5/15/2011");
		e.printPaymentAmount("5/15/2010");
		e.printAveragePaycheck();
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}

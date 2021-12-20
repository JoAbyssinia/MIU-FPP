package employeesort;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {

	private String name;
	private Date hireDate;
	private int salary;
	
	public Employee(String name, int salary, int year, int month, int day){
		this.name = name;
		this.salary = salary;
		GregorianCalendar cal = 
			new GregorianCalendar(year,month,day);
		hireDate= cal.getTime();
	}

	public Date getHireDate() {
		return (Date)hireDate.clone();
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	
	
	@Override
	public final boolean equals(Object o){
		if(o==null) return false;
		if(o.getClass() != this.getClass()) {
			return false;
		}
		Employee e = (Employee)o;
		return (e.getName().equals(name)&& 
				e.getHireDate().equals(hireDate) &&
				e.getSalary()== salary);
	}
	
	@Override
	public String toString() {
		String newline = System.getProperty("line.separator");
		return newline+"EMPLOYEE "+name+newline+
				"Date of Hire: "+hireDate+newline+
				"Salary: "+salary+newline;
	}

	

}

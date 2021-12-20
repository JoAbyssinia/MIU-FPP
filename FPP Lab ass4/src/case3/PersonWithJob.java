package case3;

import java.util.GregorianCalendar;

public class PersonWithJob extends Person {

	private double salery;
	public PersonWithJob(String name, GregorianCalendar dateOfBirth, double salery) {
		super(name, dateOfBirth);
		this.salery = salery;
	}
	
	public double getSalery() {
		return salery;
	}

}

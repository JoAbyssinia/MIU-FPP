package case1;

import java.util.GregorianCalendar;
import java.util.Objects;

public class PersonWithJob extends Person {

	private double salery;
	public PersonWithJob(String name, GregorianCalendar dateOfBirth, double salery) {
		super(name, dateOfBirth);
		this.salery = salery;
	}
	
	public double getSalery() {
		return salery;
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		PersonWithJob p = (PersonWithJob) obj;
		return Objects.equals(getSalery(), p.getSalery());
	}
}

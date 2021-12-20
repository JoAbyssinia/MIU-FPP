package case2;

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
	public boolean equals(Object obj) {
	
		if(!(obj instanceof Person)) return false;
		
		PersonWithJob p = (PersonWithJob)obj;
		return Objects.equals(p.getName(), this.getName()) && 
				Objects.equals(p.getDateOfBirth(), getDateOfBirth()) && Objects.equals(this.salery, p.salery);
		
		
	}
}

package case2;

import java.util.GregorianCalendar;
import java.util.Objects;

public class Person {
	public String name;
	private GregorianCalendar dateOfBirth;
	public Person(String name, GregorianCalendar dateOfBirth) {
		
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}
	public String getName() {
		return name;
	}
	public GregorianCalendar getDateOfBirth() {
		return dateOfBirth;
	}
	
	@Override
	public boolean equals(Object obj) {
	
		if(!(obj instanceof Person)) return false;
		
		Person p = (Person)obj;
		return Objects.equals(p.getName(), this.getName()) && 
				Objects.equals(p.getDateOfBirth(), getDateOfBirth());
		
		
	}
	
	
	
	
}

package case3;

import java.util.GregorianCalendar;
import java.util.Objects;

public class Person {
	private String name;
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
		if (!(obj instanceof Person)) return false;
		if (obj == null) return false;
		
//		Person p = (Person) obj;
//			
//		boolean isEquals = p.getName().equals(this.name);
//		boolean isEqualsBD = p.getDateOfBirth().equals(this.dateOfBirth);
//		
		Person other = (Person) obj;
		return Objects.equals(dateOfBirth, other.dateOfBirth) && Objects.equals(name, other.name);
	}
}

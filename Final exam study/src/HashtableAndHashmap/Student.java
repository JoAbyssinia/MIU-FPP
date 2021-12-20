package HashtableAndHashmap;

import java.util.Objects;

public class Student {

		String name;
		int ID;
		
	public Student(String name, int ID) {
		this.name = name;
		this.ID= ID;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getName(),getID());
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null ) return false;
		if(!(obj instanceof Student)) {
			return false;
		}
		Student st = (Student) obj;
		return getName().equals(st.getName()) && getID()== st.getID();
		
	}

	@Override
	public String toString() {
		return "name: " +getName()+", ID: "+getID();
	}
	
	
	
	
}

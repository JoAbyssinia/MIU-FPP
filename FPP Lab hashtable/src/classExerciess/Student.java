package classExerciess;

import java.util.Objects;

public class Student {

	String fullname;
	int id;
	
	Student(String name, int id){
		this.fullname = name;
		this.id= id;
	} 
	
	
	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return fullname+" "+id;
	}
	
	@Override
	public int hashCode() {
		return  Objects.hash(fullname,id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student)) return false;
		Student stu = (Student) obj;
		return getFullname().equals(stu.getFullname()) && getId() == stu.getId();
	}
	
}

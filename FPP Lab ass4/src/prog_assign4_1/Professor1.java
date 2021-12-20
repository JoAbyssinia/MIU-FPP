package prog_assign4_1;

import java.time.LocalDate;

public class Professor1 extends DeptEmployee1 {

	int numberOfPublications;
	public Professor1(String name, double salery, LocalDate hireDate,int numberOfPublications) {
		super(name, salery, hireDate);
		this.numberOfPublications = numberOfPublications;
		
	}
	public int getNumberOfPublications() {
		return numberOfPublications;
	}
	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}

	
	
}

package prog_assign4_1;

import java.time.LocalDate;

public class Professor extends DeptEmployee {

	int numberOfPublishing;

	public Professor(String name, LocalDate date,int numberOfpublishing, int salery) {
		this.name = name;
		this.hireDate = date;
		this.numberOfPublishing = numberOfpublishing;
		this.salery = salery;
	}
	
	public int getNumberOfPublishing() {
		return numberOfPublishing;
	}

	public void setNumberOfPublishing(int numberOfPublishing) {
		this.numberOfPublishing = numberOfPublishing;
	}
	
	
}

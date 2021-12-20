package prog_assign4_1;

import java.time.LocalDate;
import java.util.Date;

public class DeptEmployee {
	String name;
	int salery;
	LocalDate hireDate;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public LocalDate getHireDate() {
		return hireDate;
	}
	
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public int computeSalary() {
		return this.salery;
	}
	
}

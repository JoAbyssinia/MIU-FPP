package prog_assign4_1;

import java.time.LocalDate;

public class DeptEmployee1 {

	String name;
	double salery;
	LocalDate hireDate;
	public DeptEmployee1(String name, double salery, LocalDate hireDate) {
		this.name = name;
		this.salery = salery;
		this.hireDate = hireDate;
	}
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
	
	public double computeSalary() {
		return salery;
	}
	
	
}

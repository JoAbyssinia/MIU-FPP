package prog_assign4_1;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {

	double overTimeHoure;
	
	public Secretary(String name, LocalDate date, int overTimeHoure, int salery) {
		this.name = name;
		this.hireDate = date;
		this.overTimeHoure = overTimeHoure;
		this.salery = salery;
	}
	
	public double getOverTimeHoure() {
		return overTimeHoure;
	}

	public void setOverTimeHoure(double overTimeHoure) {
		this.overTimeHoure = overTimeHoure;
	}

	@Override
	public int computeSalary() {
		return salery += 12*overTimeHoure;
	}
}

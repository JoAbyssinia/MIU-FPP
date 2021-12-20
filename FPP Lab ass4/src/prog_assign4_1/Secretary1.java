package prog_assign4_1;

import java.time.LocalDate;

public class Secretary1 extends DeptEmployee1 {
	int overtimeHours;
	public Secretary1(String name, double salery, LocalDate hireDate, int overtimeHours) {
		super(name, salery, hireDate);
		this.overtimeHours = overtimeHours;
		
	}
	public int getOvertimeHours() {
		return overtimeHours;
	}
	public void setOvertimeHours(int overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	
	@Override
	public double computeSalary() {
		return super.computeSalary() + (12 * overtimeHours);
	}
}

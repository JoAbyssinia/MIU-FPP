package prog_assign4_1;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		DeptEmployee p1 = new Professor("Yohannne K yimam", LocalDate.now(), 10, 10000);
		Professor p2 = new Professor("Amanuel K Yimam", LocalDate.now(), 10,11000);
		Professor p3 = new Professor("Daniel Sahele", LocalDate.now(), 10,10000);
		Secretary s1 = new Secretary("jerry",LocalDate.now(),200, 5000);
		Secretary s2 = new Secretary("leeza",LocalDate.now(),200, 6000);
		DeptEmployee[] department = new DeptEmployee[5];
			
		department[0] = p1;
		department[1] = p2;
		department[2] = p3;
		department[3] = s1;
		department[4] = s2;
		
		System.out.println("would you see the salary Y/N");
		Scanner in = new Scanner(System.in);
		if(in.next().equalsIgnoreCase("y")) {
			System.out.println(" Total selery of all employees "+totalSalery(department));
		}		
	}

	private static int totalSalery(DeptEmployee[] department) {
		int totalSalery = 0;
		for (DeptEmployee deptEmployee : department) {
			totalSalery =+ deptEmployee.computeSalary();
		}
		return totalSalery;
	}
}

package prog_assign4_1;

import java.time.LocalDate;
import java.util.Scanner;

public class Main1 {
	
	
	public static void main(String[] args) {
		
		Professor1 pro1 = new Professor1("mohammed",12000 ,LocalDate.of(2020, 12,12), 10);
		Professor1 pro2 = new Professor1("payman",12000 ,LocalDate.of(2020, 12,12), 10);
		Professor1 pro3 = new Professor1("asaad",12000 ,LocalDate.of(2020, 12,12), 10);
		
		Secretary1 sec1 = new Secretary1("Mariya", 5000, LocalDate.of(2021, 4, 4), 200);
		Secretary1 sec2 = new Secretary1("juleat", 4500, LocalDate.of(2021, 4, 4), 200);
		
		DeptEmployee1[] dept = {pro1,pro2,pro3,sec1,sec2};
		
		Scanner in = new Scanner(System.in);
		System.out.println("need to see some of all salerys? y/n");
		String respos = in.next();
		if( respos.equals("y")) {
		
			int sums=0;
			
			for (DeptEmployee1 d : dept) {
				sums += d.computeSalary();
			}
			
			System.out.println("Total salary is "+ sums);
			
		}
		
	}
	
}

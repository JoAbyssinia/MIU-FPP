package employeesort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeSort {

		
	public static void main(String[] args) {
		new EmployeeSort();

	}
	public EmployeeSort() {
		Employee[] empArray =
			{new Employee("George", 40000, 1996,11,5),
			 new Employee("Dave", 50000, 2000, 1, 3),
			 new Employee("Richard", 45000, 2001, 2, 7)};
		List<Employee> empList = Arrays.asList(empArray);
		NameComparator nameComp = 
			new NameComparator();
		Collections.sort(empList, nameComp);
		System.out.println(empList);
		System.out.println("===========================");
		SalaryComparator compareBySalary = new SalaryComparator();
		Collections.sort(empList,compareBySalary);
		System.out.println(empList);
		System.out.println("===========================");
		HireDateComparator compareByhireDate = new HireDateComparator();
		Collections.sort(empList,compareByhireDate);
		System.out.println(empList);
	}

}

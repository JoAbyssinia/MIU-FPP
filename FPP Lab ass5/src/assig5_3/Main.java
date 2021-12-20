package assig5_3;

import java.util.Arrays;

public class Main {
	
	
	public static void main(String[] args) {
		
		String[] test = {"john","yohannes","Amanual","genet"};
		
//		StringLengthComparator slc = new StringLengthComparator();
		
		StringSort stringSort = new StringSort(new StringLengthComparator());
		
		stringSort.stringSort(test);
		
//		stringSort.test();
		System.out.println(Arrays.toString(test));
		
	}
}

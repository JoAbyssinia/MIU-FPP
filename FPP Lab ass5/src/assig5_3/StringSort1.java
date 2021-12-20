package assig5_3;

import java.util.Arrays;
import java.util.Comparator;

public class StringSort1  {

	Comparator<String> myComparator;
	public StringSort1(Comparator<String> myComparator ) {
		this.myComparator = myComparator;
	}
	
	public String[] stringSort(String[] arr) {
		Arrays.sort(arr,myComparator);
		return arr;
	}
}

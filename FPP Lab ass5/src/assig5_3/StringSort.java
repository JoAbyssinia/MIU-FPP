package assig5_3;

import java.util.Arrays;
import java.util.Comparator;

public class StringSort  {

	Comparator<String> comparator;
	
	StringSort( Comparator<String> myComparator ){
		comparator = myComparator;
	}
	
	public String[] stringSort(String[] arr) {
		
		Arrays.sort(arr,comparator);
		return arr;
	}

}

package assig5_3;

import java.util.Arrays;
import java.util.Comparator;

public class MainAnonymous {

	public static void main(String[] args) {
		
		String[] test = {"john","yohannes","Amanual","genet"};
		
		StringSort ss = new StringSort(new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
			
				return (o1.length() - o2.length()) *-1;
			}
		});
	
		ss.stringSort(test);
		
		System.out.println(Arrays.toString(test));
	}
}

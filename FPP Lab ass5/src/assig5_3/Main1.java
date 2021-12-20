package assig5_3;

import java.util.Arrays;
import java.util.Comparator;

public class Main1 {

	public static void main(String[] args) {
		
		String[] names = {"john","Amanual","Genet"};
		
//		StringSort1 sort1 = new StringSort1(new Comparator<String>() {
//			
//			@Override
//			public int compare(String o1, String o2) {
//				
//				return o1.length() - o2.length();
//			}
//		});
//		Lamda expretion. 
		StringSort1 sort1 = new StringSort1((s1,s2)-> s1.length() - s2.length() ); 
		sort1.stringSort(names);
		
		System.out.println(Arrays.toString(names));
		
	}
}

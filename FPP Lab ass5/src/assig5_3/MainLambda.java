package assig5_3;

import java.util.Arrays;

public class MainLambda {

	public static void main(String[] args) {
		
		String[] test = {"john","yohannes","Amanual","genet"};
		
		StringSort ss = new StringSort((s1,s2) -> s1.length() - s2.length() );
		ss.stringSort(test);
		System.out.println(Arrays.toString(test));	
	}
}

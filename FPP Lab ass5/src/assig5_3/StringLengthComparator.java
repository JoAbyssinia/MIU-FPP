package assig5_3;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s1.length() - s2.length(); 
	}
	
	
	public void test() {
		System.out.println("yes");
	}
		
}

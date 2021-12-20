package prog11_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Schur {

	boolean checkForSum(List<Integer> list, Integer z) {
		
		Set<Integer> inOrder = new HashSet<>();
		
		for(Integer n : list ) {
			inOrder.add(n);
		}
		
		for(Integer n :inOrder ) {
			int dif = z-n;
			
			if(list.contains(dif)) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Schur sh = new Schur();
		List<Integer> data = new ArrayList<Integer>();
		data.add(1);
		data.add(2);
		data.add(4);
		data.add(5);
		
		System.out.println(sh.checkForSum(data, 6));
	}
}

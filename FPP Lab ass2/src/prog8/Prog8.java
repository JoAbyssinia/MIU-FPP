package prog8;

public class Prog8 {
	
	
	static int min(int[] arrayOfInts) {
	int minS = arrayOfInts[0];
	
		
		for (int i : arrayOfInts) {
			if(minS > i) {
				minS = i;
			}
		}
		return minS;
	}
}

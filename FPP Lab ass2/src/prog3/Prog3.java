package prog3;

public class Prog3 {
	
	
	public static void main (String[] args) {
		float x= 1.27F;
	    float y = 3.881F;
	    float z = (float)9.6F;
		int sum = (int) (x + y + z);
		int sumRound = Math.round(x + y + z);
		
		
		System.out.println("sum: "+sum);
		System.out.println("sumRound: "+sumRound);
	}
}


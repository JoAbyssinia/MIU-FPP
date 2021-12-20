package prog7;

import java.util.Random;

public class Prog7 {
	
	
	public static void main(String[] args) {
			
		
		
		
		Random rand= new Random();
		
		for (int i = 0; i < 8; i++) {
			String output = "";
			output = String.format("%16d %12d %n %n", rand.nextInt(99), rand.nextInt(99));
			output += String.format("%13s %2d %9s %2d %n","+", rand.nextInt(99), "+", rand.nextInt(99));
			output += String.format("%16s %12s","____", "____");
			System.out.println(output);
		}
		
	}
}

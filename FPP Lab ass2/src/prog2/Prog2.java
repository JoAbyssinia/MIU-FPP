package prog2;

public class Prog2 {
	
	
	public static void main(String[] args ) {
		
		RandomNumbers n1 = new RandomNumbers();
		int x = n1.getRandomInt(1,9);
		double result = Math.pow(Math.PI,x);
		System.out.println(result);
//		
//		RandomNumbers n2 = new RandomNumbers(3,14);
//		int y = n2.getNumber();
//		double result1 = Math.pow(y,Math.PI);
//		System.out.println(result1);
		
		int b;
		int a = (b = 5);
		
		System.out.println(a);
	}
}

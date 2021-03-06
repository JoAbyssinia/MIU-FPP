
public class Recursion {

	public int factorial(int n) {
		if(n==1) return n;
		return n*factorial(n-1);
	}
	
	public int multi(int a, int b) {
		if(b==1) return a;
		return a+ multi(a,b-1);
	}
	
	public static void main(String[] args) {
		Recursion rec = new Recursion();
		System.out.println("the fatoral of 5 is "+rec.factorial(5));
		System.out.println("the multiplication of 5 * 7 is "+rec.multi(5, 7));
	}
}

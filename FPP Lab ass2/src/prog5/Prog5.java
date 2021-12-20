package prog5;
import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any word :");
		String data = in.next();
		in.close();
		reverse(data);
		
	}
	
	static void reverse(String data) {
		
			for(int i=data.length()-1; i>=0; i-- ) {
				System.out.print(data.charAt(i));
			}
	}
}

import java.io.Console;
import java.util.Scanner;

public class refreshiment {

	public static void main (String [] argus) {
		
		enum size {SMALL, MIDIUM, LARGE};
		
		System.out.println(size.LARGE);
		
		StringBuilder sb = new StringBuilder();
		sb.append("yohannes ");
		sb.append("Kasssa ");
		sb.append("Yimam");
		
		System.out.println(sb.toString());
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		Console password = System.console();
		char[] pass = password.readPassword("Password: ");
	}
}

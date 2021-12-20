
public class Palenderame {

	public boolean isPalendrame(String input) {
		
		int length = input.length();
		if(length== 1 || length ==0  ) return true;
		
		if(input.charAt(0) == input.charAt(length-1)) {
			System.out.println(input); 
			return isPalendrame(input.substring(1, input.length() - 1));
			 
		}
		return false;
	}
	
	public static void main(String[] args) {
		Palenderame pel = new Palenderame();
		System.out.println(pel.isPalendrame("asdsa"));
	}
}

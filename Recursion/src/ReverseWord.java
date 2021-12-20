import java.util.Random;

public class ReverseWord {
	int it =0;
	Random random = new Random();
	String rverse(String data) {
	
		if(data.length()==1) return data;
		
		return  rverse(data.substring(1)) + data.charAt(0);
	}
	
	
	int pow(int x) {
		if(x==1) return x;
		int result = pow(x-1);
		System.out.println(x +" * "+ result);
		return x * result;
	}
	
	String recurse(String s){
		if(s==null) return null;
		int r = random.nextInt();
		int n = s.length();
		if(r % 2 == 0)
		return recurse(s.substring(0,n/2));
		else {
		return recurse(s.substring(n/2,n));
		}
		}
	
	public static void main(String[] args) {
	
		ReverseWord rv = new ReverseWord();
		System.out.println(rv.rverse("project"));
		
		System.out.println(rv.pow(4));
		
		System.out.println(rv.recurse("Hello"));
	}
}

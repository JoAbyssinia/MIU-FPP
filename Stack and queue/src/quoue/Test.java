package quoue;

public class Test {
	
	
	public static void main(String[] args) {
	
		Quoue q = new Quoue();
		
		q.enquous("john");
		q.enquous("Amanuel");
		q.enquous("Genet");
		q.enquous("NANA");
		
		
		System.out.println(q.peak());
		System.out.println(q.dequous());
		System.out.println(q.peak());
	}
	
	
}

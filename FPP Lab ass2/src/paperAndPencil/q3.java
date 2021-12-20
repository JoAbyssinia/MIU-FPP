package paperAndPencil;

public class q3 {

	
	public int area(int radius) {
		int a = (int)  (Math.PI * Math.pow(2,radius));
		
		return a;
	}
	
	public double diagonal(int leg, int wid) {
		double diag = Math.sqrt(Math.pow(2, leg) + Math.pow(2,wid));
		
		return diag;
	}
}

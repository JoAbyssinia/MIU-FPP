package stack;

public class Test {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("john");
		s.push("Amanuel");
		s.push("Genet");
		
		
		System.out.println(s.peak());
		System.out.println(s.peak());
		System.out.println(s.pop());
		System.out.println(s.peak());
	}
}

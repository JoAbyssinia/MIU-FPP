
public class Main {
	
	public static void main(String[] args) {
		Parent c =  new Child();
//		Child child = (Child) new Parent();
		
		Child p1 = (Child) c;
		
//		p.test();
		c.test();
		System.out.println(c.x);
//		System.out.println(p1.x);
	}

}

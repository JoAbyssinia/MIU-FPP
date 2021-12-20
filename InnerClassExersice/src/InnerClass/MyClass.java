package InnerClass;

public class MyClass {
	
	private String s = "hello";
	MyInnerClass inner;
	
	
	public MyClass() {
		MyClass mc = new MyClass();
		 inner = new MyInnerClass();
		System.out.println(inner.intval);
		inner.innerMethod();
//		System.out.println(this.s);
		
	}
	
	public static void main(String[] args) {
		MyClass mc =  new MyClass();
		String v= mc.s;
	}
	
	
	private class MyInnerClass{
		private int intval=3;
		
		private void innerMethod() {
			System.out.println(s);
//			System.out.println(this.s);
		}
		
	}
}

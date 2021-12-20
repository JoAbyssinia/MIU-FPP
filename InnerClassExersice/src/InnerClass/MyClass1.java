package InnerClass;

public class MyClass1 {

	private MyInner inner;
	public MyInner getInner() {
		return inner;
	}
	
	public int getInt() {
		return 12;
	}
	
	
	private class MyInner {
		private int innerInt;
		int i = getInt();
		MyInner(){
			innerInt = 1;
		}
	}
	
	public static void main(String[] args) {
	
		MyClass1 mc1 = new MyClass1();
		MyInner i1 =  new MyClass1().new MyInner();
		System.out.println(i1.innerInt);
	}
}

package InnerClass;

public class LocalClass {
	
	public static void main(String[] args) {
		LocalClass localClass = new LocalClass();
		System.out.println(localClass.second());
	}
	
	
	public int second() {
		class MyInnerClass {
			int x;
			public MyInnerClass() {
				x=21;
			}
		}	
		return new MyInnerClass().x;
	}

}

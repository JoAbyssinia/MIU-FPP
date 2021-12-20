
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClassDemo myInner = new InnerClassDemo();
		
		myInner.myOuterMethod(15);
		
		InnerClassDemo.MyInnerClass innerClassObj = myInner.new MyInnerClass("My Inner Class ");

		System.out.println(innerClassObj.getName());
		
		InnerClassDemo.StaticInnerClassDemo staticClassObj = new InnerClassDemo.StaticInnerClassDemo();
		
		InnerClassDemo.StaticInnerClassDemo.myInnerMethod();
//		Anonymous class 
		AnnonymousInterface annonymous1 = new AnnonymousInterface() {
			@Override
			public int multiply(int x, int y) {
				return x * y;
			}
		};
		
		AnnonymousInterface annonymous2 = new AnnonymousInterface() {
			@Override
			public int multiply(int x, int y) {
				return x * y * 2;
			}
		};
		
		System.out.println("Annonymous1 " + annonymous1.multiply(2, 5));
		System.out.println("Annonymous2 " + annonymous2.multiply(2, 5));
		System.out.println("This is special " + new AnnonymousInterface() {
			@Override
			public int multiply(int x, int y) {
				return x * y;
			}
		}.multiply(2, 6));
	}

}

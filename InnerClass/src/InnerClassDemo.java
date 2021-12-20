
public class InnerClassDemo {
	public String myName;
	
//	nested inner class
	public static class StaticInnerClassDemo{
		public String staticName;
		public static void myInnerMethod() {
			System.out.println("This is the Static Inner Class");
		}
	}
//	inner class
	 class MyInnerClass{
		private String name;
		public MyInnerClass(String name) {
			this.name = name;
		}
		
		public String getName() {
			return this.name;
		}
	}
	
	public void myOuterMethod(int age) {
//		local class
		class MyLocalClass{
			private int age;
			
			public MyLocalClass(int age) {
				this.age = age;
			}
			
			public int getAge() {
				return age;
			}
		}
		
		MyLocalClass local = new MyLocalClass(age);
		System.out.println("This is the age of the local class" + local.getAge());
	}

}

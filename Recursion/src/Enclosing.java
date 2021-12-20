public class Enclosing implements Cloneable {
	
		public Enclosing clone() throws CloneNotSupportedException {
		System.out.println("Inside Enclosing.clone()");
			return (Enclosing)super.clone();
		}
class InnerSec implements Cloneable{
	void innerMethod() throws CloneNotSupportedException {
		Object copy = clone();
		System.out.println(copy.getClass().getName());	
	}
}		
class Inner implements Cloneable{
	void innerMethod() throws CloneNotSupportedException {
		Object copy = clone();
		System.out.println(copy.getClass().getName());	
	}
}
	public static void main(String[] args){
		Enclosing p1 = new Enclosing();
		Enclosing.InnerSec i1 = p1.new InnerSec();
			try {
				i1.innerMethod();
			}
			catch(CloneNotSupportedException e){
				e.printStackTrace();
			}
	}
}

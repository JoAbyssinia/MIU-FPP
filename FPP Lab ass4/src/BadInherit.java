
public class BadInherit extends SuperClass {
	
BadInherit(){
	System.out.println("In BadInherit");
}
public static void main(String[] args){
	new BadInherit();
	}
}





class SuperClass {
	SuperClass(){
		System.out.println("In SuperClass");
		new BadInherit();
	}
}
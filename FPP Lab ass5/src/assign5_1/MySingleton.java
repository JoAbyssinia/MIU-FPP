package assign5_1;

public final class MySingleton {
	
	
	private static MySingleton instance_singleton = new MySingleton();
	private MySingleton() {
//		instance_singleton = 
	}
	
//	another way of initialization
	public  MySingleton getSingleton() {
		if (instance_singleton == null)
			instance_singleton = new MySingleton();
		
		return instance_singleton;
	}
	public static void main(String[] args) {
	
		MySingleton mySingleton = new MySingleton().getSingleton();
		MySingleton mySingleton1 = new MySingleton().getSingleton();
		MySingleton mySingleton2 = new MySingleton().getSingleton();
		MySingleton mySingleton3 = new MySingleton().getSingleton();
		
		System.out.println("singleton :"+mySingleton.hashCode());
		System.out.println("singleton1 :"+mySingleton1.hashCode());
		System.out.println("singleton2 :"+mySingleton2.hashCode());
		System.out.println("singleton3 :"+mySingleton3.hashCode());
		
		
	}
	
}

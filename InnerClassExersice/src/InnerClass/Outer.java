package InnerClass;

public class Outer {

	
	
	public  int data = 10;
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.printVal(20);
	}
	
		void printVal(int bouns){
			
			if(data < bouns) {
				
				class Inner implements ValGetter {
					Outer outer = new Outer();
					@Override
					public int getValue() {
						return outer.data;
					}	
				}
				
				Inner inner = new Inner();
				
				ValGetter dates = () -> data;
				System.out.println("Lambda "+ dates.getValue()+" yes");
				System.out.println("inside Inner "+inner.getValue());
				System.out.println("outside inner "+ (data - bouns));
				
			}
		}

		
}

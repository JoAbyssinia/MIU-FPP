package quiz7;

public class Main {

	public static void main(String[] args) {
		VehicleStack vs = new VehicleStack();
		vs.push(new Vehicle("Tesla"));
		vs.push(new Vehicle("Toyota"));
		vs.push(new Vehicle("BMW"));
		vs.push(new Vehicle("Chevrolet"));
		vs.push(new Vehicle("Makarove"));
		vs.push(new Vehicle("hunda"));
		
		
		VehicleQueue vq = new VehicleQueue();
		int size = vs.size;
		for ( int i = 0; i < size; i++) {
			vq.enqueue(vs.pop());

		}
		
		System.out.println(vq);
		
		
	}
}

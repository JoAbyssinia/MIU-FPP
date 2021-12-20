

public class Main {
	public static void main(String[] args) {
		VehicleLinkedList list = new VehicleLinkedList();
		
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle("Second vehicle");
		Vehicle v3 = new Vehicle("Third vehicle");
		
		list.addFirst(v1);
		list.addFirst(v3);
		list.addLast(v2);
		
		list.forEach(v -> System.out.println(v.getName()));
	}
}

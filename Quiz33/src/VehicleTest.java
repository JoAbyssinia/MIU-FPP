

import java.util.Arrays;
import java.util.Comparator;

public class VehicleTest {

	public static void main(String[] args) {
		
		Bike b5 = new Bike(0, "Expo", 16.7, "Aircycle");
		Bike b6 = new Bike(0, "Mountain", 16.7, "Aircycle");
		
		Bike b = new Bike(0, "Toddy", 16.7, "Aircycle");
		Bike b2 = new Bike();
		
		Motorcycle m = new Motorcycle();
		Motorcycle m2 = new Motorcycle(2, "YAMAHA", 64.7, 2.4f);
		
		Car c = new Car();
		Car c2 = new Car(6, "Dodge", 146.8, "Truck");
		
		Vehicle[] vArr = {b, b2, m, m2, c, c2};
		
		Comparator com = new sortByNameDecending();
		
		Arrays.sort(vArr, com);
		
		for(Vehicle v : vArr) {
			System.out.println("Vehicle info: " + v.toString() + " Average Speed " + v.calculateAverageSpeed());
		}
		
		System.out.println(b5.equals(b6) + " : " + b5.compareTo(b6));
	}

}

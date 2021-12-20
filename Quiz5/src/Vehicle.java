

public class Vehicle {
	private String name;
	
	public String getName() {
		return name;
	}
	
	public Vehicle() {
		name = "Default Vehicle (Donkey)";
	}
	public Vehicle(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}

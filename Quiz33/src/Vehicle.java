

public class Vehicle implements Speedometer, Comparable<Vehicle>{
	
	private int numberOfWheels;
	private String model;
	private double topSpeed;
	
	public Vehicle() {
		this.numberOfWheels = 16;
		this.model = "Tesla";
		this.topSpeed = 465.8;
	}
	
	public Vehicle(int numberOfWheels, String model, double topSpeed) {
		this.numberOfWheels = numberOfWheels;
		this.model = model;
		this.topSpeed = topSpeed;
	}
	
	
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(double topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	@Override
	public String toString() {
		return getNumberOfWheels() + " " + getModel() + " " + getTopSpeed();
	}

	@Override
	public double calculateAverageSpeed() {
		return getTopSpeed() / 4;
	}

	

	@Override
	public int compareTo(Vehicle o) {
		if(o == null) return -1;
		return this.model.compareTo(o.getModel());
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(!(obj instanceof Vehicle)) return false;
		
		Vehicle v = (Vehicle) obj;
		
		return this.model.equals(v.model);
	}
	
	
}

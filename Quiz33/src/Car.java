

public class Car extends Vehicle{
	
	private String carType;
	
	public Car() {
		super(4, "Sedan", 124.5);
		this.carType = "Sedan";	
	}
	public Car(int numberOfWheels, String model, double topSpeed, String carType) {
		super(numberOfWheels, model, topSpeed);
		this.carType = carType;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + getCarType();
	}
}

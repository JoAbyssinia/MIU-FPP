
public class Motorcycle extends Vehicle{
	
	private float engineSize;
	
	public Motorcycle() {
		super(2, "Harley", 78.6);
		this.engineSize = 1.5f;
	}
	
	public Motorcycle(int numberOfWheels, String model, double topSpeed, float engineSize) {
		super(numberOfWheels, model, topSpeed);
		this.engineSize = engineSize;
	}

	public float getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(float engineSize) {
		this.engineSize = engineSize;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + getEngineSize();
	}
}

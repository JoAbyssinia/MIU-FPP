

public class Bike extends Vehicle {
	
	private String style;

	public Bike() {
		super(2, "Shwin", 40.4);
		this.style = "Sport";
	}
	public Bike(int numberOfWheels, String model, double topSpeed, String style) {
		super(numberOfWheels, model, topSpeed);
		this.style = style;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + getStyle();
	}
	
	
	
	@Override
	public int compareTo(Vehicle o) {
		if(o == null) return -1;
		Bike b = (Bike) o;
		return this.style.compareTo(b.getStyle());
	}
	
	
	
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(!(obj instanceof Bike)) return false;
		
		Bike b = (Bike) obj;
		
		return this.style.equals(b.style);
	}
	
	
	
}

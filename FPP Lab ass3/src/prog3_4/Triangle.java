package prog3_4;

final class Triangle {


	private final double base;
	private final double height;
	private final double side1;
	private final double side2;
	private final double side3;
	
	public Triangle(double base,double height) {
		this.base = base;
		this.height = height;
		this.side1 = 0;
		this.side2 = 0;
		this.side3 = 0;
		
		
	}
	
	public Triangle(double side1,double side2, double side3) {
		this.base = 0;
		this.height = 0;
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	
	
	public double getbase() {
		return base;
	}

	public double getheight() {
		return height;
	}
	
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
	public double computeArea() {
		return (base * height)/2;
	}
}

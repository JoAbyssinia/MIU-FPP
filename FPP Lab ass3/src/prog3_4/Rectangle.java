package prog3_4;

final class Rectangle {

	private final double length;
	private final double width;
	public Rectangle(double length,double width) {
		this.length = length;
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}

	public double getwidth() {
		return width;
	}
	
	public double computeArea() {
		return width * length;
	}
}

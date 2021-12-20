package prog3_4;

public class Main {

	
	public static void main(String[] args) {
	
		Triangle triangle = new Triangle(5, 5);
		Rectangle rectangle = new Rectangle(5, 5);
		Circle circle = new Circle(5);
		
		
		System.out.println("Area of Triangle "+triangle.computeArea());
		System.out.println("Area of Rectangle "+rectangle.computeArea());
		System.out.println("Area of Circle "+circle.computeArea());
	}
}

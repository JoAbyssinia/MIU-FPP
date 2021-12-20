package good.forth;

public class Test2 {
	public static void main(String[] args) {
		
		Polygon [] objects = {new Triangle(4,5,6),
				new Square(3),
				new Rectangle(3, 4)};
		
		for (Polygon o : objects) {
			
			System.out.println(String.format("For this %s \r\n"
					+ "Number of sides = %s \r\n"
					+ "Perimeter = %s", o.getClass().getSimpleName(),o.getNumberOfSides(),o.computePerimeter() ));
			
//			ClosedCurve area = (ClosedCurve)o;
//			String nameOfCurve = o.getClass().getSimpleName();
//			System.out.printf("The area of this %s is %.2f \n",
//			nameOfCurve, area);
		}
	}
}

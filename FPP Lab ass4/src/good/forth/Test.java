package good.forth;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		
		ClosedCurve[] objects = {new Triangle(3,4,5),
				new Square(3),
				new Circle(3),
				new Rectangle(5, 5)};
		
		
		for (ClosedCurve o : objects) {
			double area = o.computerArea();
			String nameOfCurve = o.getClass().getSimpleName();
			System.out.printf("The area of this %s is %.2f \n",
			nameOfCurve, area);
		}
	}
}

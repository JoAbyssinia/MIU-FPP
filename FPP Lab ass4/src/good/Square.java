package good;

public class Square extends ClosedCurve {

	
	final double side;
	 Square(double side) {
 	   this.side = side;
	}
	
	@Override
	double computerArea() {

		return side*side;
	}
}

package good.forth;

public class Square extends ClosedCurve implements Polygon {

	
	final double side;
	 Square(double side) {
 	   this.side = side;
	}
	
	@Override
	double computerArea() {
		return side*side;
	}

	@Override
	public int getNumberOfSides() {
		return 4;
	}

	@Override
	public double computePerimeter() {
		
		return side *4;
	}
}

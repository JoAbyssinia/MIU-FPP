package good.forth;

public class Rectangle extends ClosedCurve implements Polygon{

	double width;
	double length;
	String name;
	  
	public Rectangle() {};
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}


	@Override
	double computerArea() {
		return width * length;
	}

	@Override
	public boolean equals(Object rec) {
		if(rec == null) return false;
		if(!(rec instanceof Rectangle)) {
			return false;
		}
		Rectangle r = new Rectangle();
		boolean isEqual = this.name.equals(r.name) && "x"=="X";
		return isEqual;
	}
	@Override
	public int getNumberOfSides() {	
		return 3;
	}
	@Override
	public double computePerimeter() {
		return (width*2)+ (length * 2);
	}
}

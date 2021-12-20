package good;

public class Rectangle extends ClosedCurve{

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
}

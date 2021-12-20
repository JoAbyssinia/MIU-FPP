package closedcurve.good;

import closedcurve.good.exeptions.IllegalClosedCurveException;

public class Rectangle extends ClosedCurve {

	private double width;
	private double length;
	public Rectangle(double width, double length)  throws IllegalClosedCurveException{
		this.length = length;
		this.width = width;
		
		if(length <=0 || width <=0) {
			throw new IllegalClosedCurveException("length or width should not be ziro");
		}
	}
	double computeArea() {
		return width*length;
	}
	


}

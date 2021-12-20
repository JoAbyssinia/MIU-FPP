package closedcurve.good;

import closedcurve.good.exeptions.IllegalClosedCurveException;

public class Circle extends ClosedCurve {
	double radius;
	public Circle(Double radius) throws IllegalClosedCurveException{
		this(radius.doubleValue());
	}
	public Circle(double radius) throws IllegalClosedCurveException {
		this.radius = radius;
		
		if(radius <=0) {
			throw new IllegalClosedCurveException("radius should't be ziro");
		}
	}
	double computeArea() {
		return (Math.PI * radius * radius);
	}
}

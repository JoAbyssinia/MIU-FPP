package closedcurve.good;

import closedcurve.good.exeptions.IllegalClosedCurveException;

public class Square extends ClosedCurve {
	double side;
	public Square(Double side) throws IllegalClosedCurveException{
		this(side.doubleValue());
	}
	public Square(double side) throws IllegalClosedCurveException {
		this.side = side;
		if(side<=0) throw new IllegalClosedCurveException("cant be ziro");
		
	}
	double computeArea() {
		return(side*side);
	}

}

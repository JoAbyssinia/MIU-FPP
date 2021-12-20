package good.forth;

import java.util.Arrays;

public class Triangle extends ClosedCurve implements Polygon {

	final double s1;
	final double s2;
	final double s3;
	private final double base;
	private final double height;
	static final double DEFAULT_SIDE = 5.0;
	
	Triangle(double s1, double s2, double s3){
		
		double[] arr = {s1, s2, s3};
		Arrays.sort(arr);		
		double x = arr[0];
		double y = arr[1];
		double z = arr[2];
		if(x + y < z) {
			//TODO: Throw an exception here...
			System.out.println("Illegal sizes for a triangle: " + s1 + ", " + s2+", " + s3);
			System.out.println("Creating an equilateral triangle with side = " + DEFAULT_SIDE);
			x = y = z = DEFAULT_SIDE;
		}
		this.s1 = x;
		this.s2 = y;
		this.s3 = z;
		double u = (y * y - x * x + z * z)/(2 * z);
		double h = Math.sqrt(y * y - u * u);
		base = z;
		height = h;	
		assert(this.s1 <= this.s2 && this.s2 <= this.s3);
		assert(height <= base);
	}
	
	@Override
	double computerArea() {
		
		return 0.5 * base * height;
	}

	@Override
	public int getNumberOfSides() {
		return 3;
	}

	@Override
	public double computePerimeter() {
		return s1 + s2 +s3;
	}
	
}

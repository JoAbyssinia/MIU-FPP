package good.forth;

public class Circle extends ClosedCurve {

	final double radius; 
	public Circle(double radius) {
		this.radius = radius;
	}
	
	
	
	@Override
	double computerArea() {
		return (Math.PI * radius * radius);
	}




	
	
}

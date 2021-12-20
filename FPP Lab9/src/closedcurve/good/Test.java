package closedcurve.good;

import closedcurve.good.exeptions.IllegalClosedCurveException;
import closedcurve.good.exeptions.IllegalTriangleException;

public class Test {
	
	public static void main(String[] args) throws IllegalClosedCurveException {

		ClosedCurve[] objects = {new Triangle(4,5,6),
								 new Square(3),
								 new Rectangle(3,7),
								 new Circle(3)};
		//compute areas
		for(ClosedCurve cc : objects) {
			String nameOfCurve = getClassNameNoPackage(cc.getClass());

			System.out.println("The area of this "+
								nameOfCurve+ 
								" is "+
								cc.computeArea());
							
			}
		
	}
	public static String getClassNameNoPackage(Class aClass){ 
        String fullClassName = aClass.getSimpleName();
        int index = fullClassName.lastIndexOf('.');
        String className = null;
        String packageName = null;
        
        
        //in this case, there is no package name
        if(index==-1) {
            return fullClassName;
        }
        else {
				  //for other apps, may be useful to have this
            packageName = fullClassName.substring(0,index);

            className = fullClassName.substring(index+1);
            return className;
        }    
	    	

	}

}

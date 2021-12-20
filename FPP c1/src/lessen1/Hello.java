package lessen1;

import javax.swing.JOptionPane;

public class Hello {
	
	static String name;

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Hello.name = name;
	}

	public static void main(String[] arg) {
		JOptionPane.showMessageDialog(null, "john");
		double a = 0.6;
		double b = 0.8;
		double x = a + 0.1;
		double z = b - 0.1;
		
//		JOptionPane.showMessageDialog(null,x );
//		System.out.println('\u7ec8');
//		System.out.println("\ud835\udd6b");
		Hello hello = new Hello();
		hello.setName("john");
		System.out.println(name);
		System.out.println(Math.PI);
		System.out.println(Math.pow(5, 2));
		System.out.println(Math.abs(-1));
		
		
	}
}

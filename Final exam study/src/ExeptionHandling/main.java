package ExeptionHandling;


public class main {

	
	String name;
	int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) throws InvalideNameExeption {
		if(name.length() <3) throw new InvalideNameExeption("name invalide");
		if(name.length() >15) throw new InvalideNameLengthExeption("name out of charactor");
		this.name = name;
	}

	public int getAge() {
		
		return age;
	}

	public void setAge(int age) throws InvalideAgeExeption {
		if(age <0) throw new InvalideAgeExeption("invalide age");
		this.age = age;
	}
	
	public main(String name, int age) throws InvalideNameExeption {
		setName(name);
		try {
			setAge(age);
		} catch (InvalideAgeExeption e) {
		System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
	
		try {
			main m = new main("jhonjpjvspodvjpsdjovps",23);
		} catch (InvalideNameExeption e) {
			System.out.println(e.getMessage());
			
		}
//		try {
//			m.setName("yohannessdvsdvsdvsdvsdvsdvsdv");
//			m.setAge(25);
//		} catch (InvalideNameExeption e) {
//			System.out.println(e.getMessage());
//		}catch (InvalideAgeExeption e) {
//			System.out.println(e.getMessage());
//		}catch (Exception e) {
//			System.out.println(e.getMessage());
//		}finally {
//			System.out.println("programm is terminated");
//		}
		
		System.out.println();
		
	}
}

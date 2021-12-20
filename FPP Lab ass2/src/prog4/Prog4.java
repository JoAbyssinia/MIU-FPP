package prog4;

public class Prog4 {

	
	public static void main(String[] args) {
		
		String myString = Data.records;
		String[] stringSplit = myString.split(":");
		
		
		for (String s : stringSplit) {
			String[] studentId = s.split(",");
			System.out.println(studentId[0]);
		}

	}

}

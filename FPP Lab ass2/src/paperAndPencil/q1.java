package paperAndPencil;

public class q1 {

	public String socialSecurityStatus(int age) {
		String SSS="";
		if (age >65) {
			SSS="eligable";
		}else {
			SSS="ineligable";
		}
		
		return SSS;
	}
}


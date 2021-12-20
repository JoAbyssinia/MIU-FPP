package prog2;


public class RandomNumbers1 {

	int sNum;
	int lNum;
	
	RandomNumbers1(int sNum, int lNum){
		this.sNum = sNum;
		this.lNum = lNum;
	}
	
	public int getNumber() {
		return (int)(Math.random() * (lNum-sNum) + sNum);
	}
}

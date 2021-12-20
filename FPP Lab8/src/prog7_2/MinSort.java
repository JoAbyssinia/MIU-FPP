package prog7_2;

public class MinSort {

	int i=0;
	public String sort(String n) {
		if(n == null || n.length() ==0)
			return "";
		
		char[] charArr = n.toCharArray();
		int minPos=0;
		char ch = charArr[0];
		
		for(int i=1; i< charArr.length; ++i) {
			if(charArr[i] < ch){
				minPos = i;
				ch = charArr[i];
			}
		}
		charArr[minPos] = charArr[0];
		charArr[0] = ch;
		n = new String(charArr);
		
		return ch + sort(n.substring(1));
		
		
		
	}
	public static void main(String[] args) {
		MinSort ms = new MinSort();
		String result = ms.sort("zwxuabfkafutbbbb");
		System.out.println(result);
	}
}

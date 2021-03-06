import java.util.Arrays;

public class ArrayRecursion {

	
	public static boolean search(int[] arr, int input) {
		System.out.println(Arrays.toString(arr));
		if(arr.length == 0 || arr == null) return false;
		
		if(arr.length == 1) return arr[0] == input; 
		
		if(arr[0] == input) return true;
		
		return search(Arrays.copyOfRange(arr, 1 , arr.length),input);
	}
	
	public static void main(String[] args) {
		
		int[] data = {12,34,5,7,76,89,6,2};
		
		System.out.println(search(data, 6));
		
	}
	
}

package prog6;

import java.util.Arrays;

public class Prog6 {

	
	
	public String[] removeDups(String[] data ) {
		
		String[] removed = new String[data.length]; 
		int size = 0;
		int counter = 0;
		for (String dataV : data) {
			int ch = 0;
			for (String stored : removed) {
				if(dataV.equals(stored)) {
					ch++;
				}
			}
			if(ch == 0 ) {
				removed[counter++] = dataV;
				size++;
			}
			ch=0;
		}
		String[] result = new String[size];
		for(int i =0; i < result.length; i++ ) {
			result[i] = removed[i];
		}	
		return result; 
	}
	
	public static void main(String[] args) {
			
	}

}

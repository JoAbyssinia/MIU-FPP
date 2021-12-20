package prog3_3;

import java.util.Arrays;

public class MyStringList1 {

	String[] strArray;
	int size;
	int index;
	
	public MyStringList1() {
		size=2;
		index=0;
		strArray = new String[size];
	}
	
	
	public void add(String data) {
		if(index == strArray.length) {
			resize();
		}
		
		strArray[index] = data;
		index++;
		
	}
	
	public String get(int i) {
		return strArray[i].toString();
	}
	
	public boolean remove(String s) {
		if(size == 0) return false;
		
		int che= -1;
		int index=-1; 
		for(int i=0; i< strArray.length; i++) {
			if(strArray[i].equals(s)) {
				che++;
				index = i;
			}
		}
		if(che==0) {
			size--;
			String[] temp = new String[size];
			int j=0;
			for(int i=0; i<strArray.length; i++) {
				if(index == i) {
					continue;
				}
				temp[j]= strArray[i];
				j++;
			}
			return true;
		} 
		return false;
	}
	
	private void resize() {
		System.out.println("Resizing...");
		int tempSize = size *2;
		String[] temp = new String[tempSize];
		System.arraycopy(strArray, 0, temp, 0, strArray.length);
		strArray = temp;
		
	}
	
	public int size() {
		return strArray.length;
	}
	
	@Override
	public String toString() {
		
		return "The list of size " + size() + " is " + Arrays.toString(strArray);
	}
	
	public static void main(String[] args) {
		MyStringList l = new MyStringList();
		l.add("Bob");
		
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Steve");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Susan");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
	}
}

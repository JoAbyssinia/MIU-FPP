package prog3_3;

import java.util.Arrays;

public class MyStringList {

	String[] strArray;
	int sizeV; 
	
	public MyStringList() {
		sizeV = 0;
		strArray = new String[2];
	}
	
	public void add(String data) {
		if(strArray.length == sizeV) {
			resize();
		}
		strArray[sizeV++] = data;
	}
	
	public String get(int i) {
		if(i < 0 || i >= sizeV){
			return null;
		}
		return strArray[i];
	}
	
	public boolean find(String s) {
		for (String string : strArray) {
			if(string.equals(s)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean remove(String s){
		if(sizeV == 0) return false;
		int index = -1;
		for(int i = 0; i < sizeV; ++i ){
			if(strArray[i].equals(s)){
				index = i;
				break;
			}
		}
		if(index==-1) return false;
		String[] temp = new String[strArray.length];
		System.arraycopy(strArray,0,temp,0,index);
		System.arraycopy(strArray,index+1,temp,index,strArray.length-(index+1));
		strArray = temp;
		--sizeV;
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("[");
		for(int i = 0; i < sizeV-1; ++i){
			builder.append(strArray[i]+", ");
		}
		builder.append(strArray[sizeV-1]+"]");
		return builder.toString();
	}
	
	public int size() {
		return strArray.length;
	}
	
	private void resize() {
		System.out.println("Resizing...");
		int len = strArray.length;
		int newlen = 2*len;
		String[] newArray = new String[newlen];
		System.arraycopy(strArray, 0, newArray, 0 , strArray.length);
		strArray= newArray;	
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

package Recursion;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Objects;

import ListWIthObject.DoublyLinkedList;
import ListWIthObject.Student;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	
	public static boolean search(String[] data, String find ) {
		
		if(data == null) return false;
		if(data.length == 1) data[0].equals(find);
		
		if(data[0].equals(find)) return true;
		
	return search(Arrays.copyOfRange(data, 1, data.length),find);	
	}
	
	
	public static void main(String[] args) {
		
		String[] list = {"john","nana","genet"};
		String data = "AABBCC";
		Hashtable<Character, Character> table = new Hashtable<Character, Character>();
		System.out.println(duplication(data,table));
		System.out.println(search( list,"genet"));		
	}

	private static String duplication(String data, Hashtable<Character, Character> table) {
		char[] ch = data.toCharArray();
		table.put(ch[0], ch[0]);
		return table + duplication(data.substring(1), table);
	}
	
	
	
	
}

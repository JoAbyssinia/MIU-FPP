package ass8_5;

import java.util.Iterator;

public class MyTable {

	Entry[] entries = new Entry[26];
	

	
	class Entry{
		
		public char c;
		public String s;	
		public Entry(char c, String s) {
			this.c = c;
			this.s= s;
		}
		
		@Override
		public String toString() {
			return c+"->"+s;
		}
		
	}
	
	//returns the String that is matched with char c in the table
		public String get(char c){
			
			for (Entry entry : entries) {
				if(c == entry.c) {
					return entry.s;
				}
			}
		return null;	
		}
	
	public void add(char c, String s ) {
		
		
		for(char i = 'a', j=0; i<='z'; j++, i++) {
			if(i == c) {	
				entries[j] = new Entry(c,s);
			}
		}	
	}
	
	
	@Override
	public String toString() {
		String outPut = "";
		for (Entry entry : entries) {
			if(entry !=null) {
				outPut += entry +" \n";
			}
			
		}
		return outPut;
	}
	
	public static void main(String[] args) {
		MyTable t = new MyTable();
		t.add('z', "zebra");
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('w',"Willie");
		
		System.out.println(t);
	}
	
	
}

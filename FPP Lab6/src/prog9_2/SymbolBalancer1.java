package prog9_2;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class SymbolBalancer1 {
	String ODD_DELIMITER = ""+(char)0;
	String filename;
	String text;
	char[] left;
	char[] right;
	Stack<Character> stack; 
	public SymbolBalancer1(String filename) {
		this.filename = filename;
		stack = new Stack<Character>();
		readFile();
	}
	public void setText(String text) {
		this.text = text;
	}
	
	boolean symbolsBalanced(String delimiters){
		
		for(int i=0; i<text.length(); i++) {
			char ch = text.charAt(i);
			
			if(delimiters.indexOf(ch) % 2 == 0) {
				stack.push(ch);
			}
			
			if(delimiters.indexOf(ch)% 2 == 1) {
				if(stack.isEmpty()) return false;
				stack.pop();
			}
		}
		
		return stack.isEmpty();
		
	}
	
	public static void main(String[] args) {
		SymbolBalancer1 sb = new SymbolBalancer1("prog9_2\\Employee.java");
		System.out.println("Symbols balace by Stack built-in class = "+ sb.symbolsBalanced("[]{}()"));		
	}
	void readFile() {
		String prefix = System.getProperty("user.dir") + "\\src\\";
			try {
					List<String> lines = Files.readAllLines(Paths.get(prefix, filename));
					StringBuilder textsb = new StringBuilder();
					
					for(String line : lines) {
						textsb.append(line + "\n");
					}
					text = textsb.toString();
			} catch(IOException e) {
				System.out.println("File not found: " + e.getMessage());
			}
//		System.out.println(text);
		}
	
}




package prog9_1;

import prog9_1.MyStringLinkedList.Node;

public class MyStringStack {
	private MyStringLinkedList list;
	public MyStringStack() {
		list = new MyStringLinkedList();
	}
	
	public String pop() {
		String temp = peek();
		list.remove(0);
		return temp;
	}
	public String peek() {
		
		return list.get(0);
	}
	
	public void push(String s) {
		list.insert(s, 0);
	}
	
	public static void main(String[] args) {
		
		MyStringStack stack = new MyStringStack();
		stack.push("Bob");
		stack.push("Harry");
		stack.push("Alice");
		System.out.println("Popping…"+stack.pop());
		System.out.println("Peeking…."+stack.peek());
		System.out.println("Popping…"+stack.pop());
		System.out.println("Peeking…."+stack.peek());
	}
}

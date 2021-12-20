package stack;

public class Stack {

	Node head;
	
	
	public void push(String data) {
		Node n = new Node(data);
		if(head == null) {
			head = n;
			return;
		} 
		n.next = head;
		head = n;
	}
	
	public String peak() {
	 if(head == null) return null;
		return head.data;
	 }
	
	public String pop() {
		if(head == null) return null;
		String temp = peak();
		head = head.next;
		return temp;
	}	
	
}

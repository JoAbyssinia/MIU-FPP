package quoue;

public class Quoue {

	Node head;
	
	public void enquous(String value) {
		Node n = new Node(value);
		if(head == null) {
			head = n;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = n;
	}
	
	public String peak() {
		if(head == null) return null;
		return head.value;
	}
	
	public String dequous() {
		if(head == null) return null;
		String temp = peak();
		head = head.next;
		return temp;
	}
	
}

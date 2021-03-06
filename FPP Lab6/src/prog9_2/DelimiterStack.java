package prog9_2;

public class DelimiterStack {

	Node head;
	int size =0;
	public void push(char input) {
		
		Node n = new Node(input);
		if(head == null) {
			head = n;
			size++;
			return;
		}
		n.next = head;
		head = n;
		size++;
	}
	
	public char peak() {
		if(head == null) return 0;
		return head.value;
	}
	
	public char pop() {
		if(head == null) return 0;
		char temp = peak();
		head = head.next;
		size--;
		return temp;

	}
	
	public boolean isEmpty() {
		if(size == 0) return true;
		return false;
	}
	
	public int size() {
		return this.size;
	}
	
	
}

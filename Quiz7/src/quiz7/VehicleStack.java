package quiz7;

public class VehicleStack {

	Node head;
	int size;
	
	public VehicleStack() {
		size = 0;
		head = null;
	}
	
	public void push(Vehicle input) {
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
	
	public Vehicle peak() {
		if(head == null) return null;
		return head.data;
	}
	
	public Vehicle pop() {
		if(head == null) return null;
		Vehicle temp = peak();
		head = head.next;
		size--;
		return temp;
	}
	
	@Override
	public String toString() {
		String results = "";
		
		Node temp = head;
		
		while(temp != null) {
			results += temp.data + ", ";
			temp = temp.next;
		}
		
		return results;
	}
}

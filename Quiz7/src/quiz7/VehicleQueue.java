package quiz7;

public class VehicleQueue {

	Node head;
	int size;
	
	public VehicleQueue() {
		head = new Node(null);
		size = 0;
	}
	
	public void enqueue(Vehicle input) {
		Node n = new Node(input);
		if(head == null) {
			head = n;
			size++;
			return;
		}	
		Node temp = head;
		while(temp.next != null) {
			temp= temp.next;
		}
		temp.next = n;
		size++;
	}
	
	public Vehicle peak() {
		if(head == null) return null;
		return head.data;
	}
	
	public Vehicle dequeue() {
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

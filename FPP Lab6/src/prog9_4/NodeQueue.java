package prog9_4;

public class NodeQueue {
	
	private Node head;
	private Node tail;
	
	
	public void enqueue(String n){
		Node newNode = new Node(n);
		if(head == null) { 
		
			tail = newNode;
			head = tail;
			return;
		}
		
		tail.next = newNode;
		tail = newNode;
		
	}
	
	public String peek() throws QueueException {
		if(isEmpty()) throw new QueueException("Queue is empty!");
		
		return head.data;
	}
	
	public String dequeue() throws QueueException {
		if(isEmpty()) throw new QueueException("Queue is empty!");
		String ret = head.data;
		head = head.next;
		return ret;
	}

	public boolean isEmpty() {
		return head ==null;
	}
	
	@Override
	public String toString() {
		if(isEmpty()) return "<empty queue>";
		
		return head.toString();
	}


}
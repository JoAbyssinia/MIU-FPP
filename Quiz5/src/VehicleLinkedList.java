

import java.util.Iterator;

public class VehicleLinkedList implements Iterable<Vehicle>{
	private Node head;
	private Node tail;
	private int size;
	
	public VehicleLinkedList() {
		head = new Node();
		tail = new Node();
		head.next = tail;
		tail.previous = head;
		size = 0;
	}
	
	public void addFirst(Vehicle input) {
		Node n = new Node(input);
		
		n.next = head.next;
		head.next.previous = n;
		
		head.next = n;
		n.previous = head;
		
		size++;
	}
	
	public void addLast(Vehicle input) {
		Node n = new Node(input);
		
		tail.previous.next = n;
		n.previous = tail.previous;
		
		n.next = tail;
		tail.previous = n;
		
		size++;
	}
	
	public boolean search(Vehicle input) {
		if(head.next == tail) return false;
		
		Node temp = head.next;
		while(temp != tail) {
			if(input.equals(temp.data)) return true;	
			temp = temp.next;
		}
		return false;
	}
	
	public Vehicle get(int index) {
		if(size == 0 || index < 0 || index > size) return null;
		int i = 0;
		Node temp = head.next;
		
		while(temp != tail) {
			if(i == index) return temp.data;
			temp = temp.next;
			i++;
		}
		return null;
	}
	
	public boolean remove(Vehicle input) {
		if(head.next == tail) return false;
		
		Node temp = head.next;
		while(temp != tail) {
			if(input.equals(temp.data)) {
				temp.previous.next = temp.next;
				temp.next.previous = temp.previous;
				return true;
			}	
			temp = temp.next;
		}
		return false;
	}
	
	public void insert(Vehicle input ,int index) {
		if(size == 0 || index < 0 || index > size) return;
		int i = 0;
		Node temp = head.next;
		Node n = new Node(input);
		
		while(temp != tail) {
			if(i == index) {
				temp.previous.next = n;
				n.previous = temp.previous;
				n.next = temp.next;
				temp.next.previous = n;
			}
			temp = temp.next;
			i++;
		}
	}

	@Override
	public Iterator<Vehicle> iterator() {
		return new VehicleIterator();
	}
	
	class VehicleIterator implements Iterator<Vehicle>{
		private int position = 0;
		@Override
		public boolean hasNext() {
			return position < size;
		}

		@Override
		public Vehicle next() {
			return get(position++);
		}
		
		public void reset() {
			position = 0;
		}
		
	}
	
	
	
	

}

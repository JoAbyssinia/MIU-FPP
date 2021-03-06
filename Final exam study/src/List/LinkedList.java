package List;

import java.util.Iterator;


public class LinkedList implements Iterable<Integer> {

	Node head;
	int size;
	
	public LinkedList() {
		head = null;
		size=0;
	}
	
	public void addFirst(int input) {
	Node n = new Node(input);

		if(head==null) {
			head = n;
			size++;
			return;
		}
			n.next = head;
			size++;
	}
	
	public void addLast(int input) {
		Node n = new Node(input);
			if(head==null) {
				head = n;
				size++;
			return;
			}
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = n;
			size++;
			return;
		}
	
	
	public void Insert(int input , int pos) {
		if(head == null) return;
		if(pos > size) return;
		if(pos == 0) addFirst(input);
		if(pos == size) addLast(input);
			
		Node n = new Node(input);
		int i=0;
		Node temp = head;
		while(temp.next !=null) {
			if(i == pos-1) {
				n.next = temp.next;
				temp.next = n;
				size++;
				return;
			}
		}
		
	}
		
	public void removeByValue(int input) {
		if(head == null) return;
		Node temp = head;
		while(temp.next != null) {
			if(temp.next.value == input) {
				temp.next = temp.next.next;
				size--;
				return;
			}
		}
	}
	
	public int size() {
		return this.size;
	}
	
	public int get(int index) {
		
		if(index > size) return -1;
		if(head == null) return -1;
		
		int i=0;
		Node temp = head;
		
		while(temp != null ) {
			if(i==index) {
				return temp.value;
			}
			i++;
			temp = temp.next;
		}
		
		return -1;
	}

	@Override
	public String toString() {
		
		String print="[";
		Node temp = head;
		while(temp != null ) {
			print += temp.value+ ", ";
			temp = temp.next;
		}
		print += "] ";
		return print;
		
	}

	@Override
	public Iterator<Integer> iterator() {
	
		return new Iterator<Integer>() {
			int pos = 0;
			@Override
			public Integer next() {
				
				return get(pos++);
			}
			
			@Override
			public boolean hasNext() {
				
				return pos<size;
			}
		};
	}

	
	
	
	
}

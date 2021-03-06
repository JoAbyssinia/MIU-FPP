package ListWIthObject;

import java.util.ArrayList;
import java.util.Iterator;

public class DoublyLinkedList implements Iterable<Student> {

	int size;
	Node head;
	Node tail;
	
	public DoublyLinkedList() {
		head = new Node(null);
		tail = new Node(null);
		head.next = tail;
		tail.privous = head;
		size=0;
	}
	
	public void addFirst(Student stu) {
		if(head==null) return; 
		Node n = new Node(stu);
		n.next = head.next;
		n.privous = head;
		head.next.privous = n;
		head.next = n;
		size++;
	}
	
	public void addLast(Student stu) {
		if(head==null) return;
		Node n = new Node(stu);
		Node temp= tail; 
		n.next = tail;
		n.privous = temp.privous.next;
		temp.privous.next = n;
		temp.privous = n;
		size++;
	}
	
	public Student get(int pos) {
		int i=0;
		Node temp = head.next;
		while(temp != null) {
			if(pos == i) {
				return temp.student;
			}
			i++;
			temp = temp.next;
		}
		return null;
	}
	
	public void insert(Student stu, int index) {
		if(head == null) return;
		if(index > size) return;
		
		int i = 0;
		Node temp = head;
		Node n = new Node(stu);
		while(temp.next != null) {
			
			if(i == index) {
				n.next = temp;
				n.privous= temp.privous;
				temp.privous.next = n;
				temp.privous = n;
				size++;
				return;
			}
			temp = temp.next;
			i++;
		}
	}
	
	public void delete(int index) {
		if(head == null) return;
		if(index > size) return;
		int i=0;
		Node temp = head.next;
		while(temp != null) {
			
			if(i == index) {
				temp.privous.next = temp.next;
				temp.next.privous = temp.privous;
				size--;
			}
			
			temp = temp.next;
			i++;
		}
		
	}
	
	
	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public Iterator<Student> iterator() {
		
		return new Iterator<Student>() {
			int pos = 0;
			@Override
			public Student next() {
				return get(pos++);
			}

			@Override
			public boolean hasNext() {
				
				return pos <size;
			}
		};
		
		
	}

	
	
	
}

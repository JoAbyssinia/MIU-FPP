package ListWIthObject;

import java.util.Iterator;

public class Queue implements Iterable<Student> {

	
	DoublyLinkedList head;
	
	
	public Queue() {
		head = new DoublyLinkedList();
	}
	
	public void enqueue(Student st) {
		head.addLast(st);
	}
	
	public Student peek() {
		return head.get(0);
	}
	
	public Student dequeue() {
		Student temp = peek();
		head.delete(0);
		return temp;
	}

	@Override
	public Iterator<Student> iterator() {
		
		return new Iterator<Student>() {
			int pos = 0;
			@Override
			public Student next() {
			
				return head.get(pos++);
			}
			
			@Override
			public boolean hasNext() {
				
				return pos < head.size;
			}
		};
	}
	
	
}

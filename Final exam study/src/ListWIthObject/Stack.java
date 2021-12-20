package ListWIthObject;

import java.util.Iterator;

public class Stack implements Iterable<Student> {


	DoublyLinkedList head;
	
	public Stack(){
		head = new DoublyLinkedList();	
	}
	
	public void put(Student stu) {
		head.addFirst(stu);
	}
	
	public Student peak() {
		return head.get(0);
	}
	
	public Student pop() {
		Student temp = peak();
		head.delete(0);
		return temp;
	}

	@Override
	public Iterator<Student> iterator() {
		
		return new StudentItrable() ;
	}	
	
	class StudentItrable implements Iterator<Student>{

		int pos=0;
		@Override
		public boolean hasNext() {
			
			return pos < head.size;
		}

		@Override
		public Student next() {
			
			return head.get(pos++);
		}
		
	}
}

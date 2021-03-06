package ListWIthObject;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("yohannes Kassa", 12);
		Student s2 = new Student("Amanuel Kassa", 22);
		Student s3 = new Student("yohannes Asheber", 25);
		Student s4 = new Student("Genet tefer", 45);
		Student s5 = new Student("Kassa yimam", 65);

		DoublyLinkedList list = new DoublyLinkedList();
		
		list.addFirst(s1);
		list.addFirst(s2);
		list.addFirst(s3);
		list.addLast(s4);
		list.insert(s5, 3);
		list.delete(0);
		
		Stack st = new Stack();
		for (Student student : list) {
			st.put(student);
		}
		Queue q = new Queue();
		int size = list.size;
		for(int i=0; i<size; i++ ) {
				q.enqueue(st.pop());
		}
		
		for(Student s : q) {
			System.out.println(s);
		}
//		
		
		
	}
}

package LinkedListJ;

public class Test {

	public static void main(String[] args) {
		
		MyLinkedList list = new MyLinkedList();
		
		list.addAtLast("john", 613843);
		list.addAtLast("Genet", 15963);
		list.addAtLast("Amanuel", 12345);
		System.out.println(list);
		
		list.update("JOHN", 613843, 0);
		System.out.println(list);
		
		list.insert("Kassa", 12345, 1);
		System.out.println(list);
		
//		list.remove("Genet");
//		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
//		
		System.out.println(list.size());
		
	}

}

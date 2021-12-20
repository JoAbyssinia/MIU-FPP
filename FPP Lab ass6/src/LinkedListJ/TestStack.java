package LinkedListJ;

public class TestStack {

	public static void main(String[] args) {
		
		StackInLinkedList list = new StackInLinkedList();
		
		list.push("john", 12);
		list.push("Amanuel", 12);
		list.push("Genet", 12);
		list.push("NANA", 12);
		
		System.out.println(list.peak());
		System.out.println(list.peak());
		System.out.println(list.peak());
		System.out.println(list.pop());
		System.out.println(list.peak());
		
	}
}

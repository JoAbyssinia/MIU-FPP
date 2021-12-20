package LinkedListJ;

public class StackInLinkedList {

	MyLinkedList list = new MyLinkedList();
	
	public void push(String input,int ID) {	
		list.add(input, ID);
	}
	
	public String peak() {
		if(list == null)return null;
		return list.get(0);
	}
	
	public String pop() {
		if(list == null) return null;
		String data = peak();
		list.remove(0);
		return data;
	}
	
}

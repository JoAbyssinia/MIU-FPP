package LinkedListJ;

public class MyLinkedList {
	
	Node head;
	int size;
	
	public void add(String name, int ID) {
		Node n = new Node(name,ID);
		
		if(head == null) {
			head = n;
		}else {
			n.next= head;
			head = n;
		}
		size++;
	}
	
	public String get(int index) {
		if(head == null) return null;
		int i=0;
		Node temp = head;
		while(temp.next != null) {
			
			if(i == index) {
				return temp.name;
			}
			
			temp = temp.next;
			i++;
		}
		return null;
	}
	
	public void addAtLast(String name, int ID) {
		Node n = new Node(name,ID);
		
		if(head == null) {
			head = n;
		}else {
			
			Node temp = head;
			while(temp.next != null) {
				temp= temp.next;
			}
			
			temp.next = n;
		}
		size++;
	}
	
	public void update(String name,int Id, int index) {
		if(index >= size) return;
		Node temp = head;
		int i=0;
		
		while(temp != null) {
			
			if(i== index) {
				temp.name = name;
				temp.ID = Id;
				return; 
			}
			temp=temp.next;
			i++;
		}
	}
	
	public void insert(String name, int ID, int index) {
		if(index > size) return;
		if(index ==0 ) { add(name, ID); return; }
		
		Node temp = head;
		int i = 0;
		
		while(temp != null) {
			
			if(i == index-1) {
				
				Node newNode = new Node(name, ID);
				
				newNode.next = temp.next;
				temp.next = newNode;
				size++;
				return;
			}
			temp = temp.next;
			i++;
		}	
	}
	
	
	public void remove(String name) {
		if(head == null) return;
		
		Node temp = head;
		
		while(temp.next != null) {
			
			if(temp.next.name.equals(name)) {
				temp.next = temp.next.next;
				size--;
				return;
			}
			
			temp = temp.next;
		}
		
	}
	
	public void remove(int index) {
		if(head == null) return;
		if(index ==0) {
			head = head.next;
			size--;
			return;
		}
		
		Node temp = head;
		
		
		int i=0;
		while(temp != null) {
			
			if(i== index-1) {
				temp.next = temp.next.next;
				size--;
				return;
			}
			
			temp= temp.next;
			i++;
		}
	}
	
	
	
	public int size() {
		return size;
	}
	
	@Override
	public String toString() {
		
		String print="[";
		Node temp = head;
		while(temp != null ) {
			print += temp.name + ", "+temp.ID + ", ";
			temp = temp.next;
		}
		print += "] ";
		return print;
	}
	
	
	
	
	
	
	
	
	
	
	
}

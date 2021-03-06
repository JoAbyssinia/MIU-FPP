package List;

public class Doublylikendlist {

	int size;
	Node head;
	Node tail;
	
	public Doublylikendlist() {
		head = new Node(null);
		tail = new Node(null);
		head.next = tail;
		tail.privous = head;
		size=0;
	}
	
	public void addFirst(String value) {
		Node n = new Node(value);
			Node temp = head;
			n.next =temp.next;
			n.privous = temp;
			temp.next.privous = n;
			temp.next =n;
			size++;
			return;	
	}
	
	public void addLast(String value) {
		Node n = new Node(value);
			n.next = tail;
			n.privous = tail.privous;
			tail.privous.next = n;
			tail.privous =n;
			size++;
			return;		
	}
	
	
	public void Insert(String data, int pos) {
		if(head== null) return ;
		
		if(pos > size) return;
		int i=0;
		Node temp = head;
		Node n = new Node(data);
		while(temp.next !=null) {
			
			if(i==pos) {
				
			n.next = temp;
			n.privous = temp.privous;
			temp.privous.next = n;
			temp.privous  = n;
			size++;
			}
			temp = temp.next;
			i++;
		}
		
	}
	
	
	public void delete(String data) {
		
			if(head== null) return;
			Node temp = head.next;
			while(temp!= null){
				
				if(temp.data.equals(data)) {
					temp.next.privous = temp.privous;
					temp.privous.next = temp.next;
					size++;
					return;
				}
				temp = temp.next;
			}
	}
	
	public boolean find(String data) {
		if(head==null) return false;
		Node temp = head.next;
		while(temp!=null) {
			if(temp.data.equals(data)) {
				return true;
			}
			
			temp = temp.next;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		String re = "";
		Node temp = head.next;
		while(temp.next != null) {	
			
			re += temp.data +",";
			
			temp = temp.next;
		}
		return re;
	}
}

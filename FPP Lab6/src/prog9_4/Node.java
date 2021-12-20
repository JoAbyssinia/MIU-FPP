package prog9_4;

public class Node {

	String data;
	Node next;
	
	Node(String data){
		this.data = data;
	}
	
	@Override
	public String toString() {
		 if(data == null) return "";
			StringBuilder sb = new StringBuilder(data + " ");
			sb = toString(sb, next);
			return sb.toString();
	}
	
	private StringBuilder toString (StringBuilder sb, Node n) {
		if(n == null) return sb;
		sb.append(n.data+" ");
		return toString(sb,n.next);
	}
}

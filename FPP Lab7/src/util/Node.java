package util;

public class Node {

	public Integer element;
	public Node left;
	public Node right;
	
	Node(Integer theElement) {
		this(theElement, null, null);
	}
	
	public Node(Integer element, Node left, Node right) {
		super();
		this.element = element;
		this.left = left;
		this.right = right;
	}
	
	
	
	
	
	
}

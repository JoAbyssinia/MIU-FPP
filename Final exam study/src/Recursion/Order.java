package Recursion;

public class Order {
	
	String ordername;
	int ordercode;
	public Order(String ordername, int ordercode) {
		super();
		this.ordername = ordername;
		this.ordercode = ordercode;
	}
	public String getOrdername() {
		return ordername;
	}
	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}
	public int getOrdercode() {
		return ordercode;
	}
	public void setOrdercode(int ordercode) {
		this.ordercode = ordercode;
	}
	
	
}

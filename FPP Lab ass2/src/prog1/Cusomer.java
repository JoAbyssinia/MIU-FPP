package prog1;

public class Cusomer {
	Address billingAddress;
	Address shepingAddress;
	String firstName; 
	String lastName;
	String ssn;
	
	
	public Cusomer(String firstName, String lastName, Address billingAddress, Address shepingAddress,  String ssn) {
		this.billingAddress = billingAddress;
		this.shepingAddress = shepingAddress;
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Address getShepingAddress() {
		return shepingAddress;
	}

	public void setShepingAddress(Address shepingAddress) {
		this.shepingAddress = shepingAddress;
	}
	
	@Override
	public String toString() {
		String result = "[%s, %s, ssn: %s]";
		return String.format(result, firstName,lastName,ssn );
	}
	public static void main(String[] args) {
		
		Cusomer[] order = new Cusomer[2];
		
	
		Address shp = new Address ("addis", "3th");
		order[0] = new Cusomer("john", "kassa", new Address("naz", "4th") , shp  ,"123-12-1212" );
		
		Address b = new Address("Chicago", "6th");
		Address sh = new Address ("Chicago", "6th");
		order[1] = new Cusomer("Yohannes", "yimam", b , sh  ,"123-123-123123" );
		
		
		for (Cusomer c : order) {
			
			if(c.getBillingAddress().getCity().equalsIgnoreCase("chicago")) {
				System.out.println(c);
			}
			
		}	
		
	}
	
}

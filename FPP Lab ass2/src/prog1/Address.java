package prog1;
public class Address {
	
	String city;
	String place;
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}


	public Address(String city, String place) {
		this.city = city;
		this.place = place;
	}

	
	
}

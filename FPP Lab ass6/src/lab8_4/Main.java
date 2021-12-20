package lab8_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Main {
	private List<Address> listOfAddresses;
	private StringBuilder output = new StringBuilder();
	public static void main(String[] args) {
		Main m = new Main();
		m.loadData();
		m.printAsUpperCase();
		
	
		
		
	}
	private void loadData(){
		listOfAddresses = new ArrayList<>();
		listOfAddresses.add(new Address("Jim", "101 Adams", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("Tom", "30 W. Burlington", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("Hal", "14 E. Court", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("Sally", "410 W. Jefferson", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("MUM", "1000 N. 4th St", "Fairfield", "IA", "52556"));
		

	}
	
	public void printAsUpperCase() {
		
		for (Address ad : listOfAddresses) {
			ad.getName().toUpperCase();
			ad.getCity().toUpperCase();
			ad.getState().toUpperCase();
			ad.getStreet().toUpperCase();
			ad.getZip().toUpperCase();
			
		}
		System.out.println(formatFields(listOfAddresses));
		
	}
	
	private String formatFields(List<Address> list) {
		
		String format = "%s \r\n"
				+ "%s \r\n"
				+ "%s, %s, %s \n\n";
		String result ="";
		
		for (Address s : list) {
			result += String.format(format, s.getName(),s.getStreet(),s.getCity(),s.getState(),s.getZip());
		}
		
		return result;
	}
	
	
	

}

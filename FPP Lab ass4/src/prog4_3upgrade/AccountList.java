package prog4_3upgrade;

import java.util.Arrays;

public class AccountList {

	public Account[] accountArray;
	int size;
	int index;
	
	public AccountList() {
		size = 3;
		index=0;
		accountArray = new Account[size];
	}
	
	public void add(Account data) {
		if(index == accountArray.length) {
			resize();
		}
		accountArray[index] = data;
		index++;	
	}

	public Account get(int i) {
		return accountArray[i];
	}

	public boolean remove(Account s) {
		if(size == 0) return false;
		
		int che= -1;
		int index=-1; 
		for(int i=0; i< accountArray.length; i++) {
			if(accountArray[i].equals(s)) {
				che++;
				index = i;
			}
		}
		if(che==0) {
			size--;
			Account[] temp = new Account[size];
			int j=0;
			for(int i=0; i<accountArray.length; i++) {
				if(index == i) {
					continue;
				}
				temp[j]= accountArray[i];
			}
			return true;
		} 
		return false;
	}
	
	public int size() {
		return accountArray.length;
	}
	
	private void resize() {
		System.out.println("Resizing...");
		int tempSize = size *2;
		Account[] temp = new Account[tempSize];
		System.arraycopy(accountArray, 0, temp, 0, accountArray.length);
		accountArray = temp;
		
	}
	
	@Override
	public String toString() {
		
		return "The list of size " + size() + " is " + Arrays.toString(accountArray);
	}
	
}

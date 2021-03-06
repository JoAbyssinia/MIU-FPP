package prog7_3;

import java.util.Hashtable;
import java.util.LinkedList;

/**
 * Recursively merges two sorted linked lists
 *
 */
public class Merge {
	LinkedList<Integer>  list3 = new LinkedList<>();
	
	public LinkedList<Integer> merge(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		
		if(list1.size()==0 && list2.size()==0) return list3;	
			  
		  if(list1.size()!= 0 && list2.size()==0 ) {
			  list3.add(list1.pop());
			  return merge(list1, list2);
		  }
		  
		  if(list2.size()!= 0 && list1.size()==0 ) {
			  list3.add(list2.pop());
			  return merge(list1, list2);
		  }  
		
		if(list1.peek() < list2.peek()) {
			list3.add(list1.pop());
		}else {
			list3.add(list2.pop());
		}
		
		return merge(list1, list2);
	}
	//test your code
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		list1.add(4);list1.add(5);list1.add(21);list1.add(25);
		list2.add(2);list2.add(9);list2.add(17);
		Merge m = new Merge();
		LinkedList list3 = m.merge(list1, list2);
		if(list3 != null) System.out.println(list3);
		
	}
}

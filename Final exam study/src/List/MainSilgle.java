package List;

import java.util.Iterator;

public class MainSilgle {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.addFirst(1);
		list.addLast(2);
		list.removeByValue(2);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		list.addLast(6);
		list.addLast(8);
		list.addLast(9);
//		System.out.println(list.size());
//		System.out.println(list);
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
	}
}

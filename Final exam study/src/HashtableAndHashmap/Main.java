package HashtableAndHashmap;

import java.util.Hashtable;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student("Yohannes Kassa", 11);
		Student s2 = new Student("Yohannes Asheber", 12);
		Student s3 = new Student("Amanuel Kassa", 13);
		Student s4 = new Student("Genet tegery", 14);
		
		
		Course c1 = new Course("Java", 4);
		Course c2 = new Course("c++", 4);
		
		
		Hashtable<Student, Course> table = new Hashtable<Student, Course>(); 

		table.put(s1, c1);
		table.put(s2, c1);
		table.put(s3, c2);
		table.put(s4, c2);
		
		
		System.out.println("this is it "+ table.entrySet());
		System.out.println();
		System.out.println(table.get(s1));
		for(Student st :table.keySet()) {
			System.out.println(table.containsKey(st));
		}
	
		for(Entry<Student, Course> entry  : table.entrySet()){
			
//			System.out.println(entry.getValue());
		}
		
		for(Student st : table.keySet()) {
//			System.out.println(st);
		}
	}

}






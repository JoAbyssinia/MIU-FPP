package classExerciess;

import java.util.Hashtable;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
			
		Student s1 = new Student("john kass",123);
		Student s2 = new Student("john kass",123);
		Student s3 = new Student("Amanuel kass",321);
		Student s4 = new Student("Bereket tezera",456);
		Student s5 = new Student("yohannes Asheber",544);
		Student s6 = new Student("Abel Shewarega",789);
		Student s7 = new Student("Yonas semire",123);
		
		Detail d1 = new Detail("compro","November2021");
		Detail d2 = new Detail("MBA","November2021");
		
		Hashtable<Student, Detail> list = new Hashtable<>();
		list.put(s1, d1);
		list.put(s2, d1);
		list.put(s3, d1);
		list.put(s4, d1);
		list.put(s5, d2);
		list.put(s6, d2);
		list.put(s7, d2);
		
		
		
		for (Entry<Student, Detail> stu : list.entrySet()) {
			
			System.out.print(stu.getKey());
			System.err.println(" "+stu.getValue());
		}
		
		
//		System.out.println(list);
		
	}
}

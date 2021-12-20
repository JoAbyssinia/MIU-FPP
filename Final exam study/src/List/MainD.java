package List;

public class MainD {

	public static void main(String[] args) {
		
		Doublylikendlist db = new Doublylikendlist();
		
		db.addFirst("c");
		db.addFirst("b");
		db.addFirst("a");
		db.addLast("d");
		db.addLast("e");
		db.addLast("f");
		db.addLast("g");
		db.Insert("john", 3);
		db.delete("e");
		
		System.out.println(db);
		System.out.println(db.find("john"));
		
	}
}

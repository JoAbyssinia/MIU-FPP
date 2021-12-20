import java.util.Comparator;

public class sortByNameDescending implements Comparator<Account>{

	@Override
	public int compare(Account o1, Account o2) {
		return o1.getName().compareTo(o2.getName()) * -1;
	}

}

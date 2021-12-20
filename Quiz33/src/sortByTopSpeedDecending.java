

import java.util.Comparator;

public class sortByTopSpeedDecending implements Comparator<Vehicle>{

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		return (int) (o1.getTopSpeed() - o2.getTopSpeed()) * -1;
	}

}

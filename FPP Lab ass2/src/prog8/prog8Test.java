package prog8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class prog8Test {

	@Test
	void test() {
		int [] data = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		
		int minValue = Prog8.min(data);
		int expectedValue = -22;
		assertTrue(expectedValue == minValue);
	}

}

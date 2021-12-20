package prog6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TestProg6 {
	
	String[] testData = {"horse", "dog", "cat", "horse","dog"};
	Prog6 prog6 = new Prog6();
	@Test
	void testRemoveDups() {
		String[] result = prog6.removeDups(testData);
		String[] expected = {"horse", "dog", "cat"};
		assertTrue(Arrays.equals(result,expected));
		
		int matchExpect = 3;
		int matchCounter = 0;
		for (String ex : expected ) {
			for (String data : testData) {
				if(ex.equals(data)) {
					matchCounter ++;
					break;
				}
			}
		}
		assertTrue(Arrays.equals(result,expected) && matchCounter==matchExpect);
		
	}

}

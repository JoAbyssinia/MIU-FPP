package prog6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TestProg6Agian {

	String[] testData = {"horse", "dog", "cat", "horse","dog"};
	Prog6 prog6 = new Prog6();
	@Test
	void test() {
		
		String[] result = prog6.removeDups(testData);
		String[] expected = {"horse", "dog", "cat"};
		
		assertTrue(Arrays.equals(result,expected));
		
		
	}
	
	@Test
	void testRemoveDups() {
		String[] result = prog6.removeDups(testData);
		String[] expected = {"horse","dog","cat"};
		assertTrue(Arrays.equals(result,expected));
	}

}

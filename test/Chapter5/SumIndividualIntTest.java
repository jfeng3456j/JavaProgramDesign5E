package Chapter5;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class SumIndividualIntTest {
	
	SumIndividualInt sii = new SumIndividualInt();
	
	public SumIndividualIntTest() {
		
	}
	
	@Test
	public void testIndividualSum() {
		int input = 3456;
		int expected= 18;
		int actual = sii.getSum(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testNegativeIndividualSum() {
		int input = -3456;
		int expected= 18;
		int actual = sii.getSum(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void reverseArrayTest() {
		String expected = "1 2 3 4";
		String actual = sii.reverseArray("4 3 2 1");
		assertEquals(expected,actual);
		
	}

}

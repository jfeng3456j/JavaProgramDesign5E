package Chapter5;

import org.junit.Test;

import static junit.framework.Assert.*;

public class DivisibleElevenNumTest {
	
	DivisibleElevenNum  den= new DivisibleElevenNum();
	
	@Test
	public void testInputIntDivisible() {
		assertTrue(den.divisbleByEleven(8784204));
	}
	
	@Test
	public void testInputIntDivisibleNegative() {
		assertTrue(den.divisbleByEleven(-8784204));
	}
	
	@Test
	public void testInputIntNotDivislbe() {
		assertFalse(den.divisbleByEleven(54063297));
	}
	

}

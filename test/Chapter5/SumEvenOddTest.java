package Chapter5;

import JavaProgramDesign.Chapter5.SumEvenOdd;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SumEvenOddTest {
	
	SumEvenOdd seo = new SumEvenOdd();
	
	public SumEvenOddTest() {
		
	}
	
	@Test
	public void getEvenSum() {
		String actual = seo.getEvenOddSum("1 2 3 4 6 6");
		assertEquals("The sum of even numbers is " + 18 + " The sum of odd numbers is " + 4,actual);
	}
	

}

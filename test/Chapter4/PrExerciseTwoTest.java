package Chapter4;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

import java.util.Arrays;


public class PrExerciseTwoTest {
	
	public PrExerciseTwoTest() {
		
	}
	
	PrExerciseTwo pr2 = new PrExerciseTwo();
	
	@Test
	public void sortInputNumbr() {
		
		String input = "3 1 2";
		String[] expected = {"1","2","3"};
		String actual = pr2.sortInputNumber(input);
		assertEquals(Arrays.toString(expected),actual);
		
	}
	

}

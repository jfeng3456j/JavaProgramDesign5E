package Chapter4;

import JavaProgramDesign.Chapter4.PrExerciseOne;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class PrExerciseOneTest {
	public PrExerciseOneTest() {

	}

	PrExerciseOne pr1 = new PrExerciseOne();

	@Test
	public void testPositiveNumbr() {
		int input = 5;
		String result = pr1.checkNumber(5);
		assertEquals("The number is positive", result);
	}

	@Test
	public void testNegativeNumbr() {
		int input = -5;
		String result = pr1.checkNumber(input);
		assertEquals("The number is negative", result);
	}
	
	@Test
	public void testZeroNumbr() {
		int input = 0;
		String result = pr1.checkNumber(input);
		assertEquals("The number is zero", result);
	}
	
}

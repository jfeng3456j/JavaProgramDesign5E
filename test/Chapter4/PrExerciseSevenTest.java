package Chapter4;

import JavaProgramDesign.Chapter4.PrExerciseSeven;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PrExerciseSevenTest {
	
	public PrExerciseSevenTest() {
		
	}
	
	PrExerciseSeven pr7 = new PrExerciseSeven();
	
	@Test
	public void calRemainCookieTest() {
		int cookies = -1;
		String expected = "please enter at least 1";
		String actual = pr7.calcRemainCookie(cookies);
		assertEquals(expected, actual);
	}
	
	@Test
	public void calRemainCookieTest2() {
		int cookies = 100;
		String expected = "There are 4 cookies remaining";
		String actual = pr7.calcRemainCookie(cookies);
		assertEquals(expected, actual);
	}
	
	@Test
	public void calRemainContainTest3() {
		int cookies = 1824;
		String expected = "There are 1 containers remaining";
		String actual = pr7.calcRemainCookie(cookies);
		assertEquals(expected, actual);
	}

	@Test
	public void calRemainContainNumbTest4() {
		int cookies = 1800;
		String expected = "There are 75 boxes and 75 cookies containers";
		String actual = pr7.calcRemainCookie(cookies);
		assertEquals(expected, actual);
	}
	
}

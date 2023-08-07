package Chapter5;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CheckLockerStatusTest {
	
	CheckLockerStatus cls = new CheckLockerStatus();
	
	@Test
	public void testLockerTen() {
		String expected = "The open lockers number are: 9, 4, 1";
		String actual = cls.checkLockerState(10);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testLocker12() {
		String expected = "The open lockers number are: 9, 4, 1";
		String actual = cls.checkLockerState(12);
		assertEquals(expected,actual);
	}
}

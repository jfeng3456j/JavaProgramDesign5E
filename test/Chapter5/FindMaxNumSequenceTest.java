package Chapter5;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class FindMaxNumSequenceTest {
	
	FindMaxNumSequence fmns= new FindMaxNumSequence();
	
	@Test
	public void findMaxNum75() {
		int actual = fmns.getMaxNumSequnce(75);
		assertEquals(4, actual);
	}
	
	@Test
	public void findMaxNum11() {
		int actual = fmns.getMaxNumSequnce(75);
		assertNotEquals(5, actual);
	}

}

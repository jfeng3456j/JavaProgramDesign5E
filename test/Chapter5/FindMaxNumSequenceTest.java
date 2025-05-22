package Chapter5;

import JavaProgramDesign.Chapter5.FindMaxNumSequence;
import org.junit.Test;
import static org.junit.Assert.*;

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

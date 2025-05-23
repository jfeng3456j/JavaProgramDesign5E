package Chapter5;

import JavaProgramDesign.Chapter5.NumSequence;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
 
import java.util.Arrays;
import java.util.List;


public class NumSequnceTest {
	
	NumSequence ns = new NumSequence();

	@Test
	public void getSequenceTestOne() {
		List<Integer> expected = Arrays.asList(75, 226, 113, 340, 170, 85, 256, 128, 64, 32, 16, 8, 4, 2, 1);
		int input = 75;
		List<Integer> actual = ns.getSequence(input);
		assertEquals(expected, actual);
	}
	
	@Test
	public void getSequenceTestTwo() {
		List<Integer> expected = Arrays.asList(111, 334, 167, 502, 251, 754, 377, 1132, 566, 283, 850, 425, 1276, 638, 319, 958, 479, 1438, 719, 2158, 1079, 3238, 1619, 4858, 2429, 7288, 3644, 1822, 911, 2734, 1367, 4102, 2051, 6154, 3077, 9232, 4616, 2308, 1154, 577, 1732, 866, 433, 1300, 650, 325, 976, 488, 244, 122, 61, 184, 92, 46, 23, 70, 35, 106, 53, 160, 80, 40, 20, 10, 5, 16, 8, 4, 2, 1);
		int input = 111;
		List<Integer> actual = ns.getSequence(input);
		assertEquals(expected, actual);
	}
	

}

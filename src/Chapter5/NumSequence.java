package Chapter5;

import java.util.ArrayList;
import java.util.List;

public class NumSequence {
	
	public String question = "Suppose that the first number of a sequence is x, where x is an integer. Define a0 = x;  an+1= an /2 i fan is even; an+1 =3 * 􏰂an +1 if an is odd. \n"
			+ "Then there exists an integer k such that ak 1⁄4 1. Write a program that prompts the user to input the value of x. \n"
			+ "The program outputs the integer k such that ak = 1 and the numbers a0, a1, a2, ..., ak. \n"
			+ "(For example, if x = 75, then k = 14, and the numbers a0, a1, a2, . . ., a14, respectively, are 75, 226, 113, 340, 170, 85, 256, 128, 64, 32, 16, 8, 4, 2, 1.) \n"
			+ "Test your program for the following values of x: 75, 111, 678, 732, 873, 2048, and 65535.\n"
			+ "write junit tests \n";
	
	public List<Integer> getSequence(int input) {
		List<Integer> sequence = new ArrayList<>();
		
		if (input < 0 ) {
			System.out.println("Input cannot be negative");
			System.exit(0);
		}
		sequence.add(input);
		while (input > 1) {
			
			if (input % 2 == 0) {
				input /= 2;
				sequence.add(input);
			} else {
				input = 3 * input + 1;
				sequence.add(input);
			}
		}
		
		return sequence;
	}

	
}

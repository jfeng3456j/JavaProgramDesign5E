package JavaProgramDesign.Chapter5;

import java.util.Arrays;
import java.util.Collections;

public class SumIndividualInt {
	
	public String question = "Write a program that prompts the user to input an integer and then outputs both the individual digits of the number and the sum of the digits. \n"
			+ "For example, the program should: output the individual digits of 3456 as 3 4 5 6 and the sum as 18,  \n"
			+ "output the individual digits of 8030 as 8 0 3 0 and the sum as 11,  \n"
			+ "output the individual digits of 2345526 as 2 3 4 5 5 2 6 and the sum as 27, \n"
			+ "output the individual digits of 4000 as 4 0 0 0 and the sum as 4, and \n"
			+ "output the individual digits of -2345 as 2 3 4 5 and the sum as 14.  \n"
			+ "write unit tests \n";
	
	public int getSum(int input) {
		
		int remainder;
		int sum =0;
		String output = "";
		
		if (input < 0) {
			input *=-1;
		}

		while (input > 0) {
			//repeatedly get the remainder of the input % 10;
			remainder = input  % 10;
			sum += remainder;
			
			//get the individual digit from input by using input /10
			input = input / 10;
			
			output += remainder +" ";
		}
		
		System.out.println("The sum of the "+ reverseArray(output) +"individual digits is " + sum);
		
		return sum;
	}
	
	public String reverseArray(String arr) {
		String[] reverse = arr.split("\\s");
		Collections.reverse(Arrays.asList(reverse));
		return Arrays.toString(reverse);
	}

}

package Chapter2;

import java.util.*;
import Utils.HelperMethods;

public class JavaPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		String question = "A permutation of three objects, a, b, and c, is any arrangement of these objects in a row. For example,\n" + 
				"some of the permutations of these objects are abc, bca, and cab.\n" + 
				"The number of permutations of three objects is 6. Suppose that these three objects are strings.\"\n" + 
				"Write a program that prompts the user to enter three strings. The program then outputs the six permutations of those strings.";
		
		String input;
		
		HelperMethods.problemDescription(question);
		System.out.print("Enter a string for permutation");
		input = scanner.next();
		
		getPermutation(input, "");
	}
	
	
	public static void getPermutation(String input, String output) {
		
		if (input.length() == 0) {
			System.out.println(output);
			return;
		}
		
		for (int i =0; i<input.length(); i++) {
			
			//extract the first char and store in output var
			char charc = input.charAt(i);
			
			//substring(0,0) returns nothing
			String remainChar = input.substring(0,i) + input.substring(i+1);
			getPermutation(remainChar, output + charc);
			
		}
		
		
	}
	
	
}

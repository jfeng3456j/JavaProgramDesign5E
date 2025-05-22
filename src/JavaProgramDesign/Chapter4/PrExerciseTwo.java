package JavaProgramDesign.Chapter4;

import java.util.Arrays;
import java.util.stream.Stream;

public class PrExerciseTwo {
	
	String question ="Question 2: \n" 
	+"Write a program that prompts the user to input three numbers.\n"
	+ "The program should then output the numbers in nondescending order. \n"
	+ "write junit tests\n";
	
	
	public String sortInputNumber(String input) {
		String[] listNum =input.split("\\s+");
		int [] arr = Stream.of(listNum).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(arr);
		return Arrays.toString(arr);
	}

}

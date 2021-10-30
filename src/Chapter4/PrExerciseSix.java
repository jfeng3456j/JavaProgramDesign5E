package Chapter4;

import java.util.stream.Stream;

public class PrExerciseSix {
	
	String question = "Question 6: \n"
			+ "In a right triangle, the square of the length of one side is equal to the sum of the squares of the lengths of the other two sides.\n"
			+ "Write a program that prompts the user to enter the lengths of three sides of a triangle and then outputs a message indicating \n"
			+ "whether the triangle is a right triangle. \n"
			+ "write unit tests \n";
	
	public String checkTriangle(String input) {
		String result;
		String[] length = input.split("\\s+");
		int [] arr = Stream.of(length).mapToInt(Integer::parseInt).toArray();
		if ((arr[0] == (arr[1]+arr[2])) || (arr[1]==(arr[0]+arr[2])) || (arr[2]==(arr[0]+arr[1]))) {
			result = "This is a right triangle";
		} else {
			result = "This isn't a right triangle";
		}
		return result;
	}

}

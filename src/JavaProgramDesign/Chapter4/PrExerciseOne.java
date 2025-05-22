package JavaProgramDesign.Chapter4;

import Utils.HelperMethods;

public class PrExerciseOne {
	

	String question = "Question 1: \n"
			+ "Write a program that prompts the user to input a number.\n"
			+ "The program should then output the number and a message saying whether the number is positive, negative, or zero.\n"
			+ "Write unit tests\n";
	
	public String checkNumber(int number) {
		String result = "";
		if (number >0) {
			result = "The number is positive";
		} else if (number < 0) {
			result= "The number is negative";
		}
		else {
			result = "The number is zero";
		}
		
		return result;
		
	}
	
}

package JavaProgramDesign.Chapter4;

import java.util.Scanner;

import Utils.HelperMethods;

public class ProgrammingExercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
//		PrExerciseOne pr1 = new PrExerciseOne();
//		
//		HelperMethods.problemDescription(pr1.question);
//		int input1 = HelperMethods.scannerInt(sc);
//		System.out.println(pr1.checkNumber(input1));
		
		
//		HelperMethods.printLine();
//		PrExerciseTwo pr2 = new PrExerciseTwo();
//		HelperMethods.problemDescription(pr2.question);
//		String input2 = HelperMethods.scannerStr(sc);
//		System.out.println("sorted array is "+ pr2.sortInputNumber(input2));
		
//		HelperMethods.printLine();
//		PrExerciseSix pr6 = new PrExerciseSix();
//		HelperMethods.problemDescription(pr6.question);
//		String input3 = HelperMethods.scannerStr(sc);
//		System.out.println("Result: " + pr6.checkTriangle(input3));
		
		
//		HelperMethods.printLine();
//		PrExerciseSeven pr7 = new PrExerciseSeven();
//		HelperMethods.problemDescription(pr7.question);
//		int input4 = HelperMethods.scannerInt(sc);
//		System.out.println("Result: " + pr7.calcRemainCookie(input4));
		
		HelperMethods.printLine();
		PrExerciseTwelve pr12 = new PrExerciseTwelve();
		HelperMethods.problemDescription(pr12.question);
		pr12.readFile("87324", "c");
}
}

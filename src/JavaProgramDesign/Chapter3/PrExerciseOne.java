package JavaProgramDesign.Chapter3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

import Utils.HelperMethods;

public class PrExerciseOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrExerciseOne pr1 = new PrExerciseOne();

		String question = "a. Write Java statements that import the classes Scanner, FileReader, and PrintWriter from the packages java.util and java.io.\n"
				+ "b. Write statements that declare inFile to be a reference variable of type Scanner and outFile to be a reference variable of type PrintWriter.\n"
				+ "c. The program will read data from the file inData.txt and write output to the file outData.dat. Write statements to open both these files, associate inFile with inData.txt, and associate outFile with outData.dat.\n"
				+ "d. Suppose that the file inData.txt contains the following data:\n" + "10.20 5.35\n" + "15.6\n"
				+ "Randy Gill 31\n" + "18500 3.5\n" + "A\n" + "Rectangle:\n"
				+ "Length = 10.20, width = 5.35, area = 54.57, parameter = 31.10\n" + "Circle:\n"
				+ "Radius = 15.60, area = 764.54, circumference = 98.02\n" + "Name: Randy Gill, age: 31\n"
				+ "Beginning balance = $18500.00, interest rate = 3.50\n"
				+ "Balance at the end of the month = $18553.96\n"
				+ "The character that comes after A in the ASCII set is B\n"
				+ "e. Write the statement that closes the output file.\n"
				+ "f. Write a Java application program that tests the Java statements that you wrote in parts a–e.";

		HelperMethods.problemDescription(question);
		pr1.javaIOFile();

	}

	public void javaIOFile() {
		try {
			Scanner sc = new Scanner(new FileReader("./src/Chapter3/PrExerciseIOFile/inData.txt"));
			PrintWriter outFile = new PrintWriter("./src/Chapter3/PrExerciseIOFile/outData.dat");
			// get retangle length and width from the file
			double length = sc.nextDouble();
			double width = sc.nextDouble();
			// call calcRetangleMethod()
			System.out.println(calcParameterArea(length, width));
			saveData(outFile, calcParameterArea(length, width));
			
			// get circle radius
			double radius = sc.nextDouble();
			// call CircumferenceRadius
			System.out.println(calcCircumferenceRadius(radius));
			saveData(outFile, calcCircumferenceRadius(radius));
			
			String fName = sc.next();
			String lName = sc.next();
			int age = sc.nextInt();
			System.out.println(printString(fName, lName, age));
			saveData(outFile, printString(fName, lName, age));

			double amt = sc.nextDouble();
			double interest = sc.nextDouble();
			System.out.println(printInterest(amt, interest));
			saveData(outFile, printInterest(amt, interest));
			
			System.out.println(calcBalance(amt, interest));
			saveData(outFile, calcBalance(amt, interest));

			String ch = sc.next();
			System.out.println(printASCII(ch));
			saveData(outFile, printASCII(ch));
			
			outFile.close();
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("error: " + e.getMessage());
		}

	}

	public String calcParameterArea(double length, double width) {
		HelperMethods.printLine();
		double paramter = 2 * length + 2 * width;
		double area = length * width;
		String rectangle = "Rectangle: \n" + "Length = " + length + ", " + "width = " + width + "," + " area = "
				+ String.format("%.2f", area) + "," + " parameter = " + String.format("%.2f", paramter);
		return rectangle;
	}

	public String calcCircumferenceRadius(double radius) {
		double area = 3.14 * Math.pow(radius, 2);
		double circumference = 2 * 3.14 * radius;
		String circle = "Circle: \n" + "Radius = " + radius + "," + " area = " + String.format("%.2f", area) + ","
				+ " circumference = " + String.format("%.2f", circumference);
		return circle;
	}

	public String printString(String fName, String lName, int age) {
		return "Name: " + fName + " " + lName + ", " + "age: " + age;
	}

	public String printInterest(double amount, double interest) {
		return "Beginning balance = $: " + amount + ", " + "interest rate = " + interest;
	}

	public String calcBalance(double amount, double interest) {
		double balance = amount * (1 + interest / 100 / 12);
		return "Balance at end of the month = $" + String.format("%.2f", balance);
	}

	public String printASCII(String ch) {
		return "The character that comdes after " + ch + " in the ASCII set is B";
	}

	public void saveData(PrintWriter writeFile, String inputData) {
		writeFile.println(inputData);
		writeFile.flush();
	}

}

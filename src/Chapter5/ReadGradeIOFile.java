package Chapter5;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadGradeIOFile {
	
	private String firstName;
	private String lastName;
	private double testScore;
	private char grade = ' ';
	private double classAvg;
	private double sum;
	private int count =0;
	
	public String question = "Question: calculating student grade from a text file";
	
	public void getGrade(String fileName) throws IOException {
		Scanner sc = new Scanner(new FileReader(fileName));
		PrintWriter outFile = new PrintWriter("./src/Chapter5/PrExerciseFile/OutGrade.dat");
		
		while(sc.hasNext() ) {
			String fName = sc.next();
			String lName = sc.next();
			testScore = sc.nextDouble();
			
			sum += testScore;
			count++;
			int gradeScore = (int)testScore / 10;
			if(gradeScore <=5) {
				grade = 'F';
			} 
			else if (gradeScore ==6) {
				grade ='D';
			} 
			else if (gradeScore ==7) {
				grade ='C';
			}
			else if (gradeScore ==8) {
				grade ='B';
			} 	
			else if (gradeScore >=9) {
				grade ='A';
			} else {
				System.out.println("Invalid Score.");
			}
			
			outFile.printf("%-12s %-12s %-5.2f %c %n", fName, lName, testScore,grade);
			
		}
		
		if (count != 0 ) {
			outFile.println();
			outFile.printf("class avg is %.2f %n", sum/count);
		}
		
		
		outFile.close();
		
	}


}

package JavaProgramDesign.Chapter5;

import java.io.IOException;
import java.util.Scanner;

public class ProgrammingExercise {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
//		MultiplicationTable mt = new MultiplicationTable();
//		HelperMethods.problemDescription(mt.question);
//		mt.printTable();
//		HelperMethods.printLine();
		
		
//		ReadGradeIOFile rgo = new ReadGradeIOFile();
//		HelperMethods.problemDescription(rgo.question);
//		rgo.getGrade("./src/Chapter5/PrExerciseFile/GradeData.txt");
//		HelperMethods.printLine();
//		
//		
//		SumIndividualInt sii = new SumIndividualInt();
//		HelperMethods.problemDescription(sii.question);
//		int input = HelperMethods.scannerInt(sc);
//		sii.getSum(input);
//		HelperMethods.printLine();
		
//		SumEvenOdd seo = new SumEvenOdd();
//		String input = HelperMethods.scannerStr(sc);
//		System.out.println(seo.getEvenOddSum(input));
//		HelperMethods.printLine();
		
//		CheckPrimeNum cpn = new CheckPrimeNum();
//		int input = HelperMethods.scannerInt(sc);
//		System.out.println(cpn.checkPrime(input));
//		HelperMethods.printLine();
		
//		DivisibleElevenNum den = new DivisibleElevenNum();
//		HelperMethods.problemDescription(den.question);
//		int input = HelperMethods.scannerInt(sc);
//		den.divisbleByEleven(input);
//		HelperMethods.printLine();

//		NumSequence ns = new NumSequence();
//		HelperMethods.problemDescription(ns.question);
//		int input = HelperMethods.scannerInt(sc);
//		System.out.println(ns.getSequence(input).toString());
		
		CheckLockerStatus cls = new CheckLockerStatus();
		System.out.println(cls.checkLockerState(100));
		
		
		
	}

}

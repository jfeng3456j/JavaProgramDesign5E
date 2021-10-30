package Chapter5;

import java.util.stream.Stream;

public class SumEvenOdd {
	
	String question ="Write a program that reads a set of integers, and then finds and prints the sum of the even and odd integers.\n"
			+"write unit tests \n";
	
	public String getEvenOddSum(String input) {
		String evenNum ="";
		String oddNum = "";
		int evenSum = 0;
		int oddSum = 0;
		
		String[] strNum = input.split("\\s");
		
		//convert all strNum to int
		int[] intNum = Stream.of(strNum).mapToInt(Integer::parseInt).toArray();
		
		for (int i =0; i<intNum.length; i++) {
			
			
			if (intNum[i] % 2 ==0) {
				evenSum += intNum[i];
				evenNum += intNum[i] +" ";
			}
			else {
				oddSum += intNum[i];
				oddNum += intNum[i] +" ";
			}
		}
		System.out.println("The even numbers are " + evenNum);
		System.out.println("The odd numbers are " + oddNum);
		return "The sum of even numbers is " + evenSum + " The sum of odd numbers is " + oddSum;
	}


}

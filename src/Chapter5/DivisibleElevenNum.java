package Chapter5;

public class DivisibleElevenNum {
	
	public String question = "Let n 1⁄4 akak-1ak-2...a1a0 be an integer. Let t 1⁄4 a0 – a1 + a2 – ... + (–1)k ak. It is known that n is divisible by 11 if and \n"
			+ "only if t is divisible by 11. For example, suppose that n 1⁄4 8784204. Then, t 1⁄4 4 – 0 + 2 – 4 + 8 – 7 + 8 1⁄4 11. \n"
			+ "Because 11 is divisible by 11, it follows that 8784204 is divisible by 11. If n 1⁄4 54063297, then t 1⁄4 7 – 9 + 2 – 3 + 6 – 0 + 4 – 5 1⁄4 2. \n"
			+ "Because 2 is not divisible by 11, 54063297 is not divisible by 11. \n" 
			+ "Write a program that prompts the user to enter a positive integer and then uses this criteria to determine whether the number is divisible by 11. \n"
			+ "write unit tests";
	
	public boolean divisbleByEleven(int input) {
		int sum = 0;
		boolean divisibleEleven = false;
		
		if (input <0) {
			input *=-1;
		}

		while (input > 0) {
			//input is 12
			
			//get the remainder which is the last digit, 12 % 10 -> 2, store the remainder in sum
			sum += input %10;
		
			//repeatedly remove last digit by input / 10, 12 / 10 -> 1
			input = input / 10; //input is 1
			
			sum -= input % 10; //2 -1
			
			input = input /10; // 1/10->0.10 break
			
		}
		
		if (sum % 11 ==0) {
			System.out.println("input is divisible by eleven, sum is " + sum);
			divisibleEleven = true;
		} else  {
			System.out.println("input is not divisible by eleven, sum is " + sum);
			divisibleEleven = false;
		}
		
		return divisibleEleven;
	}
	

}

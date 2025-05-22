package JavaProgramDesign.Chapter5;

public class CheckPrimeNum {
	
	String question = "Write a program that prompts the user to input a positive integer.\n"
			+ " It should then output a message indicating whether the number is a prime number. (Note: 2 is the only even number that is prime. \n"
			+ "An odd integer is prime if it is not divisible by any odd integer less than or equal to the square root of the number.)\n"
			+"write unit test";
	
	public boolean checkPrime(int num) {
		boolean prime = true;
		
		for (int i =2; i <= num/2; ++i) {
			//check for nonprime
			if (num % i == 0) {
				prime  = false;
				break;
			}
		}
		
		if (prime) {
			System.out.println(num + " is a prime number " + !prime);
		} else {
			System.out.println(num + " is not a prime number " + !prime);
		}
		
		
		return prime;
	}

}

package JavaProgramDesign.Chapter5;


public class CheckLockerStatus {
	
	String question = "A high school has 1000 students and 1000 lockers, one locker for each student. On the first day of school, the principal plays the following game: She asks the first student to open all the lockers.\n"
			+ "She then asks the second student to close all the even-numbered lockers. The third student is asked to check every third locker. If it is open, the student closes it; \n"
			+ "if it is closed, the student opens it. The fourth student is asked to check every fourth locker. If it is open, the student closes it; if it is closed, \n"
			+ "the student opens it. The remaining students continue this game. In general, the nth student checks every nth locker. If the locker is open, the student closes it; \n"
			+ "if it is closed, the student opens it. After all the students have taken their turns, some of the lockers are open and some are closed. \n"
			+ "Write a program that prompts the user to enter the number of lockers in a school. After the game is over, the program outputs the number of lockers and the locker numbers of the lockers that are open. \n"
			+ "Test run your program for the following inputs: 1000, 5000, and 10,000. Do you see any pattern developing for the locker numbers that are open in the output?\n" 
			+ "(Hint: Consider locker number 100. This locker is visited by student numbers 1, 2, 4, 5, 10, 20, 25, 50, and 100. \n"
			+ "These are the positive divisors of 100. Similarly, locker number 30 is visited by student numbers 1, 2, 3, 5, 6, 10, 15, and 30. \n"
			+ "Note that if the number of positive divisors of a locker number is odd, then at the end of the game the locker is open. If the number of positive divisors of a locker number is even, \n"
			+ "then at the end of the game the locker is closed.)"
			+"write unit test. \n";
	
	public String checkLockerState(int input) {
		String status = "close";
		String result ="";
		int counter = 0;
		for (int i = input; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				if ( i % j == 0) {
					counter++;
				}
			}
			if (counter % 2 ==1) {
				status = "open";
				result += i +", ";
			}
			counter = 0;
		}
		
		return "The "+ status + " lockers number are: " + result.substring(0,result.length()-2);
	}
	

}

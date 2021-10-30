package Chapter4;

public class PrExerciseSeven {
	
	String question = "Question 7: \n"
			+"A box of cookies can hold 24 cookies and a container can hold 75 boxes of cookies. \n"
			+"Write a program that prompts the user to enter the total number of cookies. \n"
			+"The program then outputs the number of boxes and the number of containers to ship the cookies. \n"
			+"Note that each box must contain the specified number of cookies and each container must contain the specified number of boxes. \n"
			+"If the last box of cookies contains less than the number of specified cookies, you can discard it, and output the number of leftover cookies. \n" 
			+"Similarly, if the last container contains less than the number of specified boxes, you can discard it, and output the number of leftover boxes. \n"
			+"write junit tests \n ";
	
	public String calcRemainCookie(int cookies) {
		int totalCookiesInBox = 24;
		int totalBoxInContainer = 75;
		String result="";
		
		if (cookies < 0) {
			return result  = "please enter at least 1";
		}
		
		int remainCookies = cookies % totalCookiesInBox;
		
		if (remainCookies > 0) {
			return result  = "There are "+remainCookies+ " cookies remaining";
		}
		
		int containNumb  = cookies / totalCookiesInBox;
		
		if (containNumb % totalBoxInContainer >=1) {
			return result = "There are "+containNumb % totalBoxInContainer+ " containers remaining";
		}
		
		result  = "There are " + cookies/totalCookiesInBox + " boxes" + " and " + containNumb +" cookies containers";
		
		return result;
		
	}
			

}

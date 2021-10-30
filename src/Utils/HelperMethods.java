package Utils;

import java.util.Scanner;

public class HelperMethods {
	
	public static void problemDescription (String question) {
		System.out.println(question);
	}
	
	public static void printLine() {
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println();
	}
	
	public static int scannerInt(Scanner sc) {
        System.out.println("Enter a number");
        int number = sc.nextInt();
        return number;
	}
	
	public static String scannerStr(Scanner sc) {
        System.out.println("Enter a list of number separate by space");
        String number = sc.nextLine();
        return number;
	}

}

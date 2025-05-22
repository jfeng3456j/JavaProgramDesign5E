/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProgramDesign.Chapter2;

import java.util.Scanner;

/**
 *
 * @author Feng-iMac
 */
public class MakeChange {

    static int totalCents = 0;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total changes in cents: ");
        totalCents = sc.nextInt();
        System.out.println("The number of half dollars is " + convertHalfDollar(totalCents));
        System.out.println("The number of quarters is " + convertToQuarter(totalCents));
        System.out.println("The number of dimes is " + convertToDime(totalCents));
        System.out.println("The number of nickel is " + convertToNickel(totalCents));
        System.out.println("The number of cents is " + convertToCent(totalCents));
    }

    static public int convertHalfDollar(int totalCents) {
        return totalCents / 50;
    }

    static public int convertToQuarter(int totalCents) {
        int HalfDollarRemainder = totalCents % 50;
        return HalfDollarRemainder / 25;
    }

    static public int convertToDime(int totalCents) {
        int halfDollarRemainder = totalCents % 50;
        int quarterRemainder = halfDollarRemainder % 25;
        return quarterRemainder / 10;
    }

    static public int convertToNickel(int totalCents) {
        int halfDollarRemainder = totalCents % 50;
        int quarterRemainder = halfDollarRemainder % 25;
        int dimeRemainder = quarterRemainder % 10;
        return dimeRemainder / 5;
    }

    //can simplify into 1 single function here and do a print out system for each currency and
    //test this one function but with different variables
    static public int convertToCent(int totalCents) {
        int halfDollarRemainder = totalCents % 50;
        int quarterRemainder = halfDollarRemainder % 25;
        int dimeRemainder = quarterRemainder % 10;
        int nickleRemainder = dimeRemainder % 5;
        return nickleRemainder / 1;
    }
}

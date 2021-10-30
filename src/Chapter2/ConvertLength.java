/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter2;

import java.util.Scanner;
/**
 *
 * @author Feng-iMac
 */
public class ConvertLength {
    static final double CENTIMETER_PER_INCHES = 2.54;
    static final int INCHES_PER_FOOT = 12;
    static int totalInches=0;
    
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter feet: ");
        int feet  = sc.nextInt();
        System.out.println();
        System.out.println("Enter inches: ");
        int inches = sc.nextInt();
        totalInches = convertToInches(feet,inches);
        System.out.println("The total number of inches = " + totalInches);
        System.out.println("The number of centimeters = " + convertToCent(totalInches));
    }
    
    public static int convertToInches(int feet, int inches) {
        return (feet * 12) + inches;
    }
    
    public static double convertToCent(int totalInches) {
        return (totalInches) * CENTIMETER_PER_INCHES;
    }
    
}

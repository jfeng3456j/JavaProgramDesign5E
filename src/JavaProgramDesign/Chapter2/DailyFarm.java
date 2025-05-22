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
public class DailyFarm {
    static final double milkCarton = 3.78;
    static final double cost = 0.38;
    static final double profitPerCarton = 0.27;
    static double milkProduced =0.0;
    
    public static void main (String args[]) {
        int cartons;
        Scanner sc = new Scanner(System.in);
        problem();
        System.out.println("Enter the total amount of milk produced in liter in this morning: ");
        milkProduced = sc.nextDouble();
        cartons = totalMilkCarton(milkProduced);
        System.out.println("The total Amount of milk carton needed is " + cartons);
        System.out.println("The total cost for " + milkProduced + " liter of milk is " + calcCost(milkProduced, cost));
        System.out.println("The total profit of " + cartons + " cartons of milk is " + calcProfit(cartons, profitPerCarton));
    }     
    
    static public void problem() {
    	System.out.println("A milk carton can hold 3.78 liters of milk. Each morning, a dairy farm ships cartons of milk to a local grocery store. "
    			+ "The cost of producing one liter of milk is $0.38, and the profit of each carton of milk is $0.27. Write a program that does the following:\n" + 
    			"a. Prompts the user to enter the total amount of milk produced in the morning\n" + 
    			"b. Outputs the number of milk cartons needed to hold milk (Round your answer to the nearest integer.)\n" + 
    			"c. Outputs the cost of producing milk\n" + 
    			"d. Outputs the profit for producing milk");
    }
    
    static public int totalMilkCarton (double milkProduced) {
        
        return (int)Math.round(milkProduced/milkCarton);
    }
    
    static public double calcCost (double milkProduced, double cost) {
        double totalCost = milkProduced * cost;
        return Math.round(totalCost*100.0)/100.0;
    }
    
    static public double calcProfit (int carton, double profitPerCarton) {
        double profit = carton * profitPerCarton;
        return Math.round(profit * 100.0)/100.0;
    }
    
   
    
}

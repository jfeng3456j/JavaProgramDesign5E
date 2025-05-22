/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProgramDesign.Chapter3;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Feng-iMac
 */
public class JavaFileIO {
   
    public static void main (String[] args) throws FileNotFoundException {
        Scanner inFile = new Scanner (new FileReader("./Src/Chapter3/employeeData.txt"));
        
        String fName;
        String lName;
        
        double hoursWorked;
        double payRate;
        double wages;
        
        fName = inFile.next();
        lName = inFile.next();
        
        hoursWorked = inFile.nextDouble();
        payRate = inFile.nextDouble();
        
        wages = hoursWorked * payRate;
        
        System.out.printf("hoursWorked= %.2f , payRate = $%.2f, wages = $%.3f", hoursWorked,payRate,wages);
        
        inFile.close();
        
    }
}

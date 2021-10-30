/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Feng-iMac
 */
public class JavaIOStudentGrade {

    public static void main(String[] args) throws FileNotFoundException {
        JavaIOStudentGrade js= new JavaIOStudentGrade();
        
        Scanner sc = new Scanner(new FileReader("./Src/Chapter3/grade.txt"));
        
        System.out.printf("The average grade is: %.2f", js.calcGrade(sc));
                
    }

    public double calcGrade(Scanner sc) {
        double test1, test2, test3, test4, test5, avg;

        test1 = sc.nextDouble();
        test2 = sc.nextDouble();
        test3 = sc.nextDouble();
        test4 = sc.nextDouble();
        test5 = sc.nextDouble();
        avg = (test1 + test2 + test3 + test4 + test5) / 5.0;
        
        sc.close();
        return avg;
    }

}

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
public class JavaOutFileIO {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new FileReader("./Src/Chapter3/Ex20Input.txt"));
            System.out.printf("The sum is = %d", calcSum(sc));
        } catch (FileNotFoundException e) {
            System.out.println("File can't be found");
            e.fillInStackTrace();
        }

    }

    public static int calcSum(Scanner sc) {
        int num1, num2;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        saveSum(num1, num2);
        sc.close();
        return num1 + num2;
    }

    public static String saveSum(int num1, int num2) {
        PrintWriter outFile = null;
        String str;
        try {
            outFile = new PrintWriter("./Src/Chapter3/Ex20Output.dat");
            outFile.println("Sum = " + (num1 + num2));
            str = "data is Saved";
        } catch (FileNotFoundException e) {
            str = "file can't be created";
            e.printStackTrace();
        }

        outFile.close();
        return str;
    }
;

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProgramDesign.Chapter3;

/**
 *
 * @author Feng-iMac
 */
public class StringMethodFormat {
    
    public static void main (String[] args) {
        double x = 15.674;
        double y = 235.73;
        double z = 9525.9863;
        int num = 83;
        String str;
        
        System.out.println("123456789012345678901234567890");
        System.out.println(String.format("%.2f", x)); //2 decimal places
        System.out.println(String.format("%.3f", y)); //3 decimal places
        System.out.println(String.format("%.2f", z)); 
        
        System.out.println(String.format("%7s", "Hello")); //starts at 7 space
        System.out.println(String.format("%5d%7.2f", num,x));
        
        System.out.println(String.format("The value of " + "num = %5d", num));
        
        str = String.format("%.2f", z);
        System.out.println(str);
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3;

import javax.swing.JOptionPane;


/**
 *
 * @author Feng-iMac
 */
public class JOptionPaneExample {
    
    public static void main (String[] args) {
    
        double radius;
        double area;
        double circumference;
        
        String radiusString;
        String outputStr;
        
        radiusString = JOptionPane.showInputDialog("Enter the Radius: ");
        
        radius = Double.parseDouble(radiusString);
        
        area = Math.PI * Math.pow(radius, 2);
        
        circumference = Math.PI * (2 * radius);
        
        
        //String.format(formatString, arg) formatString = %.2f (2 decimal places
        outputStr = "Radius: " + radius + "\n" + "Area: " + String.format("%.2f", area) + " square units \n" + "Circumference: " + String.format("%.2f", circumference) + " units";
        
        JOptionPane.showMessageDialog(null, outputStr, "Circle", JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
        
    }
    
}

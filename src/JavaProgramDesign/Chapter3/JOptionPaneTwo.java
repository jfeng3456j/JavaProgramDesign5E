/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaProgramDesign.Chapter3;

import javax.swing.JOptionPane;

/**
 *
 * @author Feng-iMac
 */
public class JOptionPaneTwo {
    
    public static void main (String[] args) {
        JOptionPaneTwo jopt = new JOptionPaneTwo();
        jopt.printOptionPane();
    
    }
    
    public void printOptionPane() {
           String movieName;
           String inputStr;
           String outputStr;
           
           double adultTicketPrice;
           double childTicketPrice;
           double adultTicketSold;
           double childTicketSold;
           double grossAmt;
           double netSaleAmt;
           
           movieName = JOptionPane.showInputDialog("Enter movie name");
           inputStr = JOptionPane.showInputDialog("Enter price for adult ticket");
           adultTicketPrice = Double.parseDouble(inputStr);
           
           inputStr = JOptionPane.showInputDialog("Enter price for children ticket");
           childTicketPrice = Double.parseDouble(inputStr);
           
           inputStr = JOptionPane.showInputDialog("Enter the number of adult tickets sold");
           adultTicketSold = Integer.parseInt(inputStr);
           
           inputStr = JOptionPane.showInputDialog("Enter the number of children tickets sold");
           childTicketSold = Integer.parseInt(inputStr);        
           
           grossAmt = adultTicketPrice * adultTicketSold + childTicketPrice * childTicketSold;
           
           outputStr = "movie name: " + movieName +"\n"
                       + "Number of Tickets Sold: " + (adultTicketSold + childTicketSold) + "\n"
                       + "Gross Amount: " + String.format("%.2f", grossAmt);
           
           JOptionPane.showMessageDialog(null, outputStr,"Theater sale data", JOptionPane.INFORMATION_MESSAGE);
           
           System.exit(0);
    }
    
    
}




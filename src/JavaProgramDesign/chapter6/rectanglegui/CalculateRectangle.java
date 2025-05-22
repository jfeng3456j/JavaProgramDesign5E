package JavaProgramDesign.chapter6.rectanglegui;

import javax.swing.*;
import java.awt.*;

public class CalculateRectangle extends JFrame {
	
	private JLabel lengthL, widthL, areaL, perimeterL;
	private JTextField lengthTF, widthTF, areaTF, perimeterTF;
	private JButton calculateB, exitB;
	
	private CalculateButtonHandler cbHandler;
	private ExitButtonHandler ebHandler;
	
	private static final int WIDTH= 400;
	private static final int HEIGHT = 300;
	
	public CalculateRectangle() {
		lengthL = new JLabel("Enter the length: ", SwingConstants.RIGHT);
		widthL = new JLabel("Enter the width: ", SwingConstants.RIGHT);
		areaL = new JLabel("area:  ", SwingConstants.RIGHT);
		perimeterL = new JLabel("perimeter: ", SwingConstants.RIGHT);
		
		//create four text fields
		
		lengthTF = new JTextField(10);
		widthTF = new JTextField(10);
		areaTF = new JTextField(10);
		perimeterTF = new JTextField(10);
		areaTF.setEditable(false);
		perimeterTF.setEditable(false);
		
		//create calculate button
		calculateB = new JButton("Calculate");
		cbHandler = new CalculateButtonHandler(lengthTF, widthTF, areaTF, perimeterTF);
		calculateB.addActionListener(cbHandler);
		
		//create exit button
		exitB = new JButton("Exit");
		ebHandler = new ExitButtonHandler();
		exitB.addActionListener(ebHandler);
		
		//set the title of the frame
		setTitle("Area and Perimeter of a Rectangle");
		
		//get the container
		Container pane = getContentPane();
		
		//set the layout
		pane.setLayout(new GridLayout(5,2));
		
		pane.add(lengthL);
		pane.add(lengthTF);
		pane.add(widthL);
		pane.add(widthTF);
		pane.add(areaL);
		pane.add(areaTF);
		pane.add(perimeterL);
		pane.add(perimeterTF);
		pane.add(calculateB);
		pane.add(exitB);
		
		setSize(WIDTH,HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	

}

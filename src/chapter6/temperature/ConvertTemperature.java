package chapter6.temperature;

import java.awt.*;

import javax.swing.*;

public class ConvertTemperature extends JFrame{
	
	private JLabel celsiusL, fahrenheitL;
	private JTextField celsiusTF, fahrenheitTF;
	
	private ConvertCelsius cc;
	private ConvertFahrenheit cf;
	
	private static final int WIDTH = 500;
	private static final int HEIGHT = 50;
	
	private double FTOC = 5.0 / 9.0;
	private double CTOF = 9.0 / 5.0;
	private static int OFFSET = 32;
	
	public ConvertTemperature () {
		
		setTitle("Temperature Conversion");
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,4));
		
		celsiusL = new JLabel("Temp in Celsius: ", SwingConstants.RIGHT);
		fahrenheitL = new JLabel("Temp in Fahrenheit: ", SwingConstants.RIGHT);
		
		celsiusTF = new JTextField(7);
		fahrenheitTF = new JTextField(7);
		
		c.add(celsiusL);
		c.add(celsiusTF);
		c.add(fahrenheitL);
		c.add(fahrenheitTF);
		
		cc = new ConvertCelsius(fahrenheitTF,celsiusTF,FTOC,OFFSET);
		cf = new ConvertFahrenheit(celsiusTF, fahrenheitTF, CTOF, OFFSET);
		
		celsiusTF.addActionListener(cc);
		fahrenheitTF.addActionListener(cf);
		
		setSize(WIDTH,HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}

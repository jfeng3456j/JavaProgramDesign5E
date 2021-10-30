package chapter6.temperature;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class ConvertFahrenheit implements ActionListener{

	private JTextField celsiusTF, fahrenheitTF;
	private double CTOF;
	private int offset;
	
	public ConvertFahrenheit(JTextField celsiusTF, JTextField fahrenheitTF, double CTOF,  int OFFSET) {
		this.celsiusTF = celsiusTF;
		this.fahrenheitTF = fahrenheitTF;
		this.CTOF = CTOF;
		this.offset = OFFSET;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//CTOF = 9.0/5.0*Celsius+32;
		double celsius = Double.parseDouble(celsiusTF.getText());
		double fahrenheit = CTOF * celsius + offset;
		fahrenheitTF.setText(String.format("%.2f", fahrenheit));
	}

}

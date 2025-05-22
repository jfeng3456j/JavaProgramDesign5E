package JavaProgramDesign.chapter6.temperature;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class ConvertCelsius  implements ActionListener{
	
	private JTextField celsiusTF, fahrenheitTF;
	private double FTOC;
	private int offset;
	
	public ConvertCelsius(JTextField fahrenheitTF, JTextField celsiusTF,  double FTOC,  int OFFSET) {
		this.fahrenheitTF = fahrenheitTF;
		this.celsiusTF = celsiusTF;
		this.FTOC = FTOC;
		this.offset = OFFSET;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//FTOC = Fahreheight -32 * 5.0 / 9.0 
		double fahrenheit = Double.parseDouble(fahrenheitTF.getText());
		double celsius = (fahrenheit - offset) * FTOC;
		celsiusTF.setText(String.format("%.2f", celsius));
	}

}

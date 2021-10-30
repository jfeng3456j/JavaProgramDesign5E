package chapter6.rectanglegui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class CalculateButtonHandler implements ActionListener {
	
	private JTextField lengthTF, widthTF, areaTF, perimeterTF;

	public CalculateButtonHandler(JTextField lengthTF, JTextField widthTF, JTextField areaTF, JTextField perimeterTF) {
			this.lengthTF = lengthTF;
			this.widthTF = widthTF;
			this.areaTF = areaTF;
			this.perimeterTF = perimeterTF;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		double length, width, area, perimeter;

		length = Double.parseDouble(lengthTF.getText());
		width = Double.parseDouble(widthTF.getText());
		area = length * width;
		areaTF.setText("" + area);
		perimeter = 2 * length + 2 * width;
		perimeterTF.setText("" + perimeter);
	}
}

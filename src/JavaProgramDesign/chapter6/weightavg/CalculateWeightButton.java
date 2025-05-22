package JavaProgramDesign.chapter6.weightavg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class CalculateWeightButton implements ActionListener{

	private JTextField testScore1TF, testScore2TF, testScore3TF, testScore4TF;
	private JTextField weight1TF, weight2TF, weight3TF, weight4TF;
	
	public CalculateWeightButton( JTextField testScore1TF, JTextField testScore2TF, JTextField testScore3TF, JTextField testScore4TF,
			JTextField weight1TF, JTextField weight2TF, JTextField weight3TF,JTextField weight4TF
			) {
		this.testScore1TF = testScore1TF;
		this.testScore2TF = testScore2TF;
		this.testScore3TF = testScore3TF;
		this.testScore4TF = testScore4TF;
		
		this.weight1TF = weight1TF;
		this.weight2TF = weight2TF;
		this.weight3TF = weight3TF;
		this.weight4TF = weight4TF;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub\
		
		//get input scores
		double score1 = Double.parseDouble(testScore1TF.getText());
		double score2 = Double.parseDouble(testScore2TF.getText());
		double score3 = Double.parseDouble(testScore3TF.getText());
		double score4 = Double.parseDouble(testScore4TF.getText());
		
		double sum = score1 + score2 + score3 + score4;
		
		//weight avg
		weight1TF.setText(String.format("%.2f", score1 / sum));
		weight2TF.setText(String.format("%.2f", score2 / sum));
		weight3TF.setText(String.format("%.2f", score3 / sum));
		weight4TF.setText(String.format("%.2f", score4 / sum));
		
	}

}

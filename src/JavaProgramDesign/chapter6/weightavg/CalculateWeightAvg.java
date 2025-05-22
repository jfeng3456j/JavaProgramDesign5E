package JavaProgramDesign.chapter6.weightavg;

import java.awt.*;

import javax.swing.*;

public class CalculateWeightAvg extends JFrame {
	
	public String question = "Design a GUI program that find the weighted average of four test scores \n"
												+ "the four test scores and their respective weights are given in the following format: \n"
												+ "testscore1  weight1";
	
	private JLabel testScore1L, testScore2L, testScore3L, testScore4L;
	private JTextField testScore1TF, testScore2TF, testScore3TF, testScore4TF;
	private JTextField weight1TF, weight2TF, weight3TF, weight4TF;
	private JButton calculateJB, exitJB;
	
	private CalculateWeightButton cwb;
	private ExitButton exb;
	
	private final static int WIDTH = 500;
	private final static int HEIGHT = 200;
	
	public CalculateWeightAvg() {
		
		setTitle("Calculate Weight Average");
		Container c = getContentPane();
		c.setLayout(new GridLayout(5,3));
		
		testScore1L = new JLabel("testscore 1: ", SwingConstants.RIGHT);
	    testScore2L = new JLabel("testscore 2: ", SwingConstants.RIGHT);
		testScore3L = new JLabel("testscore 3: ", SwingConstants.RIGHT);
		testScore4L = new JLabel("testscore 4: ", SwingConstants.RIGHT);
	
		testScore1TF = new JTextField(7);
		testScore2TF = new JTextField(7);
		testScore3TF = new JTextField(7);
		testScore4TF = new JTextField(7);
		
		
		weight1TF = new JTextField(7);
		weight2TF = new JTextField(7);
		weight3TF = new JTextField(7);
		weight4TF = new JTextField(7);
		
		c.add(testScore1L);
		c.add(testScore1TF);
		c.add(weight1TF).setEnabled(false);
		
		c.add(testScore2L);
		c.add(testScore2TF);
		c.add(weight2TF).setEnabled(false);
		
		c.add(testScore3L);
		c.add(testScore3TF);
		c.add(weight3TF).setEnabled(false);
		
		c.add(testScore4L);
		c.add(testScore4TF);
		c.add(weight4TF).setEnabled(false);
		
		calculateJB = new JButton("Calculate");
		cwb = new CalculateWeightButton( testScore1TF,  testScore2TF,  testScore3TF,  testScore4TF,weight1TF,  weight2TF,  weight3TF, weight4TF);
		calculateJB.addActionListener(cwb);
		
	
		exitJB = new JButton("Exit");
		exb = new ExitButton();
		exitJB.addActionListener(exb);
		
		
		JLabel space = new JLabel();
		c.add(space );
		c.add(calculateJB);
		c.add(exitJB);
		
		
		setSize(500, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
	}

}

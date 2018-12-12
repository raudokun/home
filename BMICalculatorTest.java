package edu.pupr.bmicalculator;

import javax.swing.JFrame;

public class BMICalculatorTest {

	public static void main(String[] args) {
		BMICalculator bmiCalculator = new BMICalculator();
		bmiCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bmiCalculator.setBounds(150, 100, 260, 280);
		bmiCalculator.setVisible(true);
	}

}

package edu.pupr.bmicalculator;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class BMICalculator extends JFrame{
	private final JLabel label1;
	private final JTextField textField1;
	private final JLabel label2;
	private final JTextField textField2;
	private final JLabel label3;
	
	private final JLabel label4;
	private final JTextField textField3;
	private final JLabel label5;
	
	private final JLabel label6;
	private final JTextField textField4;
	
	private final JButton button1;
	private final JButton button2;
	
	public BMICalculator() {
		super("BMI Calculator");
		setLayout(new FlowLayout());
		
		label1 = new JLabel("Height:");
		label1.setToolTipText("Height");
		label1.setVerticalAlignment(SwingConstants.TOP);
		add(label1);
		
		textField1 = new JTextField("Enter feet here");
		textField1.setEditable(true);
		add(textField1);
		
		label2 = new JLabel("ft");
		label2.setToolTipText("feet");
		add(label2);
		
		textField2 = new JTextField("Enter inches here");
		textField2.setEditable(true);
		add(textField2);
		
		label3 = new JLabel("in");
		label3.setToolTipText("inches");
		add(label3);
		
		label4 = new JLabel("Weight:");
		label4.setHorizontalAlignment(SwingConstants.LEFT);
		label4.setToolTipText("Weight");
		add(label4);
		
		textField3 = new JTextField("Enter weight in pounds here");
		textField3.setEditable(true);
		add(textField3);
		
		label5 = new JLabel("lbs");
		label5.setToolTipText("pounds");
		add(label5);
		
		label6 = new JLabel("BMI:");
		label6.setToolTipText("BMI");
		add(label6);
		
		textField4 = new JTextField("Your BMI is: ");
		textField4.setEditable(true);
		add(textField4);
		
		button1 = new JButton("Calculate");
		add(button1);
		
		button2 = new JButton("Close");
		add(button2);
	}
	
}

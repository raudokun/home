package edu.pupr.bmicalculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Color;

public class BMITest extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMITest frame = new BMITest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BMITest() {
		setTitle("BMI Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHeight = new JLabel("Height: ");
		lblHeight.setFont(new Font("Arial", Font.BOLD, 12));
		lblHeight.setBounds(10, 11, 46, 14);
		contentPane.add(lblHeight);
		
		textField = new JTextField();
		textField.setBounds(53, 36, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblIn = new JLabel("ft.");
		lblIn.setFont(new Font("Arial", Font.BOLD, 12));
		lblIn.setBounds(149, 38, 46, 14);
		contentPane.add(lblIn);
		
		textField_1 = new JTextField();
		textField_1.setBounds(235, 36, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblIn_1 = new JLabel("in.");
		lblIn_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblIn_1.setBounds(331, 39, 46, 14);
		contentPane.add(lblIn_1);
		
		JLabel lblWeight = new JLabel("Weight: ");
		lblWeight.setFont(new Font("Arial", Font.BOLD, 12));
		lblWeight.setBounds(10, 93, 46, 14);
		contentPane.add(lblWeight);
		
		textField_2 = new JTextField();
		textField_2.setBounds(53, 118, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblLbs = new JLabel("lbs");
		lblLbs.setFont(new Font("Arial", Font.BOLD, 12));
		lblLbs.setBounds(149, 121, 46, 14);
		contentPane.add(lblLbs);
		
		JLabel lblBmi = new JLabel("BMI:");
		lblBmi.setFont(new Font("Arial", Font.BOLD, 12));
		lblBmi.setBounds(10, 198, 46, 14);
		contentPane.add(lblBmi);
		
		textField_3 = new JTextField();
		textField_3.setBounds(53, 209, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNormalWeight = new JLabel("Normal Weight");
		lblNormalWeight.setFont(new Font("Arial", Font.BOLD, 12));
		lblNormalWeight.setBounds(53, 234, 86, 14);
		contentPane.add(lblNormalWeight);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBackground(Color.WHITE);
		btnCalculate.setFont(new Font("Arial", Font.BOLD, 12));
		btnCalculate.setBounds(195, 208, 89, 23);
		contentPane.add(btnCalculate);
		
		JButton btnClose = new JButton("Close");
		btnClose.setBackground(Color.WHITE);
		btnClose.setFont(new Font("Arial", Font.BOLD, 12));
		btnClose.setBounds(305, 207, 89, 23);
		contentPane.add(btnClose);
	}
}

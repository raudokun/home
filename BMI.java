package edu.pupr.bmi;

import java.util.Scanner;

public class BMI {
	private double weightInPounds;
	private int heightInInches;
	private double BMI;
	
	public BMI() {
		this(0, 0, 0);
	}

	public BMI(double weightInPounds, int heightInInches, double BMI) {
		setWeightInPounds(weightInPounds);
		setHeightInInches(heightInInches);
		setBMI(BMI);
	}
	
	public void setWeightInPounds(double weightInPounds) {
		this.weightInPounds = weightInPounds;
		
	}
	
	public double getWeightInPounds() {
		return weightInPounds;
	}
	
	public void setHeightInInches(int heightInInches) {
		this.heightInInches = heightInInches;
		
	}
	
	public int getHeightInInches() {
		return heightInInches;
	}
	
	public void setBMI(double BMI) {
		this.BMI = BMI;
	}
	
	public double getBMI() {
		return BMI;
	}
	
	public void calc() {
		if (BMI >= 0) {
			BMI = (weightInPounds * 703) / (heightInInches * heightInInches);
		}else {
			throw new ArithmeticException("BMI is negative!");
		}
		
		if (BMI <= 18.5) {
			System.out.println(String.format("Your BMI is %.2f", getBMI()));
			System.out.println("(Underweight)");
		} else if(BMI > 18.6 && BMI <= 24.9) {
			System.out.println(String.format("Your BMI is %.2f", getBMI()));
			System.out.println("(Normal Weight)");
		} else if(BMI > 25.0 && BMI <= 29.9) {
			System.out.println(String.format("Your BMI is %.2f", getBMI()));
			System.out.println("(Overweight)");
		} else if(BMI > 30) {
			System.out.println(String.format("Your BMI is %.2f", getBMI()));
			System.out.println("(Obese)");
		}		
	}
	
	public void ask() {
		Scanner input = new Scanner(System.in);
		System.out.println("BMI Categories: ");
		System.out.println("Underweight = < 18.5");
		System.out.println("Normal weight = 18.5 - 24.9");
		System.out.println("Overweight = 25 - 29.9");
		System.out.println("Obese = 30 or greater");
		
		System.out.print("How many pounds do you weight? ");
		setWeightInPounds(input.nextDouble());
		System.out.print("What is your height in inches? ");
		setHeightInInches(input.nextInt());
		
		calc();
	}

	public static void main(String[] args) {
		BMI myBMI = new BMI();
		myBMI.ask();

	}

}

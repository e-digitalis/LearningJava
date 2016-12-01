package aJD;

import java.text.NumberFormat;
import java.util.Scanner;

public class BCalculation {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String ws = userInputW();
		double wd = scannerMethod(ws);
//		System.out.println(wd);
		String hs = userInputH();
		double hd = scannerMethod(hs);
//		System.out.println(wd);
		double b = calculateBMI(wd, hd);
//		System.out.println(b);

		Double percent = new Double(b);
		NumberFormat percentFormatter;
		String percentOut;
		percentFormatter = NumberFormat.getPercentInstance();
		percentOut = percentFormatter.format(percent);
		System.out.println(percentOut);

	} // end of main

	public static double calculateBMI(double wd, double hd) {
		double b = (wd / (hd * hd)) * 100;
		return b;
	}

	public static double scannerMethod(String printString) {
		System.out.println(printString);
		double input = sc.nextDouble();
		sc.nextLine(); // to clear scanner ("bug")
		return input;
	}

	public static String userInputW() {
		String question = "Please enter your weight in kilograms:";
		return question;
	}

	public static String userInputH() {
		String question = "Please enter your height in meters:";
		return question;
	}

}

// #Task #RealWordUsage
// Create a program that calculates BMI (Body Mass Index).
// You will create a method called calculateBMI that takes 2 arguments (input by
// the user), which are weight and height, then returns the BMI.
// The formula for calculating BMI is:
// Bodyweight in kilogrammes divided by height in metres squared
// or
// BMI = x KG / (y M * y M)
// Where:
// x=bodyweight in KG
// y=height in metres
// So, your method will look like:
// public static double calculateBMI(double weight, double height){
//// Your code
// return BMI;
// }
// Please include the whole class, so others can learn.
// Good luck.
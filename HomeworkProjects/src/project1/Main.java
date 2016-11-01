package project1;


public class Main {

	int figureChoice;

	public static void main(String[] args) {

				
		switch (Methods.inputBoxShape()) {   							// let the user decide shape: figureChoice
		case 0:                              							// 0=circle
			Methods.printCircleArea(Methods.inputBoxCalculation()); 	// inputBoxCalculation is a method call for user to choose what to calculate based on methodChoice
			break;

		case 1:															//1=triangle
			Methods.printTriangleArea(Methods.inputBoxCalculation());
			break;
			
		case 2:															//2=rectangle 
			Methods.printRectangleArea(Methods.inputBoxCalculation());
		}

	}



}

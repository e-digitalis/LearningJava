package excercise2;

import javax.swing.JOptionPane;

public class Calculation_with_sep_method {
	
	
	static int trackerJustForTest;

	public static void main(String[] args) {

			//input defined by the user
				
				String inputBox1 = JOptionPane.showInputDialog("Please enter a number!");
				String inputBox2 = JOptionPane.showInputDialog("Thank you! Please enter another number!");
				
				int value1=Integer.parseInt(inputBox1);
				int value2=Integer.parseInt(inputBox2);
	
				System.out.println("Result from addition in other method: " + CalculationMethods.additionMethod (value1, value2));
				System.out.println("Result from subtraction in other method: " + CalculationMethods.subtractionMethod (value1, value2));
				System.out.println("Result from multiplication in other method: " + CalculationMethods.multiplicationMethod (value1, value2));
				System.out.println("Result from division in other method: " + CalculationMethods.divisionMethod (value1, value2));
				
				trackerJustForTest++;
				
				System.out.println(Calculation_with_sep_method.trackerJustForTest);
				
	}

}

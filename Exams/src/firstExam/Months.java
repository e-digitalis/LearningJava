package firstExam;

import javax.swing.JOptionPane;

public class Months {

	public static void main(String[] args) {

		// Write a program that reads the number of month and prints the name of
		// the month.

		
		String numberOfMonthInString = JOptionPane.showInputDialog("Please enter the number of the current month, \nthe adequate number from 1-12:");
		int numberOfMonth = Integer.parseInt(numberOfMonthInString);

		System.out.println("Thank you!");
	
		
		switch (numberOfMonth) {
		case 0:
			System.out.println("There is no month with the number 0. Please enter a whole number from 1-12.");
			break;
		case 1:
			System.out.println("The number you entered is: " + numberOfMonth +" and this month is called January.");
			break;
		case 2:
			System.out.println("The number you entered is: " + numberOfMonth +" and this month is called February.");
			break;
		case 3:
			System.out.println("The number you entered is: " + numberOfMonth +" and this month is called March.");
			break;
		case 4:
			System.out.println("The number you entered is: " + numberOfMonth +" and this month is called April.");
			break;
		case 5:
			System.out.println("The number you entered is: " + numberOfMonth +" and this month is called May.");
			break;
		case 6:
			System.out.println("The number you entered is: " + numberOfMonth +" and this month is called June.");
			break;
		case 7:
			System.out.println("The number you entered is: " + numberOfMonth +" and this month is called July.");
			break;
		case 8:
			System.out.println("The number you entered is: " + numberOfMonth +" and this month is called August.");
			break;
		case 9:
			System.out.println("The number you entered is: " + numberOfMonth +" and this month is called September.");
			break;
		case 10:
			System.out.println("The number you entered is: " + numberOfMonth +" and this month is called October.");
			break;
		case 11:
			System.out.println("The number you entered is: " + numberOfMonth +" and this month is called November.");
			break;
		case 12:
			System.out.println("The number you entered is: " + numberOfMonth +" and this month is called December.");
			break;
		default:
			System.out.println("Exception. The value is out of bounds. Please enter a whole number from 1-12.");

	

		}

	}
}

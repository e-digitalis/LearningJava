package tester;

import javax.swing.JOptionPane;

public class Addstrings {

	public static void main(String[] args) {

		String firstName = JOptionPane.showInputDialog("Please enter your first name in the box:");
		String lastName = JOptionPane.showInputDialog("Please enter your last name in the box:");
		String fullName = firstName + " " + lastName;

		System.out.println(fullName);
		JOptionPane.showMessageDialog(null, "Your name is: " + fullName);

		int lengthFiN = firstName.length();
		int lengthLaN = lastName.length();
		int lengthFuN = fullName.length() - 1;

		JOptionPane.showMessageDialog(null, " Your first name is " + lengthFiN + " characters long. Your last name is "
				+ lengthLaN + " characters long. Your full name is " + lengthFuN + " characters long.");

		String nameExceptFirstLetter = firstName.substring(1);
		String nameExceptFirstAndLastletter = firstName.substring(1, lengthFiN - 1);

		JOptionPane.showMessageDialog(null,
				"If you take away the initial the rest of your name is your first name is " + nameExceptFirstLetter);

		JOptionPane.showMessageDialog(null,
				"If you take away the initial and the last letter the rest of your name is your first name is " + nameExceptFirstAndLastletter);

		System.out.println(nameExceptFirstAndLastletter);
	}

}
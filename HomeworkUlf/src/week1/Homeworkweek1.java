package week1;

import java.util.Random;

import javax.swing.*;

public class Homeworkweek1 {

	public static void main(String[] args) {

		Random createRandomOperation = new Random();

		// Bardias random code
		// double randomNumbe = Math.random();
		// randomNumbe = (randomNumbe * 1000) + 1;
		// int randomInt = (int)randomNumbe;

		int rVToGuess = createRandomOperation.nextInt(10);

		// System.out.println(createRandomOperation.nextInt(1000));
		// System.out.println(variableToGuess);

		String guess = JOptionPane.showInputDialog("Please guess a number, any number from 0-10!");
		int intGuess = Integer.parseInt(guess);
		;

		while (intGuess != rVToGuess) {
			if (intGuess > rVToGuess) {

				guess = JOptionPane.showInputDialog("Too big, guess a smaller number");
				intGuess = Integer.parseInt(guess);

			}
			if (intGuess < rVToGuess) {
				// else {
				guess = JOptionPane.showInputDialog("Too small, guess a bigger number");
				intGuess = Integer.parseInt(guess);

			}

		}

		JOptionPane.showMessageDialog(null, "Wow! You got it! Good job!");

		// String inputBox2 = JOptionPane.showInputDialog("Thank you! Please
		// enter another number!");

		// int intTwo = Integer.parseInt(inputBox2);

		// int wholeNumber = intOne * intTwo;

		// JOptionPane.showMessageDialog (null, "Thank you! I will now multiply
		// the numbers!" );
		// JOptionPane.showMessageDialog (null, "The result is: " +
		// wholeNumber);

		// System.out.println("The result is: " + wholeNumber);

	}

}

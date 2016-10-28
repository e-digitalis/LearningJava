package week1;

import javax.swing.JOptionPane;

public class Ulf_do_loop {

	public static void main(String[] args) {

		int randomNumber = (int) (Math.random() * 100) + 1;
		int userGuess;
		int maxGuesses = 12;

		do {
			maxGuesses--;
			String stringGuess = JOptionPane.showInputDialog("Please enter a number between 1-1000:");
			userGuess = Integer.parseInt(stringGuess);
			
			if (userGuess < randomNumber) {
				System.out.println(userGuess + " is too small");
			
			} else if (userGuess > randomNumber) {
				System.out.println(userGuess + " is too large");
			}

		} while (userGuess != randomNumber && maxGuesses > 0);
		System.out.println("Sorry, you ran out of guesses!");

	}

}

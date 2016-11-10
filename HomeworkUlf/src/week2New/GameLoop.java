package week2New;

import javax.swing.JOptionPane;

public class GameLoop {

	public static void realGame(int rVToGuess) {

		String guess = JOptionPane.showInputDialog("Please guess a number, any number from 0-10!");
		int intGuess = Integer.parseInt(guess);

		while (intGuess != rVToGuess) {
			if (intGuess > rVToGuess) {

				guess = JOptionPane.showInputDialog("Too big, guess a smaller number");
				intGuess = Integer.parseInt(guess);

			}
			if (intGuess < rVToGuess) {
				guess = JOptionPane.showInputDialog("Too small, guess a bigger number");
				intGuess = Integer.parseInt(guess);
			}
		}

		JOptionPane.showMessageDialog(null, "Wow! You got it! Good job!");
		DoYouWantToPlay.playQuestion(RandomNumberGenerator.createRandomNumber());

	}
}

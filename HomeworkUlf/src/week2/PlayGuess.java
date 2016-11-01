package week2;

import javax.swing.JOptionPane;

public class PlayGuess {

	public static void main(String[] args) {

		int answer;
		
				do {
					GuessingGame game = new GuessingGame(10);
					while (game.makeGuess() != true) {
						System.out.println("Guess # " + game.getNumberOfGuesses());
					}
					System.out.println("Average guesses: " + GuessingGame.getAverage());
					answer = JOptionPane.showConfirmDialog(null, "Do you want to play another game?");
				
				} while (answer == JOptionPane.YES_OPTION);
		
	}

}

package week2;

import java.util.Random;

import javax.swing.JOptionPane;

public class GuessingGame {

	private int randomNumber;
	private int numberOfGuesses;

	private static int numberOfGames = 0;
	private static int totalNumberOfGuesses = 0;

	public GuessingGame(int range) {
		randomNumber = (int) (Math.random() * range + 1);
		System.out.println("New game with range: 1 - " + range);
		numberOfGuesses = 0; // not necessary b/c it will be initialized to the
								// default of zero
	}

	public boolean makeGuess(){
		int guess = Integer.parseInt(JOptionPane.showInputDialog("Guess"));
		
		numberOfGuesses++;
		totalNumberOfGuesses++;
		
		if (guess < randomNumber){
			System.out.println(guess + " is too small");
			return false;
			
		} else if (guess > randomNumber){
			System.out.println(guess + " is too large");
			return false;
		
		} else {
			System.out.println(guess + " is correct!");
			numberOfGames++;
			return true;
			
		}
	}
	
	public int getNumberOfGuesses(){
		return numberOfGuesses;
	}
	
	public static double getAverage(){
		return (double) totalNumberOfGuesses/numberOfGames;
	}
	
}

package week1;

import javax.swing.JOptionPane;

public class Ulfs_GuessGame {

	public static void main(String[] args) {
		
		int randomNumber = (int) (Math.random() * 100) + 1;
		int userGuess;
		String stringGuess = JOptionPane.showInputDialog("Please enter a number between 1-1000:");	
		userGuess = Integer.parseInt(stringGuess);
		
		while(userGuess != randomNumber){
			if (userGuess < randomNumber) {
				stringGuess = JOptionPane.showInputDialog("Too small, please guess again!");
				System.out.println(userGuess+" is too small");
				
			} else if (userGuess > randomNumber) {
				stringGuess = JOptionPane.showInputDialog("Too large, please guess again!");
				System.out.println(userGuess+" is too large");
				
			}
			
			userGuess = Integer.parseInt(stringGuess);
	//		System.out.println(userGuess);
			
		}
		
		System.out.println("Correct!");
	}

}

package googleResultat;

import javax.swing.JOptionPane;

public class JOptionPaneInputDialog {

	public static void main(String[] args) {

		String guess = JOptionPane.showInputDialog("Please guess a number, any number from 0-10!");
		int intGuess = Integer.parseInt(guess);
		

	}

}

package excercises;

import javax.swing.JOptionPane;

public class LoopsPrintsStarsAsks {

	public static void main(String[] args) {

		int playYes = JOptionPane.showConfirmDialog(null, "Do you want to play?", null, JOptionPane.YES_NO_OPTION);
		int whileVar = playYes;
		
		while (whileVar == 0) {
			String numberOfStars = JOptionPane.showInputDialog("Hello! How many stars do you want to print?");
			int intNumberOfStars = Integer.parseInt(numberOfStars);
			System.out.println(intNumberOfStars);
			
			for (int counterForLoop = 1; counterForLoop <= intNumberOfStars; counterForLoop++) {
				System.out.print("*");
			}

			System.out.println();
			System.out.println(intNumberOfStars);

			String newNumberOfStars = JOptionPane.showInputDialog("Do you want to print more stars?"
					+ "\nIf yes, please enter the number of stars you want to print."
					+ "\nIf no, please press Cancel.");
			int newIntNumberOfStars = Integer.parseInt(newNumberOfStars);

		}
		
		JOptionPane.showMessageDialog (null, "OK. You have chosen to end the game." ); 
	}

}

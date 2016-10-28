package excercises;

import javax.swing.JOptionPane;

public class LoopsPrintsStarsDoWhileLoop {

	public static void main(String[] args) {

		String firstStringNumberOfStars;
		int firstIntNumberOfStars;
		boolean loop = true;
		int whileVar;

		do {
			int playYes = JOptionPane.showConfirmDialog(null, "Do you want to play?", null, JOptionPane.YES_NO_OPTION);
			whileVar = playYes;
		}

		while (whileVar == 0);
		{ firstStringNumberOfStars = JOptionPane.showInputDialog("Hello! How many stars do you want to print?");
		firstIntNumberOfStars = Integer.parseInt(firstStringNumberOfStars);
			// String secondStringNumberOfStars =
			// JOptionPane.showInputDialog("Hello! How many stars do you want to
			// print?");
			// int secondIntNumberOfStars =
			// Integer.parseInt(secondStringNumberOfStars);

			for (int counterForLoop = 1; counterForLoop <= firstIntNumberOfStars; counterForLoop++) {
				System.out.print("*");
			}
			
			System.out.println();
			int playYes = JOptionPane.showConfirmDialog(null, "Do you want to print more stars?", null,
					JOptionPane.YES_NO_OPTION);

			if (playYes == 0) {
			} else {
				loop = false;
			}

		}

		JOptionPane.showMessageDialog(null, "OK. You have chosen to end the game.");

	}

}

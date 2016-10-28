package excercises;

import javax.swing.JOptionPane;

public class LoopsPrintsStarsAsksNewAndImproved {

	public static void main(String[] args) {

		String numberOfStars;
		int intNumberOfStars;
		boolean loop = true;

		while (loop) {
			numberOfStars = JOptionPane.showInputDialog("Hello! How many stars do you want to print?");
			intNumberOfStars = Integer.parseInt(numberOfStars);

			for (int counterForLoop = 1; counterForLoop <= intNumberOfStars; counterForLoop++) {
				System.out.print("*");
			}

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

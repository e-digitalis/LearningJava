package week2New;

import javax.swing.JOptionPane;

public class DoYouWantToPlay {

	public static void playQuestion(int newResult) {

		int result = JOptionPane.showConfirmDialog(null, "Do you want to play?", null, JOptionPane.YES_NO_OPTION);

		if (result == JOptionPane.YES_OPTION) {
//		if (result == JOptionPane.YES_OPTION || newResult == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "OK, let's play!");
			GameLoop.realGame(RandomNumberGenerator.createRandomNumber());
		} else {
			JOptionPane.showMessageDialog(null, "Thank you! We can play another day!");
		}
	}
}

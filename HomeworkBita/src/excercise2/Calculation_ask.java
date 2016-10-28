package excercise2;

import javax.swing.JOptionPane;

public class Calculation_ask {

	public static void main(String[] args) {

		// input defined by the user

		int playYes = JOptionPane.showConfirmDialog(null, "Do you want to play?", null, JOptionPane.YES_NO_OPTION);

		while (playYes == 0) {

			String inputBox1 = JOptionPane.showInputDialog("Please enter a number!");
			int value1 = Integer.parseInt(inputBox1);
			String inputBox2 = JOptionPane.showInputDialog("Thank you! Please enter another number!");
			int value2 = Integer.parseInt(inputBox2);

			String[] options = new String[] { "Addition", "Subtraction", "Multiplication", "Division" };
			int chosenMathMethod = JOptionPane.showOptionDialog(null, "Which method would you like to choose?",
					"Method choice", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

			// Where response == 0 for Addition, 1 for Subtraction, 2 for
			// Multiplication and -1 or 3 for Division.
			switch (chosenMathMethod) {
			case 0:
				playYes = JOptionPane.showConfirmDialog(null, "Result from addition in other method: " + CalculationMethods.additionMethod(value1, value2) + "\nDo you want to play again?", null,
						JOptionPane.YES_NO_OPTION);
				break;
			case 1:
				playYes = JOptionPane.showConfirmDialog(null, "Result from subtraction in other method: "
						+ CalculationMethods.subtractionMethod(value1, value2) + "\nDo you want to play again?", null,
						JOptionPane.YES_NO_OPTION);
				break;
			case 2:
				System.out.println("Result from multiplication in other method: "
						+ CalculationMethods.multiplicationMethod(value1, value2));
				playYes = JOptionPane.showConfirmDialog(null, "Result from multiplication in other method: "
						+ CalculationMethods.multiplicationMethod(value1, value2)+ "\nDo you want to play again?", null,
						JOptionPane.YES_NO_OPTION);
				break;
			case 3:
				System.out.println(
						);
				playYes = JOptionPane.showConfirmDialog(null, "Result from division in other method: " + CalculationMethods.divisionMethod(value1, value2) + "\nDo you want to play again?", null,
						JOptionPane.YES_NO_OPTION);
				break;

			}

			JOptionPane.showMessageDialog (null, "Thank you! The game has now ended!" ); 
			
		}

	}

}

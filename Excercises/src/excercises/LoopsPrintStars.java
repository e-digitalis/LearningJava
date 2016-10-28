package excercises;

import javax.swing.JOptionPane;

public class LoopsPrintStars {

	public static void main(String[] args) {

		
		String numberOfStars = JOptionPane.showInputDialog("Hello! How many stars do you want to print?");
		int intNumberOfStars = Integer.parseInt(numberOfStars);
		int whileCounter = intNumberOfStars;
		int starPrint = intNumberOfStars;
		int starPrintLn = intNumberOfStars;
		
	//	int playYes = JOptionPane.showConfirmDialog(null, "Do you want to play?", null, JOptionPane.YES_NO_OPTION);

		while( 0 < whileCounter ) {
	         System.out.print("*");
	         whileCounter--;
	         
	      }
		System.out.println(intNumberOfStars);
		

		for (int i = 1; i <= starPrint; i++){
			System.out.print("*");
		}
		
		
		for (starPrint = 1; starPrint <= intNumberOfStars; starPrint++){
			System.out.print("*");
		}
		
		for (starPrintLn = 1; starPrintLn <= intNumberOfStars; starPrintLn++){
			System.out.println("*");
		}
		
	}

}

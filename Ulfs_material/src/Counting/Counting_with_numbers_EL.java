package Counting;
import javax.swing.JOptionPane;

public class Counting_with_numbers_EL {

	public static void main(String[] args) {
		
		String inputBox1 = JOptionPane.showInputDialog("Please enter a number!");
		String inputBox2 = JOptionPane.showInputDialog("Thank you! Please enter another number!");
		
		int intOne = Integer.parseInt (inputBox1);
		int intTwo = Integer.parseInt (inputBox2);
		
		int wholeNumber = intOne * intTwo;
		
		JOptionPane.showMessageDialog (null, "Thank you! I will now multiply the numbers!" ); 
		JOptionPane.showMessageDialog (null, "The result is: " + wholeNumber);
		
		System.out.println("The result is: " + wholeNumber);
		
		

	}

}

package excercise2;

import javax.swing.JOptionPane;

public class Declare_two_variables {

	public static void main(String[] args) {

	//defined by me
		int i=2;
		int j=3;
		
		System.out.println(i+j);

		
	//defined by the user
		
		String inputBox1 = JOptionPane.showInputDialog("Please enter a number!");
		String inputBox2 = JOptionPane.showInputDialog("Thank you! Please enter another number!");
		
		int value1=Integer.parseInt(inputBox1);
		int value2=Integer.parseInt(inputBox2);

		
		System.out.println(value1+value2);
		
	}

}

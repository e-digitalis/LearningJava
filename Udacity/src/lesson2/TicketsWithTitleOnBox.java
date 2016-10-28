package lesson2;

import javax.swing.JOptionPane;

public class TicketsWithTitleOnBox {

	public static void main(String[] args) {
		
		int ticket = 10;
		int discount = ticket / 2;

		 String code = JOptionPane.showInputDialog(
			        null, 
			        "Enter the secret code to continue (label)", 
			        "Secret code needed (title)", 
			        JOptionPane.WARNING_MESSAGE
			    );
			   
		JOptionPane.showMessageDialog(null, "Welcome to our museum! Ticket price is: " + ticket + ", and discounted price is: " + discount + ". You get a discount if you are 15 or younger, older than 60 or a student.");
		
		System.out.println("Ticket price is: " + ticket + ", and discounted price is: " + discount + ".\n"
				+ "You get a discount if you are 15 or younger, older than 60 or a student.");

		String ageString = JOptionPane.showInputDialog("Please type in your age:");
		int age = Integer.parseInt(ageString);

		// boolean student = Boolean.parseBoolean(studentInt);

		// System.out.println(studentInt);

		if (age <= 15 || age > 60) {
			JOptionPane.showMessageDialog(null, "Congratulations! You receive the discounted price!");
		} else {
			int studentInt = JOptionPane.showConfirmDialog(null, "Are you a student?",
					"Please choose the correct option below:", JOptionPane.YES_NO_OPTION);
			if (studentInt == 0) {
				JOptionPane.showMessageDialog(null, "Congratulations! You receive the discounted price!");
			} else {
				JOptionPane.showMessageDialog(null, "You have to pay full price.");
			}
	}

}
}

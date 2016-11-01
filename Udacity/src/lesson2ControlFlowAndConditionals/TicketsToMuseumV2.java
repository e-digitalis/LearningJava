package lesson2;

import javax.swing.JOptionPane;

public class TicketsToMuseumV2 {

	public static void main(String[] args) {

		int ticketPrice = 10;
		int discountPrice = ticketPrice / 2;

				   
		JOptionPane.showMessageDialog(null, "Welcome to our museum! Ticket price is: " + ticketPrice + ", and discounted price is: " + discountPrice + ". You get a discount if you are 15 or younger, older than 60 or a student.");
		
		System.out.println("Ticket price is: " + ticketPrice + ", and discounted price is: " + discountPrice + ".\n"
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

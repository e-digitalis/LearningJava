package dates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import javax.swing.JOptionPane;

public class DateGame {

	int yearOfBirth = 2005;
	int monthOfBirth = 05;
	int dayOfBirth = 8;
	int hourOfBirth = 20;
	int minutesOfBirth = 03;
	LocalDateTime then;
	int thatYear;
	LocalDateTime ahora = LocalDateTime.now();
	DayOfWeek day;
	LocalDate nu;
	long numberOfDaysOfLife;

	public static void main(String[] args) {
		DateGame dm = new DateGame();
		// dm.startMenu();
		dm.doYouWantToPlay();
		// dm.bDWD();
		// dm.bDWDTY();
		// dm.bDWDAY();
		// dm.nODOL();

	}

	public void doYouWantToPlay() {

		int playYes = JOptionPane.showConfirmDialog(null, "Do you want to play?", null, JOptionPane.YES_NO_OPTION);
		if (playYes == JOptionPane.YES_OPTION) {
			playGame();
			} else {
			System.out.println("Thanks. Have a nice day!");
			System.exit(1);
		}
	}

	public void playMore() {

		int playYes = JOptionPane.showConfirmDialog(null, "Do you want to play again?", null,
				JOptionPane.YES_NO_OPTION);
		if (playYes == JOptionPane.YES_OPTION) {
			playGame();
		} else {
			System.out.println("Thanks. Have a nice day!");
			System.exit(1);
		}
	}

	public void playGame() {

		int dataEnter = JOptionPane.showConfirmDialog(null, "Do you want to enter data?", null,
				JOptionPane.YES_NO_OPTION);

		if (dataEnter == JOptionPane.YES_OPTION) {
			yearOfBirth = inputDialog("Please enter your data. Year of birth:");
			monthOfBirth = inputDialog("Month of birth:");
			dayOfBirth = inputDialog("Day of birth:");
			hourOfBirth = inputDialog("Time of birth (hour):");
			minutesOfBirth = inputDialog("Time of birth (minutes):");
			gameChoice();
		} else {
			gameChoice();
		}
	}

	public void gameChoice() {
		String[] options = new String[] { "Birthday weekday (BD WD)", "BD WD this year", "BD WD any year",
				"Days of life" };
		int response = JOptionPane.showOptionDialog(null, "Choose an option:", "Choice", JOptionPane.DEFAULT_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		// // Where response == 0 for BD WD, 1 for BD WD this year, 2 for BD WD
		// any
		// // year (and -1?) or 3 for Days lived.

		switch (response) {
		case 0:
			bDWD();
			break;
		case 1:
			bDWDTY();
			break;
		case 2:
			bDWDAY();
			break;
		case 3:
			nODOL();
			break;
		default:
			System.out.println("Something went wrong. IT needs to fix bug.");
		} playMore();

	}

	public void bDWD() {
		then = LocalDateTime.of(yearOfBirth, monthOfBirth, dayOfBirth, hourOfBirth, minutesOfBirth);
		day = then.getDayOfWeek();
		System.out.println("You were born on a " + day + ".");
	}

	public void bDWDTY() {
		ahora = LocalDateTime.of(ahora.getYear(), monthOfBirth, dayOfBirth, hourOfBirth, minutesOfBirth);
		DayOfWeek day = ahora.getDayOfWeek();
		System.out.println("Your birthday this year is on a " + day + ".");
	}

	public void bDWDAY() {
		thatYear = inputDialog("Please enter a year:");
		LocalDateTime aLDT = LocalDateTime.of(thatYear, monthOfBirth, dayOfBirth, hourOfBirth, minutesOfBirth);
		DayOfWeek day = aLDT.getDayOfWeek();
		System.out.println("Your birthday the chosen year is on a " + day + ".");
	}

	public void nODOL() {
		then = LocalDateTime.of(yearOfBirth, monthOfBirth, dayOfBirth, hourOfBirth, minutesOfBirth);
		numberOfDaysOfLife = then.until(ahora, ChronoUnit.DAYS);
		System.out.println("You have lived " + numberOfDaysOfLife + " days.");
	}

	public int inputDialog(String text) {
		String stringInput = JOptionPane.showInputDialog(text);
		int intInput = Integer.parseInt(stringInput);
		return intInput;
	}

}

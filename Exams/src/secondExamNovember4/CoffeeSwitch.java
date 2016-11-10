package secondExamNovember4;

import java.util.Scanner;

public class CoffeeSwitch {

	public static Scanner myScan = new Scanner(System.in);
	
	public static void main(String[] args) {

		CoffeeSwitch selection = new CoffeeSwitch();
		selection.select();

		myScan.close();
	}
	

	public void select() {
		System.out.println();
		System.out.println("Please indicate your choice by writing a whole number from one to five.");
		int coffeeChoice = myScan.nextInt();

		switch (coffeeChoice) {
		case 1:
			// 1 is black coffee
			System.out.println("You have chosen black coffee.");
			break;
		case 2:
			// 2 hot is hot chocolate - I edited the message a bit
			System.out.println("You have chosen hot chocolate.");
			break;
		case 3:
			// 3 cappuccino
			System.out.println("You have chosen cappuccino.");
			break;
		case 4:
			// 3 latte
			System.out.println("You have chosen latte.");
			break;
		case 5:
			// 3 tea
			System.out.println("You have chosen tea.");
			break;
		default:
			System.out.println("Invalid choice. To access your favorite dricnk, please choose a whole number between one and five.");
		}
	}

}

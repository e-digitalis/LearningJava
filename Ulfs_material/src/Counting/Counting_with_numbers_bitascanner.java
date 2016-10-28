package Counting;

import java.util.Scanner;



public class Counting_with_numbers_bitascanner {
	
	

	private static Scanner sc;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);	
		
		System.out.println("Vad heter du:");
		String namn= sc.nextLine();
		
		System.out.println("Mata in tal 1:");
		int firstVariable = sc.nextInt();
		
		System.out.println("Mata in tal 2:");
		int secondVariable = sc.nextInt();
		
		int wholeNumber = firstVariable * secondVariable + 56;
		System.out.println(namn + " när siffrorna multipliceras och adderas med 56 så blir det " + wholeNumber);
		
		double deci = 45.78;
		double decimalNumber = deci / 2.23;
		System.out.println(decimalNumber);
		System.out.println(wholeNumber * decimalNumber);
		int choppedOff = (int) decimalNumber; // chops off decimals
		System.out.println(choppedOff);

	
	
	}

		
}

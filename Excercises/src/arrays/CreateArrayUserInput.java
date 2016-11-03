package arrays;

import java.util.Scanner;

public class CreateArrayUserInput {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);

		System.out.println("How many positions do you want in the array?");
		int numberOfPositions = myScanner.nextInt();

		int[] userDefinedArray = new int[numberOfPositions];
		System.out.println("Using length.method to print length of array: " + userDefinedArray.length);

	//	numberOfPositions = 549734; security risk. better to calculate the length of the array using the .length method
		for (int counter = 0; counter < numberOfPositions; counter++) {
			System.out.println("Printing value in position " + counter + ": " + userDefinedArray[counter]);
		}

		System.out.println();
		System.out.print("Now to print sum: ");

		userDefinedArray[0] = 2;
		userDefinedArray[1] = 3;
		userDefinedArray[1] = 4;

		int sum = 0;
		int average=0;
		
		for (int counter = 0; counter < numberOfPositions; counter++) {
			sum = sum + userDefinedArray[counter];
		}

		System.out.println(sum);

		sum = 0;
		
		///////////////////////////////////////////////////////////////////////
		
//		System.out.println();
//		System.out.println("Asking user to define values");
//
//		for (int counter = 0; counter < numberOfPositions; counter++) {
//			System.out.println("What number do you want to enter into position " + counter);
//			userDefinedArray[counter] = myScanner.nextInt();
//		}
//		
//		for (int counter = 0; counter < numberOfPositions; counter++) {
//			sum = sum + userDefinedArray[counter];
//		}
//		
//		System.out.println(sum);

		System.out.println();
		System.out.println("Asking user to define values");

		for (int counter = 0; counter < numberOfPositions; counter++) {
			System.out.println("What number do you want to enter into position " + counter);
			userDefinedArray[counter] = myScanner.nextInt();
			sum += userDefinedArray[counter];
			average=sum/numberOfPositions;
		}
		
		System.out.println(sum);
		System.out.println(average);
		
		myScanner.close();

	}
}

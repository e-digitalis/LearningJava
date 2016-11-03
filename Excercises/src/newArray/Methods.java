package newArray;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Methods {

	static Scanner scan = new Scanner(System.in);

	private static int[] userDefinedArray;
	private static int sum;

	public static int[] createTheArray() {
		System.out.print("How many items do you want in the array? ");
		userDefinedArray = new int[scan.nextInt()];
		return userDefinedArray;
	}

	public static void fillArray() {
		System.out.println();
		for (int counter = 0; counter < userDefinedArray.length; counter++) {
			System.out.print("Which number do you want to enter into position " + counter + ": ");
			userDefinedArray[counter] = scan.nextInt();
		}
	}

	public static void printArray() {
		System.out.println();
		System.out.println("Printing array items: ");
		for (int counter = 0; counter < userDefinedArray.length; counter++) {
			System.out.print(userDefinedArray[counter]);
			if (counter != userDefinedArray.length - 1) {
				System.out.print(", ");
			} else {
				System.out.println();
			}

		}

	}

	public static void sumOfElements() {
		for (int counter = 0; counter < userDefinedArray.length; counter++) {
			sum += userDefinedArray[counter];
		}
		System.out.println();
		System.out.println("Sum: " + sum);
	}

	public static void averageOfElements() {
		double average = (double) sum / userDefinedArray.length;
		DecimalFormat myFormatter = new DecimalFormat("##.##");
		String formatOutput = myFormatter.format(average);
		System.out.println(average);
		System.out.println("Printing average with myFormatter: " + formatOutput);
		System.out.printf("Printing average with printf: %.2f", average);	
	
	}

}
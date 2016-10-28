package tester;

import java.util.Scanner;

public class Inputs {

	public static void main(String[] args) {

		// System.out.println("Inputs");

		Scanner scan = new Scanner(System.in);
		// String input = scan.nextLine();

		// System.out.println(input);

		//

		System.out.println("Please insert an integer: ");
		int num1 = scan.nextInt();
		System.out.println("Please write the second integer: ");
		int num2 = scan.nextInt();
		int num3 = num1 + num2;
		System.out.println("The addition results in: " + num3);

		scan.close();

		System.out.println(
				" "
				+ "\n Oh, one last thing, don't try to scan text with nextLine(); "
				+ "\n AFTER using nextInt() with the same scanner! "
				+ "\n It doesn't work well with Java Scanner, and many "
				+ "\n Java developers opt to just use another Scanner for integers. "
				+ "\n You can call these scanners scan1 and scan2 if you want. "
				+ "\n Read more: http://www.java-made-easy.com/java-scanner.html#ixzz4NXDkp2An");

	}

}

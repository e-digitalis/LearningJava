package googleResultat;

import java.text.DecimalFormat;

public class FormattingNumbers {

	public static void main(String[] args) {

		average();
	}

	public static void average() {
		double average = (double) 20 / 3;
		DecimalFormat myFormatter = new DecimalFormat("##.##");
		String formatOutput = myFormatter.format(average);
		System.out.println(average);
		System.out.println("Printing average with myFormatter: " + formatOutput);
		System.out.printf("Printing average with printf: %.2f", average);	



	}
}
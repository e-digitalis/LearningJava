package handlingNumbers;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class DoingMaths {

	public static void main(String[] args) {

		double d2 = 1;
		double d3 = 1;

		// doing maths with doubles doesn't work as expected, the double value
		// isn't exact
		// you need an infinite number of bits to correctly store a double
		// doubles are stored as a 64 bit number, so it stores an approximate
		// value
		// adding doubles results in rounding errors

		NumberFormat nfpmm00US = NumberFormat.getCurrencyInstance();
		nfpmm00US.setMinimumFractionDigits(5);
		nfpmm00US.setMaximumFractionDigits(5);
		System.out.println(nfpmm00US.format(d2));

		for (int counter = 0; counter < 10; counter++) {
			d2 += 0.1;
			System.out.println(nfpmm00US.format(d2)); //
		}

		for (int counter = 0; counter < 10; counter++) {
			d3 += 0.1;
			System.out.println(d3);
		}

		BigDecimal price = new BigDecimal("0.1"); //necessary to pass in as String
		BigDecimal addValue = new BigDecimal("0.1"); //necessary to pass in as String

		for (int counter = 0; counter < 10; counter++) {
			price = price.add(addValue);
			System.out.println(price);

		}

		BigDecimal priced = new BigDecimal(0.1); //if pass in as double you are passing in an imprecise value
		BigDecimal addValued = new BigDecimal(0.1); //if pass in as double you are passing in an imprecise value

		for (int counter = 0; counter < 10; counter++) {
			priced = priced.add(addValued);
			System.out.println(priced);
		}
	}
}

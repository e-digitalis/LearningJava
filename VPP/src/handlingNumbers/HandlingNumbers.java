package handlingNumbers;

import java.text.NumberFormat;
import java.util.Locale;

public class HandlingNumbers {

	public static void main(String[] args) {

		double d = 1.23456798; //one double, formatted in several ways
	
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(d));
		
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.CANADA);
		System.out.println(nf2.format(d));
		
		Locale swiss = new Locale("fr", "ch"); //making a new locale for Swiss Francs and Switzerland
		NumberFormat nf3 = NumberFormat.getCurrencyInstance(swiss);
		System.out.println(nf3.format(d));
		
		NumberFormat nfp = NumberFormat.getPercentInstance();
		System.out.println(nfp.format(d));
		
		NumberFormat nfp2 = NumberFormat.getPercentInstance(); //just handles the "minimum fraction digits"
		nfp2.setMinimumFractionDigits(2);
		System.out.println("handles the minimum fraction digits only " + nfp2.format(d));
		
		NumberFormat nfpn = NumberFormat.getNumberInstance();
		nfpn.setMinimumFractionDigits(2);
		nfpn.setMaximumFractionDigits(10);
		System.out.println("setting both minimum AND maximum fraction digits " + nfpn.format(d));
		
		NumberFormat nfpmm = NumberFormat.getNumberInstance();
		nfpmm.setMinimumFractionDigits(2);
		nfpmm.setMaximumFractionDigits(3);
		System.out.println("setting both minimum AND maximum fraction digits " + nfpmm.format(d));
	
		
		double d2 = 1.2;
		NumberFormat nfpmm0 = NumberFormat.getNumberInstance(); //setting both minimum AND maximum fraction digits
		nfpmm0.setMinimumFractionDigits(2);
		nfpmm0.setMaximumFractionDigits(3);
		System.out.println("setting both minimum AND maximum fraction digits " + nfpmm0.format(d2));
	
		NumberFormat nfpmm00 = NumberFormat.getNumberInstance(); //setting both minimum AND maximum fraction digits
		nfpmm00.setMinimumFractionDigits(3);
		nfpmm00.setMaximumFractionDigits(3);
		System.out.println("setting both minimum AND maximum fraction digits " + nfpmm00.format(d2));
	
		NumberFormat nfpmm00US = NumberFormat.getNumberInstance(Locale.CANADA); //setting both minimum AND maximum fraction digits
		nfpmm00US.setMinimumFractionDigits(3);
		nfpmm00US.setMaximumFractionDigits(3);
		System.out.println("setting both minimum AND maximum fraction digits " + nfpmm00US.format(d2));
	
		
	}

}

package usingTheJavaLibrary;

import java.util.Date;
import java.text.SimpleDateFormat;

public class UsingSimpleDateFormat {

	public static void main(String[] args) {

		Date today = new Date(); //default is set to the date and time when the variable was instantiated
		System.out.println(today);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); //to format into YMD
		System.out.println(sdf.format(today));
		
		Date month = new Date();
		SimpleDateFormat sdf2 = new SimpleDateFormat("MMM"); // only the month three letters
		System.out.println(sdf2.format(month));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("MMMM"); //the entire month
		System.out.println(sdf3.format(month));
		
		Date anotherDay = new Date();
		SimpleDateFormat sdf4 = new SimpleDateFormat("MMM dd / yy"); 
		System.out.println(sdf4.format(anotherDay));
		
		SimpleDateFormat sdf5 = new SimpleDateFormat("D"); 
		System.out.println(sdf5.format(today));
	
	}

}

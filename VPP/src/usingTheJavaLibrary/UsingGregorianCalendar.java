package usingTheJavaLibrary;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;


public class UsingGregorianCalendar {

	public static void main(String[] args) {

		Date today = new Date();
		GregorianCalendar gCal = new GregorianCalendar(2016,0,1); //index is zero based
		System.out.println(gCal); //rather confusing but if you are using the gregorian calendar and want to have a useful date, you need to call the getTime method()
		
		gCal.add(GregorianCalendar.DAY_OF_MONTH, 67);
		
		
		today = gCal.getTime();
		System.out.println("hhh");
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MMM-dd");
		System.out.println("Today is "+ sdf.format(today));
		
		Date today2 = gCal.getTime();
		System.out.println(gCal); 
		System.out.println("Today is "+ sdf.format(today2));
		
		System.out.println("222");
		
		
		gCal.add(GregorianCalendar.DAY_OF_MONTH, 67);
		Date today3 = gCal.getTime();
		System.out.println("Today is "+ sdf.format(today3));
		
	
		gCal.add(GregorianCalendar.DAY_OF_WEEK, 3);
		Date today4 = gCal.getTime();
		System.out.println("Today is "+ sdf.format(today4));
	
	
		gCal.add(GregorianCalendar.WEEK_OF_YEAR, 3);
		Date today5 = gCal.getTime();
		System.out.println("Today is "+ sdf.format(today5));
		

	}

}

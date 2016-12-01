package dates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateBasics {	

public static void main(String[] args) {
	DateBasics dm = new DateBasics();
	dm.setTodaysDate();

}


	public void setTodaysDate(){

		Date dt = new Date(); //deprecated older than the Gregorian calendar even
		System.out.println("Deprecated " + dt.toString()); //deprecated older than the Gregorian calendar even
		LocalDate now1 = LocalDate.now(); 
		LocalTime now2 = LocalTime.now(); 
		LocalDateTime now3 = LocalDateTime.now(); 
		// the new local date time classes have a different type of constructor
		// they have a factory method instead of a regular constructor

		System.out.println("LD: " + now1.toString());
		System.out.println("LT: " + now2.toString());
		System.out.println("LDT: " + now3.toString());
		
		LocalDateTime then = LocalDateTime.of(2010, 7, 18, 02, 03);
		DayOfWeek day = then.getDayOfWeek();
		System.out.println(day);		
		System.out.println(then.plusYears(6).getDayOfWeek());
		long l = then.until(now3, ChronoUnit.DAYS);
		System.out.println(l);
	}

}

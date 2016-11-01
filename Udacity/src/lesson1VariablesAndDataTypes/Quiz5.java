package lesson1;

public class Quiz5 {

	public static void main(String[] args) {

		double maths = 97.5;
		double english = 98;
		double science = 83.5;
		double drama = 75;
		double music = 96;
		
		double sum = maths + english + science + drama + music;
		double average = sum/5;
		
		System.out.println(sum);
		System.out.println(average);
		

		int bankBalance = 500;
		bankBalance = bankBalance + 250;
		bankBalance = bankBalance - 100;
		System.out.println(bankBalance);
		
		System.out.println(2.0 * (5 / 2));	//	truncation
	//	When multiplying a double and an integer, the result is a double, so the value printed is the double 4.0.
	
		int day = 15;
		String month = "september";
		
		String firstName = "Elisabeth";
		String lastName = "Lang";
		String fullName = firstName + " " + lastName;
		int lengthFirstName = firstName.length();
		int lengthLastName = lastName.length();
		int lengthFullName = lengthFirstName + lengthLastName;
		System.out.println(lengthFullName);
		
		System.out.println("Hello my name is " + fullName);
		System.out.println("There are " + lengthFullName + " characters in my name.");
		

		double fahrenheit = 68;
		double celsius = ((fahrenheit - 32) * 5) / 9;
		System.out.println(celsius);
		
	}

}

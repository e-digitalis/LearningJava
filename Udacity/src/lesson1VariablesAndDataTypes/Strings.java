package lesson1VariablesAndDataTypes;

public class Strings {

	public static void main(String[] args) {
		
		String driver;		//declaring drivers name
		driver = "Hamish";
		System.out.println(driver);
		
		int letters = driver.length();
		System.out.println(letters);
		
		driver = driver.toUpperCase();
		System.out.println(driver);
		
		driver = driver.toLowerCase();
		System.out.println(driver);
		

	}

}

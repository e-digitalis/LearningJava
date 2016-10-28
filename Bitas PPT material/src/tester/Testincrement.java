package tester;

public class Testincrement {

	public static void main(String[] args) {
		
		int number = 51;
		System.out.println(number);
		
		int increment = ++number;
		System.out.println(increment);
		
		String lengthCheck = "9223372036854775808";
		int lengthChecked = lengthCheck.length();
		
		System.out.println(" ");
		
		System.out.println("It is " + lengthChecked + " characters long.");	
	}

}

package methods;

public class MainExample {

	public static void main(String[] args) {

		System.out.println("Method Example");
		System.out.println("go to sayHello method");
		System.out.println("remember to include the prentheses when calling the method first or it will not work");
		sayHello();
		System.out.println();
		System.out.println("now we are back in main method");
		System.out.println(testReturnDouble() + " now I will call method 5");
		five();
		System.out.println();
		System.out.println("back in Main again - will test to print the value I got from five");
		System.out.println(five());
		System.out.println();
		System.out.println("I will now create the variable inside the Main and do stuff with it");
		int numFromFive=five();
		System.out.println("Back in Main, printing the value received from the new variable "+numFromFive);		
		
	}

	public static void sayHello() {
		System.out.println();
		System.out.println("I'm in sayHello method now");
		System.out.println("Hello World!");
		double dtest = 3.14;
		System.out.println("just for fun lets print " + dtest);

	}

	public static double testReturnDouble() {
		System.out.println("I want to return the double which is set to pi");
		double dtest = Math.PI;
		return dtest;

	}

	public static int five() {
		System.out.println();
		System.out.println("We are in method ''five'' now and will create the int num with value 5 and send the value back");
		int num=5;
		return num;
		
	}	
	
	
	
}

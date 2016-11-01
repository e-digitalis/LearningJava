package lesson1;

public class Variables {

	public static void main(String[] args) {

		int passengers;		//this is called declaring a variable
		passengers = 0;		// this is called initializing the variable
		System.out.println(passengers);
		
		passengers = passengers + 5;
		System.out.println(passengers);
		
		passengers = passengers -3 ;
		System.out.println(passengers);
		
		passengers = passengers -1 + 5;
		System.out.println(passengers);

		System.out.println();
		
		System.out.println("You can DECLARE and INITIALIZE a varibale on the same line:");
		System.out.println("exempel:");
		
		int passengers2 = 5;
		System.out.println(passengers2);
		
	}

}

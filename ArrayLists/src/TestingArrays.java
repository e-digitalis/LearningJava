import java.util.ArrayList;

import sun.applet.Main;

public class TestingArrays {

	public static void main(String[] args) {

		/*
		 * To use ArrayLists, import java.util.ArrayList;
		 * 
		 * There are two ways of creating ArrayLists ArrayList<String> names =
		 * new ArrayList<String>(); same as ArrayList<String> names = new
		 * ArrayList<>();
		 */

		System.out.println("\n****************************************\n");

		// Create an ArrayList that holds references to String objects
		ArrayList<String> names = new ArrayList<String>();

		// Add three string references
		names.add("Joyce"); // Adds element
		names.add("Fatima"); // Adds element on first empty position
		names.add("Hanna");
		names.add("Olga");
		names.add(1, "Xiaoyi"); // Adds new element to position 1 and pushes all
								// down the list
		names.add("Joyce");
		names.set(2, "Amelia"); // SET!!!!!! change position 0 to "Asmaa"
		names.add("Fatima");
		names.remove(0); // Remove element by position
		names.remove("Hanna"); // Remove element by name
		names.add("Asmaa");
		names.add("Hanna");

		/*
		 * add remove by name remove by position add(1,"") set(2,"") get(0) size
		 */

		// Access and print some of the String references
		System.out.println("First element in ArrayList is stored in position 0: " + names.get(0));
		System.out.println("Element in position 1: " + names.get(1));

		ArrayList<String> employees = new ArrayList<>();

		employees.add("Bardia");
		employees.add("Bita");

		// Get method for ArrayLists
		System.out.println(names.get(2));

		// Set method for ArrayLists
		names.set(0, "Asmaa"); // change position 0 to "Asmaa"
		System.out.println("Element in position 0 is now: " + names.get(0));

		System.out.println("\nPrinting ArrayList");
		for (String position : names) {
			System.out.println(position);
		}

		System.out.println(names.size());
		ArrayList<String> companies = new ArrayList<>();
		System.out.println("initial size of array is " + companies.size());

		for (int position = 0; position < names.size(); position++) {
			System.out.println("Element in position " + position + " is " + names.get(position));
		}

	}

}

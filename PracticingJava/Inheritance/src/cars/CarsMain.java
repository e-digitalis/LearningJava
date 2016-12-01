package cars;

import java.util.ArrayList;

public class CarsMain {
	public static void main(String[] args) {
		addMethod();
		printArrayList();
		countVolvos();
		System.out.println("hi");
		System.out.println();
	}

	static ArrayList<Cars> myCarArray = new ArrayList<Cars>();

	public static void addMethod() {
		myCarArray.add(new Renault());
		myCarArray.add(new Renault());
		myCarArray.add(new Renault());
		myCarArray.add(new Volvo(4, 4, true));
		myCarArray.add(new Volvo(2, 4, false));
		myCarArray.add(new YCabs());
		myCarArray.add(new YCabs());

		Cars r1 = new Renault();				Cars r2 = new Renault(); 				Cars r3 = new Renault(); 	Cars r4 = new Renault();
		Cars v1 = new Volvo(4, 4, false);		Cars v2 = new Volvo(3, 4, true);		Cars v3 = new Volvo(4,3,true);		Cars v4 = new Volvo(4,4,true);
		Cars y1 = new YCabs();					Cars y2 = new YCabs();					Cars y3 = new YCabs();		Cars y4 = new YCabs();
		
		myCarArray.add(r1);
		myCarArray.add(r2);
		myCarArray.add(r3);
		myCarArray.add(r4);
		myCarArray.add(v1);
		myCarArray.add(v2);
		myCarArray.add(y1);
		myCarArray.add(y2);
	}

	public static int countVolvos() {
		int volvoCounter = 0;
		for (Cars cx : myCarArray) {
			if (cx.getBrand() == "Volvo") {
				volvoCounter++;
			}
		}
		System.out.println("Volvo counter is " + volvoCounter);
		return volvoCounter;
	}

	// prints all contents in the arraylist
	public static void printArrayList() {
		for (Cars cx : myCarArray) {
			System.out.println(cx);
		}
	}

}

package animals;

import java.util.Scanner;

public abstract class Animals { // class is abstract, no objects of type animal
								// can be created
	// the class exists to extend to subclasses, i.e. so subclasses can inherit
	// from it

	public static Scanner myScan = new Scanner(System.in); // creating a scanner
															// for user input,
															// making it public
															// and static so
															// available to all

	static String typeOfAnimal; // declaring type of animal, it is initialized
								// in each class
	String name; // declaring name, initialized with user input

	public Animals() { // constructor of animal class
		System.out.println(); // all this will happen when objects are created
								// in sub classes
		System.out.print("An animal has been created using the constructor in the abstract Animal class.");
		System.out.println(" What is the name of the animal?");
		name = Animals.myScan.nextLine();

	}

	public void sleep(String stofaSleep) {
		System.out.println("The animal, a " + stofaSleep + ", is sleeping. This animal is a " + stofaSleep
				+ " and the name is " + name + ".");
	}

	public void eat(String stofaEat) {
		System.out.println(
				"The animal, a " + stofaEat + ", is eating. The name of the " + stofaEat + " is " + name + ".");
	}

	public void makeSound() {
		System.out.println("The animal makes a sound.");
	}

}

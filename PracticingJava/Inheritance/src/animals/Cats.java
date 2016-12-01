package animals;

public class Cats extends Animals {

	static String typeOfAnimal = "cat";

	public Cats() {
		super();
		System.out.print("A cat has been created using the constructor in the Cats class.");
	}

	@Override
	public void makeSound(){//I could make the method abstract, which would force all subclasses to have their own version
		System.out.println("Cats say meow.");
	}
}

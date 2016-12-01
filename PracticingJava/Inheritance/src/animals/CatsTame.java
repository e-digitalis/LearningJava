package animals;

public class CatsTame extends Cats {

	static String typeOfAnimal = "tame cat";

	public CatsTame() { //constructor for tame cat
		super();
		System.out.println(" It is a " + typeOfAnimal + ", because we chose to create an animal of that type.");

	}
	
	@Override //overriding methods in super classes
	public void makeSound(){
		System.out.println("Tame cats also say meow.");
	}

}

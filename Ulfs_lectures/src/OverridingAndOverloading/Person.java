package OverridingAndOverloading;

		//Overloading

public class Person {

	private String name;
	private int age;

	public Person() {
		name = "N.N";
		age = 0;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) { //overloading
		//making many versions of the same method, different parameters
		this.name = name;
	}

	public void setName(String firstName, String lastName) { //overloading
		this.name = firstName + " " + lastName;
	}

	public void setName() { //overloading
		name = "N.N.";

	}
	
	@Override			//annotation - ensures it's actually an override
	//making our own version of something we inherited
	//not a good idea to overload an override  
	public String toString(){ //override
		return name + ": " + age;
		
	}

}
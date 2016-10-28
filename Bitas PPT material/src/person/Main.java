package person;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		PersonSalary person1 = new PersonSalary();
		PersonSalary person2 = new PersonSalary();
		PersonSalary person3 = new PersonSalary();
		PersonSalary person4 = new PersonSalary();
	
		Scanner sc = new Scanner(System.in);
		// hur definierar jag en klass och ropar på den? Person();
	
		System.out.println("Please enter the name of person # 1: ");
		String firstName = sc.nextLine();
		
		person1.setFirstName(firstName);
		
		System.out.println("Person 1 heter: "+person1.getFirstName());
		
	}

}


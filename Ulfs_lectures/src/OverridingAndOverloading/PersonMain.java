package OverridingAndOverloading;

import org.omg.Messaging.SyncScopeHelper;

public class PersonMain {

	//example of OVERLOADING
	
	public static void main(String[] args) {

		Person noParameters = new Person();
		Person withParameters = new Person("Lissa Li", 15);

		//overloading
		
		Person p = new Person();
		Person pp = new Person("Lissa Li", 15);
		Person ppp = new Person();

		//overloading setname - three ways provided of setting the name
		p.setName("Elissa Lang");
		pp.setName("Razieh", "Rouzbahani");
		ppp.setName();
		
		
		//overriding
				
		System.out.println(p.toString());
		System.out.println(pp.toString());
		System.out.println(ppp.toString());
				
	}

}

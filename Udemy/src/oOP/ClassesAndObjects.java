package oOP;

import javax.swing.JLabel;

public class ClassesAndObjects {

	public static void main(String[] args) {
		JLabel label = new JLabel();
				
		Person newPerson = new Person("noname");
		
		Person Olga = new Person("Olga");
		Olga.name = "Olga2";
		Olga.age = 15;
		Olga.setAge(Olga.age++);
		
		System.out.println(Olga.name.length());
		System.out.println(Olga.name.concat("hejohå").concat("Razieh.name"));
		
		Person Razieh = new Person("Razieh");
		Razieh.name = "Raziehreset";
		Razieh.age = 20;
		Razieh.setAge(25);
	
		System.out.println(Razieh.name.length());
		System.out.println(Razieh.getName().concat(" is ") + Razieh.getAge());
		
		System.out.println(Olga.name.concat(" is ")+ Olga.age + " years old");
		System.out.println();
		
		Razieh.sayHelloTo(Olga);
		Olga.sayHelloTo(Razieh);
	}
	
}

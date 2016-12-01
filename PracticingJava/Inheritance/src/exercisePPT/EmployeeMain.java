package exercisePPT;

import java.util.ArrayList;

public class EmployeeMain {

	public static void main(String[] args) {
		
		ArrayList <Employee> empl = new ArrayList<>();
		Technician t1 = new Technician("Karla",10000);
		Receptionist r1 = new Receptionist("Max",10000,30);
		Programmer p1 = new Programmer("Maria",12000);
		
		empl.add(t1);
		empl.add(r1);
		empl.add(p1);
		
		p1.anotherApplication();
		p1.anotherApplication();
		p1.anotherApplication();
		
		t1.anotherServerCrash();
		t1.anotherServerCrash();
		t1.anotherServerCrash();
		t1.anotherServerCrash();
		
		
		double totalBonus = CalculateBonus.sumBonus(empl);
		System.out.println(totalBonus);
	}
	
}

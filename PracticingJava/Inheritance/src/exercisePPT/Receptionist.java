package exercisePPT;

public class Receptionist extends Employee {

	int age;
	double bonus;
	
	public Receptionist(String aName, double aSalary, int age) {
		super(aName, aSalary);
		this.age = age;
	}

	@Override
	public double bonus() {
		bonus = employeeBonusBase + age*30;
		return bonus;
	}

}

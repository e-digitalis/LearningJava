package exercisePPT;

public class Technician extends Employee {

	int numberOfServerCrashes = 0;
	
	public Technician(String aName, double aSalary) {
		super(aName, aSalary);
	}

	@Override
	public double bonus() {
		double bonus = employeeBonusBase - numberOfServerCrashes;
		return bonus;
	}

	public void anotherServerCrash(){
		numberOfServerCrashes=+1;
	}
	
}

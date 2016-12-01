package exercisePPT;

public class Programmer extends Employee {

	int numberOfApplications;
	
	public Programmer(String aName, double aSalary) {
		super(aName, aSalary);
	}

	@Override
	public double bonus() {

		double bonus = employeeBonusBase * numberOfApplications;
		return bonus;
	}

	public void anotherApplication(){
		numberOfApplications+=1;
	}
	
}

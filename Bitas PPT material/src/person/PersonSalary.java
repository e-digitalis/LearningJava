package person;



public class PersonSalary {

	private String firstName;
	private String lastName;
	private int employeeNumber;
	private int yearsOfEmployment;
	
	double salaryPerHour;
	double hoursWorked;
	final double taxRate = 0.25;

	public double monthlySalary() {
		double monthlySalary = salaryPerHour*hoursWorked;
		return monthlySalary;
	}	

	public double taxPaid(){
		double taxPaid = this.monthlySalary()*taxRate;
		return taxPaid;
	}
	  
	public double salaryAfterTax(){
		double salaryAfterTax = this.monthlySalary()*(1-taxRate);
		return salaryAfterTax;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public int getYearsOfEmployment() {
		return yearsOfEmployment;
	}

	public void setYearsOfEmployment(int yearsOfEmployment) {
		this.yearsOfEmployment = yearsOfEmployment;
	}
	
		
}

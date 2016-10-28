package librarycase;

public class Customer {

	private String title;
	private String firstName;
	private String lastName;
	private String address;
	private String phoneNumber;
	private String eMail;
	private int customerNumber;
	private GenderType gender;
	private boolean isValid;

	public Customer(String title, String firstName, String lastName, String address, String phoneNumber, String eMail,
			int customerNumber, GenderType gender) {
		// System.out.println("New Customer created");

		/*
		 * this is the constructor setting it up this way means we can only
		 * create a new instance of the customer if we pass in the title, first
		 * name and last name we can leave fields out of the constructor
		 * arguments
		 */

	//	setName(title, firstName, lastName);

		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.eMail = eMail;
		this.customerNumber = customerNumber;
		this.gender = gender;
		this.isValid = true;

	}

	public String gettitle() {
		return title;
	}

	public String getfirstName() {
		return firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public String address() {
		return address;
	}

	public String phoneNumber() {
		return phoneNumber;
	}

	public String eMail() {
		return eMail;
	}

	public int customerNumber() {
		return customerNumber;
	}

	public GenderType gender() {
		return gender;
	}

	public boolean isValid() {
		return isValid;
	}

	private void setName(String title, String firstName, String lastName, String address, String phoneNumber,
			String eMail, int customerNumber, char gender, boolean isValid) {

	}

	public String getMailingName() {
		String mailingName;
		mailingName = title + " " + firstName.substring(0, 1) + ". " + lastName;
		return mailingName;
	}

	public GenderType getGender() {
		return gender;
	}
}

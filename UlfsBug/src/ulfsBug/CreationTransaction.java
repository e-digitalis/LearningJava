package ulfsBug;

public class CreationTransaction extends Transaction {

	public CreationTransaction() {
		super(0);
	}
	
	@Override
	public void printTransaction() {
		System.out.println(super.toString() + " created");

	}

}

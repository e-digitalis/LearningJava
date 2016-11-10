package ulfsBug;

public class DepositTransaction extends Transaction {

	public  DepositTransaction(int amount) {
		super(amount);
	}
	
	@Override
	public void printTransaction() {
		System.out.println(super.toString() + " deposited");

	}

}

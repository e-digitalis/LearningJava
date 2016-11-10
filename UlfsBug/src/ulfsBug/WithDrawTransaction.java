package ulfsBug;

public class WithDrawTransaction extends Transaction {

	public  WithDrawTransaction(int amount) {
		super(amount);
	}
	
	@Override
	public void printTransaction() {
		System.out.println(super.toString() + " withdrawn");

	}

}

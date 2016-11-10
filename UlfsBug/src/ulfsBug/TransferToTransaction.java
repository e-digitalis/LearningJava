package ulfsBug;

public class TransferToTransaction extends Transaction {

private String fromName;
	
	public  TransferToTransaction(int amount, String from) {
		super(amount);
		fromName = from;
	}
	@Override
	public void printTransaction() {
		System.out.println(super.toString() + " transfer from " + fromName);

	}
}

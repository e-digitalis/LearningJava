package ulfsBug;

public class TransferFromTransaction extends Transaction {

	private String toName;
	
	public  TransferFromTransaction(int amount, String to) {
		super(amount);
		toName = to;
	}
	@Override
	public void printTransaction() {
		System.out.println(super.toString() + " transfer to " + toName);

	}

}

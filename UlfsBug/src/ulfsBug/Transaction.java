package ulfsBug;
import java.util.Date;

public abstract class Transaction {
	private Date timeStamp;
	private int id;
	private int amount;
	
	private static int transactionIdGenerator = 0;

	public Transaction(int amount){
		timeStamp = new Date();
		id = transactionIdGenerator++;
		this.amount = amount;
	}
		
	abstract public void printTransaction();

	@Override
	public String toString() {
		return timeStamp + " ["+ id + "] "+ amount;
	}
}

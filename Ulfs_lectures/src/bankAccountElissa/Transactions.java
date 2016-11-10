package bankAccountElissa;

import java.util.Date;

public abstract class Transactions {

	private Date timeStamp;
	private int id;
	private double amount;
	
	


	@Override
	public String toString() {
		return timeStamp + "[" + id + "] " + amount + " ";
	}
	
}

package bankAccountWeek3;

public class TransactionCreate extends Transaction {

	public TransactionCreate(){
		super(0.0);
	}
	
	@Override
	public void printTransaction() {

		System.out.println(super.toString());

	}

}

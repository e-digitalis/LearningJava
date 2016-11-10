package bankAccountElissa;


public class Account {

	private String owner;
	private int accountNumber = 0;
	private double balance;
	private int amount;
	
	private Transactions[] transactionList;
	private int nTransactions;
	
	private static int numberOfAccounts = 0;
	
	public Account(String owner, int amount) {
		this.owner = owner;
		numberOfAccounts++;
		this.accountNumber = numberOfAccounts;
		this.balance = amount;
		System.out.println(numberOfAccounts);

		
	}
	
//	public int AccountTracker(){
//		AccountTracker++;
//		return AccountTracker;
//	}

	public void deposit(int amount){
		this.balance += amount;
	}
	
	public void withdraw(int amount){
		this.balance -= amount;
	}
	
	public void transfer(int amount, String to){
		this.balance -= amount;
	}
	
	public void printAll(){
		System.out.println();
	}
	
	
}

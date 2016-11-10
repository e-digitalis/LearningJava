package vPPLibrarycase;

public abstract class Material {

	private int id;
	private String title;
	private String branch;
	private Customer borrower;
	
	public Material(int id, String title, String branch) {
		this.id = id;
		this.title = title;
		this.branch = branch;
	}

	public String getTitle() {
		return title;
	}

	public int getID(){
		return id;
	}
	
	public void relocate(String newBranch){
		this.branch = newBranch;
	}

	abstract public String getMaterialType();

	
	public boolean lend(Customer customer){
		if (this.borrower == null){
		this.borrower = customer;
		return true;
		} else{
			return false;
		}
	}
	
	//all abstract methods must be overridden
	//abstract methods cannot have a body or curly brackets
	//they end with a semicolon;
	//to compile correctly they must be implemented in each subclass
	public abstract int getLoanPeriod();
	
}

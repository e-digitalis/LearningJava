package vPPLibrarycase;

public class DVD extends Material {

	private String director;
	private int catalogNo;
	private int runningTime;
	private boolean licensed;
	private final String materialType = "DVD";

	public DVD(int id, String title, String branch, String director, int catalogNo, int runningTime) {
		super(id, title, branch);
		this.director = director;
		this.catalogNo = catalogNo;
		this.runningTime = runningTime;
		licensed = false;
	}

	public void license() {
		licensed = true;
	}

	public boolean isLicenced() {
		return licensed;
	}

	public String getMaterialType() {
		return materialType;
	}
	
	@Override
	public boolean lend(Customer customer) {
		if (licensed) {
			return super.lend(customer);
		} else {
			return false;
		}

		//		public boolean extraLicenceCheck(){ //TODO:code written to work in main, needs a rework to work in here 
		//			if (dvd1.isLicenced()) {
		//				System.out.println("Yes, it is licenced!");
		//			} else {
		//				System.out.println("Uhoh! Better check that licence!");
		//			}
	}

	@Override
	public int getLoanPeriod() {
		return 7;
	}

}



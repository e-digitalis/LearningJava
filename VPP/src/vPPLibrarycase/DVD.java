package vPPLibrarycase;

public class DVD extends Material {

	private String director;
	private int catalogNo;
	private int runningTime;
	private boolean licenced;

	public DVD(int id, String title, String branch, String director, int catalogNo, int runningTime) {
		super(id, title, branch);
		this.director = director;
		this.catalogNo = catalogNo;
		this.runningTime = runningTime;
		licenced = false;
	}

	public void licence() {
		licenced = true;
	}

	public boolean isLicenced() {
		return licenced;
	}

	
	
}

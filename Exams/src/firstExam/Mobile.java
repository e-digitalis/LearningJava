package firstExam;

public class Mobile {

	// Create a class mobile with brand name, model name and display size.

	String brandName;
	String modelName;
	int displaySize;
	
	
	// Make a constructor for the mobile class
	
	public Mobile(String brandName, String modelName, int displaySize) {
		super();
		this.brandName = brandName;
		this.modelName = modelName;
		this.displaySize = displaySize;
	}
	
	
	public String getBrandName() {
		return brandName;
	}


	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}


	public String getModelName() {
		return modelName;
	}


	public void setModelName(String modelName) {
		this.modelName = modelName;
	}


	public int getDisplaySize() {
		return displaySize;
	}


	public void setDisplaySize(int displaySize) {
		this.displaySize = displaySize;
	}

	
	
	
}

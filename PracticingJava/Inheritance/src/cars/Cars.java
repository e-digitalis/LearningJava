package cars;

public abstract class Cars {

	protected String brand;
	private int doors;
	private int wheels;
	private boolean hardtop;

	
	
	public Cars(String brand, int doors, int wheels, boolean hardtop) {
		this.brand = brand;
		this.doors = doors;
		this.wheels = wheels;
		this.hardtop = hardtop;
	}
	
	@Override
	public String toString() {
		return "Cars [brand=" + brand + ", doors=" + doors + ", wheels=" + wheels + ", hardtop=" + hardtop + "]";
	}

	public int getDoors() {
		return doors;
	}



	public void setDoors(int doors) {
		this.doors = doors;
	}



	public int getWheels() {
		return wheels;
	}



	public void setWheels(int wheels) {
		this.wheels = wheels;
	}



	public boolean isHardtop() {
		return hardtop;
	}



	public void setHardtop(boolean hardtop) {
		this.hardtop = hardtop;
	}



	



	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}

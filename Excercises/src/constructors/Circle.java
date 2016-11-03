package constructors;

public class Circle {

	private int radius;

	public Circle(int radius) {
		this.radius = radius;
		System.out.println("The constructor is now creating an object from the class Circle");
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		if (radius<=0){
			System.out.println("Invalid input");
		} else {
			this.radius = radius;
		}
				
	}
	
}

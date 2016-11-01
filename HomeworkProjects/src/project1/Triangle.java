package project1; 


public class Triangle { 


	private double area;
	private double circumference;
	
	public Triangle(double base, double height) {
		area = (base * height) / 2;
						
	}

	public Triangle(double sideA, double sideB, double sideC) {
		circumference = sideA + sideB + sideC;
	}

	public double getArea() {
		return area;
	}

	public double getCircumference() {
		return circumference;
	}
	
	
	
	
	
	

}

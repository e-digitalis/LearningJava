package project1;

public class Rectangle {



	private double area;
	private double circumference;
	
	
	public Rectangle(double sideA, double sideB) {

		area = sideA * sideB;
		circumference = (sideA *2) + (sideB *2);
	}

	public double getArea() {
		return area;
	}

	public double getCircumference() {
		return circumference;
	}
	
}

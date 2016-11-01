package project1;  //keeping classes as clean as possible, no methods 

public class Circle {

	private final double PI = 3.14;
	private double radie;
	private double circumference;
	private double area;

	public Circle(double radie) {

		circumference = PI * radie * 2;
		area = radie * radie * PI;

	}

	public double getRadie() {
		return radie;
	}

	public double getCircumference() {
		return circumference;
	}

	public double getArea() {
		return area;
	}
	
		
	
}

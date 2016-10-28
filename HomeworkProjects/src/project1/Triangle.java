package project1;

import java.util.Scanner;

public class Triangle {

	Scanner sc = new Scanner(System.in);

	// for area
	private double base;
	private double height;

	// for circumference

	private double sideA;
	private double sideB;
	private double sideC;

	double area;
	double circumference;
	
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
		area = (base * height) / 2;
				
	}

	public Triangle(double sideA, double sideB, double sideC) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
		circumference = sideA + sideB + sideC;
	}
	
	
	
	
	
	

}

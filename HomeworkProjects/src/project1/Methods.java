package project1;

import javax.swing.JOptionPane;



public class Methods {

	
	public static int inputBoxShape(){
	String[] options = new String[] { "Circle", "Triangle", "Rectangle" };
	int figureChoice = JOptionPane.showOptionDialog(null, "Please make your choice:", "Play the game.",
			JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
	return figureChoice;
	
	// Where response == 0 for Circle, 1 for Triangle, 2 for Rectangle.
	}
	
	public static int inputBoxCalculation(){
	String[] options2 = new String[] { "Area", "Circumference", "Both" };
	int methodChoice = JOptionPane.showOptionDialog(null, "Please make your choice:", "Choose method.",
			JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options2, options2[0]);
	return methodChoice;
	}
	
	// Where response == 0 for Area, 1 for Circumference, 2 for Both.
	

	public static void printCircleArea(int methodChoice) {
		// Where response == 0 for Area, 1 for Circumference, 2 for Both.

		String StringInputCircleArea = JOptionPane.showInputDialog("Please enter the value of the radius (whole number): ");
		int intInputCircleArea = Integer.parseInt(StringInputCircleArea);
		Circle myCircle = new Circle(intInputCircleArea);
		
		switch (methodChoice) {
		case 0:
			System.out.println("The area of the circle is " + myCircle.getArea());
			break;
		case 1:
			System.out.println("The circumference of the circle is " + myCircle.getCircumference());
			break;
		case 2:
			System.out.println("The area of the circle is " + myCircle.getArea());
			System.out.println("The circumference of the circle is " + myCircle.getCircumference());

		}

	}

	public static void printTriangleArea(int methodChoice) {
		// Where response == 0 for Area, 1 for Circumference, 2 for Both.

		String StringInputTriangleBase = JOptionPane.showInputDialog("Please enter the value of the triangle's base (whole number): ");
		int intInputTriangleBase = Integer.parseInt(StringInputTriangleBase);
		
		String StringInputTriangleHeight = JOptionPane.showInputDialog("Please enter the value of triangle's height (whole number): ");  
		//we're asking for redundant information here, if user wants to calculate circumference
		int intInputTriangleHeight = Integer.parseInt(StringInputTriangleHeight);
		
		String StringInputTriangleA = JOptionPane.showInputDialog("Please enter the value of Side A (whole number): ");
		//we're asking for redundant information here, if user wants to calculate area
		int intInputTriangleA = Integer.parseInt(StringInputTriangleA);
		
		String StringInputTriangleB = JOptionPane.showInputDialog("Please enter the value of Side B (whole number): ");
		//we're asking for redundant information here, if user wants to calculate area
		int intInputTriangleB = Integer.parseInt(StringInputTriangleB);
		
			
		
		Triangle triangleArea = new Triangle(intInputTriangleBase, intInputTriangleHeight);
		Triangle triangleCircumference = new Triangle(intInputTriangleA, intInputTriangleB, intInputTriangleBase);
		
		
		
		switch (methodChoice) {
		case 0:
			System.out.println("The area of the triangle is " + triangleArea.getArea());
			break;
		case 1:
			System.out.println("The circumference of the triangle is " + triangleCircumference.getCircumference());
			break;
		case 2:
			System.out.println("The area of the triangle is " + triangleArea.getArea());
			System.out.println("The circumference of the triangle is " + triangleCircumference.getCircumference());

		}

	}

	public static void printRectangleArea(int methodChoice) {
		// Where response == 0 for Area, 1 for Circumference, 2 for Both.

		String StringInputRectangleA = JOptionPane.showInputDialog("Please enter the value of Side A (whole number): ");
		int intInputRectangleA = Integer.parseInt(StringInputRectangleA);
		
		String StringInputRectangleB = JOptionPane.showInputDialog("Please enter the value of Side B (whole number): ");
		int intInputRectangleB = Integer.parseInt(StringInputRectangleB);
		
		Rectangle myRectangle = new Rectangle(intInputRectangleA,intInputRectangleB);
		
		
		switch (methodChoice) {
		case 0:
			System.out.println("The area of the rectangle is " + myRectangle.getArea());
			break;
		case 1:
			System.out.println("The circumference of the rectangle is " + myRectangle.getCircumference());
			break;
		case 2:
			System.out.println("The area of the rectangle is " + myRectangle.getArea());
			System.out.println("The circumference of the rectangle is " + myRectangle.getCircumference());

		}

	}
	
}

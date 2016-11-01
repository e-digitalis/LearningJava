package lesson2;

public class LogicalOperatorsCombined {

	public static void main(String[] args) {

		int age = 15;
		boolean isStudent = true;
				
		if (age <= 15 || age>60 || isStudent);
		
	//	The ! operator will be evaluated first, then &&, and finally ||. 
	//	If you have a bunch of the same operations in an expression, like multiple || combinations, then you just operate from left to right.
	//	To change the order of operations you can surround expressions in parentheses because parentheses will be evaluated before anything else.

		System.out.println("So, the order of operations is: \n"
				+ "Parentheses \n"
				+ "NOT ! \n"
				+ "AND &&  \n"
				+ "OR ||");
		
		/*Order of Operations (for Logical Operators)
Just like how math operators (*, /, +, -) have an order that they are evaluated in, ie. multiplication is evaluated before addition, so do logical operators!

The ! operator will be evaluated first, then &&, and finally ||. If you have a bunch of the same operations in an expression, like multiple || combinations, then you just operate from left to right.

To change the order of operations you can surround expressions in parentheses because parentheses will be evaluated before anything else.

So, the order of operations is:

Parentheses
NOT !
AND &&
OR ||
For the expression:

!true || false && true

This will have the NOT ! operator evaluated first, so this simplifies to:

false || false && true

Then the AND && operator will be evaluated. The combination false && true equals false, and the whole expression becomes:

false || false

Finally the OR || operator will be evaluated, and the whole expression evaluates to false.
		 * 
		 */
		
	}

}

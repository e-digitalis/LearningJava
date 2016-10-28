package lesson1;

public class ArithmeticOperations {

	public static void main(String[] args) {

		int x = 2+3;
		int y = 4-5;
		int temp = -20;
		int days = 7*4;
		double div = 5/2;	//OBS! dödar decimalerna
		double accurate = 5/2.0; //för att bevara decimalerna måste minst en av det som ska divideras skrivas som decimaltal
		
	//	alternativet är att casta som double mha (double)
		
		double div2 = 24/5;
		double accurate2 = 24/5.0;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(temp);
		System.out.println(days);
		System.out.println(div);
		System.out.println(accurate);
		System.out.println(div2);
		System.out.println(accurate2);
		
		int xx = 2+3;
		int yy = 4-5;
		int z = xx*yy;
		
		System.out.println(z);
		
		double paid = 10;
		double change = 3.25;
		double tip = (paid-change)*0.2; 
		System.out.println(tip);
		
		System.out.println("multiplication and division are priorituzed over");
		System.out.println("addition and substraction");
		System.out.println("if in doubt, add parentheses");
		
		
		

		
	}

}

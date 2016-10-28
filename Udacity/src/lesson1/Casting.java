package lesson1;

public class Casting {

	public static void main(String[] args) {

		System.out.println("truncation is when the decimals are chopped off");

		double current = 17;
		double rate = 1.5;
		double future = current * rate;
		System.out.println(future);
		
		int approx = (int)future; 		//	cast to integer
		System.out.println(approx);
		
		int x = 5;
		int y = 2;
		double div = x/y;
		System.out.println(div);
		
		double accurate = (double)x/y; //	cast to double
		System.out.println(accurate);
		
		
	}

}

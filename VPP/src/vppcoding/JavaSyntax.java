package vppcoding;

public class JavaSyntax {

	public static void main(String[] args) {
		
		int i = 1;
		int j = 2;
		
		byte b = 126; // (from -127 to 127)
		
		// i praktiken används endast ints och longs
		// bytes och shorts går att bortse från för allt utom java tester
		
		// short 
		
		long l = 100L;
		long l2 = 9000000000L;
		
		float f = 1.2f; //memory is contrained
		double d = 2; // better option
		
		int i1 = 100;
		int i2 = 51;
		
		double d1 = i1;
		double d2 = i2;
		
		System.out.println(i1 + i2);
		System.out.println(i1 * i2);
		System.out.println(i1 - i2);
		System.out.println(i1 / i2 + "		OBS! Integer delat med integer hugger av alla decimaler!"); 
		System.out.println((double)i1 / (double)i2);
		System.out.println(d1 / d2); //OBS! farligt att dela två ints, 
		// för det kan bli en double och 
		// då hugger den av alla decimaler rakt av utan att runda av 

		i1++;
		System.out.println(i1);
		System.out.println(i1++ + "		OBS! den printar först och adderar sen!");
		System.out.println(i1);
		System.out.println(++i1);
		System.out.println(i1--);
		System.out.println(i1);
		System.out.println(--i1);
		
		
	}

}

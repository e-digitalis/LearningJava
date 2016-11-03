package week1Excercise;

public class Main {

	int numberI;
	double numberD;
	String aWord;
	float numberF;
	boolean b;

//	static int numberI;
//	static double numberD;
//	static String aWord;
//	static float numberF;
//	static boolean b;
	
	public static void main(String[] args) {
		
		int numberIMain = 0;
		double numberDMain = 0;
		String aWordMain = "0";
		float numberFMain = 0;
		boolean bMain = true;
		
		DefaultValues newInstanceOfObject = new DefaultValues();
		System.out.println(newInstanceOfObject.numberI);
		System.out.println(newInstanceOfObject.numberD);
		System.out.println(newInstanceOfObject.numberF);
		System.out.println(newInstanceOfObject.aWord);
		System.out.println(newInstanceOfObject.b);

		
//		DefaultValues newInstanceOfObject2 = new DefaultValues();
//		System.out.println(numberI); 	//cannot make a static reference to a non-static field number
//		System.out.println(numberD);	//cannot make a static reference to a non-static field number
//		System.out.println(numberF);	//cannot make a static reference to a non-static field number
//		System.out.println(aWord);		//cannot make a static reference to a non-static field number
//		System.out.println(b);  		//cannot make a static reference to a non-static field number
	
		Main mc = new Main();			//Solution: create an object of the class, and access the variables through the object
		System.out.println(mc.numberI); //cannot make a static reference to a non-static field number
		System.out.println(mc.numberD);	//cannot make a static reference to a non-static field number
		System.out.println(mc.numberF);	//cannot make a static reference to a non-static field number
		System.out.println(mc.aWord);	//cannot make a static reference to a non-static field number
		System.out.println(mc.b);  		//cannot make a static reference to a non-static field number

		
		//Solution: make variables static (then they belong to the class, not the object)
//		System.out.println(numberI); 	//cannot make a static reference to a non-static field number
//		System.out.println(numberD);	//cannot make a static reference to a non-static field number
//		System.out.println(numberF);	//cannot make a static reference to a non-static field number
//		System.out.println(aWord);		//cannot make a static reference to a non-static field number
//		System.out.println(b);  		//cannot make a static reference to a non-static field number

		//Solution: declare variables inside of class, but then they must also be initialized
		System.out.println(numberIMain); 	//cannot make a static reference to a non-static field number
		System.out.println(numberDMain);	//cannot make a static reference to a non-static field number
		System.out.println(numberFMain);	//cannot make a static reference to a non-static field number
		System.out.println(aWordMain);		//cannot make a static reference to a non-static field number
		System.out.println(bMain);  		//cannot make a static reference to a non-static field number

		
		
	}

}

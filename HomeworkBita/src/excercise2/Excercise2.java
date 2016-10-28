package excercise2;

public class Excercise2 {

	static byte b;
	static short s;
	static int i;
	static long l;
	static float f;
	static double d;
	static char c;
	static String st;
	static boolean bo;
	
	public static void main(String[] args) {
		

		System.out.println("I'm getting that the local variable may not have been initialized");
		System.out.println("Testing to declare one variable to see if problem is resolved");
		
		System.out.println("The solution to the problem was twofold, "
				+ "if no value has been assigned the program will not run"
				+ "First solution: define variables outside of main method"
				+ "The program will still not run - b/c variables cannot be "
				+ "accessed from outside if they are not static"
				+ "Second solution: Make all variables static"
				+ "NOW program can be run and default variables printed");
		
				
	System.out.println(""+ b + s +i+l+f+d+c+st+bo);
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(st);
		System.out.println(bo);


		
		
	}

}

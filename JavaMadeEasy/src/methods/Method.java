package methods;

public class Method {

	public static void main(String[] args) {
	
		int num = 5;
		double pi = 3.14;
		System.out.println("F�rsta �r: "+num);
		System.out.println("Andra �r: " + pi);
		
		otherMethod();
		System.out.println("Femte �r: " + "hejoh�!");
		
	}

	public static void otherMethod() {
		double num2 = 6.28;
		method2();
		System.out.println("Fj�rde �r: " + num2);
					
	}
	
	public static void method2() {
		System.out.println("Tredje �r: " + 3.14159);
		
	}
	
}

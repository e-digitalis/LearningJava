package methods;

public class Method {

	public static void main(String[] args) {
	
		int num = 5;
		double pi = 3.14;
		System.out.println("Första är: "+num);
		System.out.println("Andra är: " + pi);
		
		otherMethod();
		System.out.println("Femte är: " + "hejohå!");
		
	}

	public static void otherMethod() {
		double num2 = 6.28;
		method2();
		System.out.println("Fjärde är: " + num2);
					
	}
	
	public static void method2() {
		System.out.println("Tredje är: " + 3.14159);
		
	}
	
}

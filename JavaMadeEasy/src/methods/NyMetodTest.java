package methods;

public class NyMetodTest {

	
	
	public static void main(String[] args) {
		
		int num = 5;
		double pi = 3.14;
		System.out.println("Första är: "+num);
		System.out.println("Andra är: " + pi);
		otherMethod(num, pi); //kalla den andra metoden så den körs, ge den "rättighet" till variablerna
		System.out.println("Femte är: " + "hejohå!");
		
	}

	public static void otherMethod(int numCopy, double piCopy) { //"skapa" variablerna även här
		/*men det är inte samma variabel det är en kopia
		 av variabeln och kan därför ha ett annat namn*/
		double num2 = 6.28;
		method2();
		System.out.println("Fjärde är: " + num2 +" +2+Pi+2 är: "+ (2+piCopy+2)+" numCopy är: "+numCopy);
					
	}
	
	public static void method2() {
		System.out.println("Tredje är: " + 3.14159);
		
	}

}

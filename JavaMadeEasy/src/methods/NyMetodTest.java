package methods;

public class NyMetodTest {

	
	
	public static void main(String[] args) {
		
		int num = 5;
		double pi = 3.14;
		System.out.println("F�rsta �r: "+num);
		System.out.println("Andra �r: " + pi);
		otherMethod(num, pi); //kalla den andra metoden s� den k�rs, ge den "r�ttighet" till variablerna
		System.out.println("Femte �r: " + "hejoh�!");
		
	}

	public static void otherMethod(int numCopy, double piCopy) { //"skapa" variablerna �ven h�r
		/*men det �r inte samma variabel det �r en kopia
		 av variabeln och kan d�rf�r ha ett annat namn*/
		double num2 = 6.28;
		method2();
		System.out.println("Fj�rde �r: " + num2 +" +2+Pi+2 �r: "+ (2+piCopy+2)+" numCopy �r: "+numCopy);
					
	}
	
	public static void method2() {
		System.out.println("Tredje �r: " + 3.14159);
		
	}

}

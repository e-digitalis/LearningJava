package loops;

public class Switch {

	public static void main(String[] args) {

		int i = 7;

		switch (i) {
		case 6: System.out.println("The value was 6");	break;
		case 7: System.out.println("The value was 7");	break;
		default: System.out.println("Bluttobl�");
		}
		
		int dayNumber = 10;
		
		switch(dayNumber){
		case 0: System.out.println("m�ndag");break;
		case 1: System.out.println("tisdag");break;
		case 2: System.out.println("onsdag");break;
		case 3: System.out.println("torsdag");break;
		case 4: System.out.println("fredag");break;
		case 5: System.out.println("l�rdag");break;
		case 6: System.out.println("s�ndag");break;
		default:System.out.println("Something else");
		}
		

	}
}

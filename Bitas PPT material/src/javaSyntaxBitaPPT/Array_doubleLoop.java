package javaSyntaxBitaPPT;

public class Array_doubleLoop {

	public static void main(String[] args) {


		String[] a2 = { "Bardia", "Fathia", "32", "42", ""};

		for (int arrPri = 0; arrPri <= 4; arrPri++) { //denna printar alla p� samma rad s� d� beh�vs " " f�r att �ka l�sbarheten 

			System.out.print(" Printing array: " + a2[arrPri]); 
			System.out.println(a2[3]); //OBS!!!! DUBBEL kommando!!!
		}

	}

}

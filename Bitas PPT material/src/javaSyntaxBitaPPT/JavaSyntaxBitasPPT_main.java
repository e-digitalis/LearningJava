package javaSyntaxBitaPPT;

public class JavaSyntaxBitasPPT_main {

	public static void main(String[] args) {
		// testar att g�ra kommentartext i olika versioner
		/*
		 * testar om detta funkar Vad h�nder nu tex? vi testar vidare m�nga
		 * rader till�tna i denna typ av kommentar kommentaren ska vara mellan
		 * pluttarna
		 */

		String s1 = "true"; // ger inte samma resultat som
		Boolean s2 = true;
		String s3 = "1", s4 = "2", s5 = "3"; // test att deklarera flera
												// variabler p� samma rad
		String s6 = "1", s7 = "2", s8 = "3";
		
		System.out.println(s1 + " " + s2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3 + s4 + s5);
		
		// for(String s=1; s<11; s++){
        //    System.out.print(" Printing is: " + s);
        // }
		
		
		int i1 = 1, i4 = 2, i5 = i1++;
		int i2 = i1++;
		int i3 = i2++;
		
			
		System.out.println(i1);

		
		System.out.println();
		
		
	}

}
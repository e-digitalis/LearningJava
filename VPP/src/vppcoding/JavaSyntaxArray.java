package vppcoding;

public class JavaSyntaxArray {

	public static void main(String[] args) {
		
		// first set the array by using square brackets
		// then assign the values by using curly brackets
		
		int[] j = {1,2,3,4,125};
		int k[] = {1,2,3,4,5};
		// det g�r bra att s�tta square brackets �ven efter variabelnamnet, 
		// men det f�rsta s�ttet �r mer vanligt 

		// arrays in java are 0 based (based on zero)
		// det betyder att f�rsta inneh�llet i en array har platsen "0"
		
		System.out.println(j[0]);
		System.out.println(j[2]+ "  "+ j[0]);
		System.out.println("[I@2a139a55");
		System.out.println(j);
		System.out.println("n�r jag ber den att skriva ut array-variabeln \n"
				+ "som heter j s� skriver den bara ut adressen till var \n"
				+ "j befinner sig i minnet \n"
				+ "d�rf�r f�r jag samma v�rde tv� g�nger oavsett om jag \n"
				+ "�ndrar inneh�llet i j som fr�n b�rjan var identiskt");
		
		char[] myName = {'L','i','s','s','a'};
		System.out.println(myName);
	}

}

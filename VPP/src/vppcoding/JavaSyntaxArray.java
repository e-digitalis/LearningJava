package vppcoding;

public class JavaSyntaxArray {

	public static void main(String[] args) {
		
		// first set the array by using square brackets
		// then assign the values by using curly brackets
		
		int[] j = {1,2,3,4,125};
		int k[] = {1,2,3,4,5};
		// det går bra att sätta square brackets även efter variabelnamnet, 
		// men det första sättet är mer vanligt 

		// arrays in java are 0 based (based on zero)
		// det betyder att första innehållet i en array har platsen "0"
		
		System.out.println(j[0]);
		System.out.println(j[2]+ "  "+ j[0]);
		System.out.println("[I@2a139a55");
		System.out.println(j);
		System.out.println("när jag ber den att skriva ut array-variabeln \n"
				+ "som heter j så skriver den bara ut adressen till var \n"
				+ "j befinner sig i minnet \n"
				+ "därför får jag samma värde två gånger oavsett om jag \n"
				+ "ändrar innehållet i j som från början var identiskt");
		
		char[] myName = {'L','i','s','s','a'};
		System.out.println(myName);
	}

}

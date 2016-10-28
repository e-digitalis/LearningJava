package loops;

public class LoopsStrings {

	public static void main(String[] args) {

		String myName = "Lissalilu Li";
		System.out.println(myName.startsWith("Lissa"));
		System.out.println(myName.startsWith("Li"));
		System.out.println(myName.startsWith("L"));
		System.out.println(myName.startsWith("La"));
		System.out.println(myName.startsWith("Alli"));
		
		String myFirstName1 = myName.substring(0, 5);
		System.out.println(myFirstName1);
		
		int spacePosition = myName.indexOf(" ");
		String myFirstName = myName.substring(0, spacePosition).toUpperCase();
		System.out.println(myFirstName);

	}

}

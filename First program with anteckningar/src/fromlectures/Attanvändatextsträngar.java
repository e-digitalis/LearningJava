package fromlectures;

public class Attanvändatextsträngar {

	public static void main(String[] args) {

		String name = "Elissa";
		String welcome = "Hi ";
		System.out.println(welcome + "" + name + "!");
		System.out.println(name.toUpperCase());
		System.out.println(name.substring(0));
		System.out.println(name.substring(0, 1));
		System.out.println(welcome.length());
		System.out.println(welcome.startsWith("H"));
		System.out.println(welcome.startsWith("L"));

	}

}

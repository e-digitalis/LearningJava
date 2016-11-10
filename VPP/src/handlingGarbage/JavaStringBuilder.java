package handlingGarbage;

public class JavaStringBuilder {

	public static void main(String[] args) {

		String title = "fab";
		String firstName = "Liss";
		String lastName = "Lily";
		String initialFirstName = firstName.substring(0, 1)+".";
		
		/*String objects are immutable i.e. can't be changed after they are created
		 * This can produce a lot of garbage, which depending on the application can slow it down
		 * The JVM handles the orphaned objects automatically, and disposes of the garbage at a rate that cannot be impacted by the code
		 * Instead of using string methods, one can use the "String Builder"
		 */
		
		
		System.out.println(initialFirstName);
		
		StringBuilder sb = new StringBuilder(title);
		sb.append(" ");
		sb.append(initialFirstName);
		sb.append(" ");
		sb.append(lastName);
	
		System.out.println(sb);
		
		
		

	}

}

package structuringCode;

public class StructuringCode {

	public static void main(String[] args) {

		NameFunctions newPersonOne = new NameFunctions();
		NameFunctions newPersonTwo = new NameFunctions();
		
		newPersonOne.setName("Dimitra Glasso");
		newPersonTwo.setName("Marla Blacchio");
		
		System.out.println(newPersonOne.getFirstName());
		System.out.println(newPersonTwo.getFirstName());
		System.out.println(newPersonOne.getLastName());
		System.out.println(newPersonTwo.getLastName());
		
	//	newPersonOne.myName = "HH";		cannot be called directly b/c myName is private
		
	}
	
	
	
}

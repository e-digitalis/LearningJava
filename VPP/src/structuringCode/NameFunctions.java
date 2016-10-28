package structuringCode;

public class NameFunctions {

	private String myName;
	
	public String getFirstName() {
		int spacePosition = myName.indexOf(" ");
		return myName.substring(0, spacePosition);
	}

	public String getLastName() {
		int spacePosition = myName.indexOf(" ");
		return myName.substring(spacePosition+1);
	}
	
	
	public void setName(String newName){
		myName = newName;
		
	}
	
		

}

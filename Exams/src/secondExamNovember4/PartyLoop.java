package secondExamNovember4;

public class PartyLoop {

	public static void main(String[] args) {
	
		int people = 21;
		
		if(people < 10){
			//NB nothing will happen if exactly 10 people, not covered here and not covered in next conditional statement
			System.out.println("We are having a friendly gathering.");
		} else if (people > 10 && people <= 30){
			System.out.println("This is a party!");
		} else if (people > 31){
			//NB the case 31 is not covered
			System.out.println("WE ROCK!!!!");
		} else {
			//I added this to cover the cases that are not included
			System.out.println("Instances of variable people are not covered or not valid.");
		}
		
	}
	
}

package lesson3Functions;



public class RollDice {
	// random number between 0 and (almost) 1



	public static double  randomNumber = Math.random();

	public static double createRandomNumber(){
		randomNumber = (randomNumber * 6) + 1; 
		//making the range go from 1-6 instead of 0 to .9

		int randomInt = (int) randomNumber; 
		//casting as int to truncate decimals
		
		System.out.println(randomInt);
		
		return randomInt;
		
		

	}
}	


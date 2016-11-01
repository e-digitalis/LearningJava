package lesson1VariablesAndDataTypes;

public class MultipleVariables {

	public static void main(String[] args) {

		int stops;
		int fare;
		
		stops = 0; 				fare = 0;
		stops = stops +1; 		fare = fare +5;
		stops = stops +1; 		fare = fare +3;
		stops = stops +1; 		fare = fare +7;
		
		System.out.println("Stops = " + stops + " and the total numbers of fares paid = " + fare);
		System.out.println("The bus made " + fare + " $ after " + stops + " stops.");
		System.out.println("The bus made $" + fare + " after " + stops + " stops.");
		

	}

}

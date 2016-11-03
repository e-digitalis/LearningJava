package arrays;

public class CreateArray {

	public static void main(String[] args) {

		int[] arrayWithNumbers2 = {2,3,9,45};	//declared and initialized with assigned values
		System.out.println("array with initialized values from start: "+arrayWithNumbers2[3]);
		
		
		System.out.println();
		System.out.println("Array with default values");
		
		int[] arrayWithNumbers = new int[20];	//declared and initialiez with default
		
		
		System.out.println(arrayWithNumbers[18]);
		
		arrayWithNumbers[19] = 54;
		System.out.println(arrayWithNumbers[19]);
		
		arrayWithNumbers[19] = 78;
		System.out.println(arrayWithNumbers[19]);
		
		arrayWithNumbers[3] = 123;
		System.out.println(arrayWithNumbers[3]);
		
		System.out.println();
		System.out.println("String array with initialized values");
		
		String[] myStringArray = {"One string", "Another string"};
		System.out.println(myStringArray[0]);
		System.out.println(myStringArray[1]);
		
		System.out.println();
		System.out.println("String array with default values");
		
		String[] secondStringArray = new String[20];
		System.out.println(secondStringArray[0]);
		secondStringArray[0]="Inserted value so no longer null";
		System.out.println(secondStringArray[0]);
		
		secondStringArray[2]="Second position equals third value";
		System.out.println(secondStringArray[2]);
		
		
		

	}

}

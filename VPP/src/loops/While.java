package loops;

public class While {

	public static void main(String[] args) {

		int count= 0;
		while(count<5){
			System.out.println("Hello!");
			count++;
		}

		int[] myArray = {10,11,12,45,14,10,56,23,78,18,62};
		
		int numberUsed = 0;
		int total = 0;
		
		while (total<1250){
			total+=myArray[numberUsed];
			numberUsed++;
		}
		
		System.out.println();
		System.out.println("Total got to amount: "+total);
		System.out.println("We used this many numbers in array: "+numberUsed);

	/*
	 * Will my while loop run at least once?	
	 * Will my while loop finish or go on forever?
	 */
		

	}

}

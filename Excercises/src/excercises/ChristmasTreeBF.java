package excercises;

public class ChristmasTreeBF {

	public static void main(String[] args) {

		int totalNumberOfRows = 10;
		
		for (int currentRow = 0; currentRow < totalNumberOfRows; currentRow++) {
			for (int space = 0; space < totalNumberOfRows - currentRow; space++){
				System.out.print(" ");
			}
			
			for (int star = 0; star < (2 * currentRow + 1); star++){
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}


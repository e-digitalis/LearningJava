package loops;

public class IfElseIf {

	public static void main(String[] args) {

		System.out.println("Start!");
		
		int skipFirstBlockEntirely = 0;

		if (skipFirstBlockEntirely != 0) {

			int i = 8;

			if (i < 7) {
				System.out.println("It's low!");
			} else if (i > 7) {
				System.out.println("It's high!");
			} else {
				System.out.println("It's a match!");
			}

		}

		int doRunThisBlock = 5;

		if (doRunThisBlock > 0) {

			int y = 4;

			if (y == 4) {
				System.out.println("Match!");
				
			}else if (y > 4){
				System.out.println("Too big!");
				
			}else{
				System.out.println("It's less than four");
				
			}

		}
	
		System.out.println("End!");
	}
	

}

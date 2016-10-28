package loops;

public class Eternal_for_loop {

	public static void main(String[] args) {
		for (byte x = 0; x < 5; x--) {
			System.out.print("loop: " + x + " ");
		}

		for (byte x = 0; x < 5; x--) {
			System.out.println("loop: " + x);
		}

		for (byte x = 0; x < 5; x-=1) {
			System.out.println("loop: " + x);
		}

		
		

	}

}

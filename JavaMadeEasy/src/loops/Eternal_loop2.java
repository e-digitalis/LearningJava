package loops;

public class Eternal_loop2 {

	public static void main(String[] args) {
		
		
		
		for (int x = 0; x < 5; x--) {
			System.out.println("loop: " +x);
		}
		
		
		for (int x = 10; x == 10;) { // it will run "as long as the
			// condition is met" so FOREVER
		}
	}

}

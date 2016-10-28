package testarPlusPlus;

public class PlusTest {

	public static void main(String[] args) {
		int test = 1;
		System.out.println(test);
		test++;
		System.out.println(test);
		test++;
		System.out.println(test);
		test++;
		System.out.println(test);
		test--;
		System.out.println();
		System.out.println(test);
		test += 2;
		System.out.println(test);

		for (int x = 0; x < 5; x++) {
			System.out.println("loop: " + x);
		}

		System.out.println();

		for (int x = 0; x < 5; x = x + 2) {
			System.out.println("loop: " + x);
		}

		System.out.println();

		for (int x = 0; x < 5; x++) {
			System.out.println("Hello world! " + x);
		}

		System.out.println();

		for (int x = 1; x == 10; x++) {
			System.out.println(x);
		}

		System.out.println();

		for (int x = 10; x == 10; x++) { // it will run "as long as the
											// condition is met" so only once
			System.out.println(x);
		}

		System.out.println();

		for (int x = 3; x <= 5; x++) {
			System.out.println(x);
		}

		System.out.println();

		

	}
}

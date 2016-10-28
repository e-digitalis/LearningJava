package loops;

public class Forloops {

	public static void main(String[] args) {

		int m = 4;
		System.out.println("before ++: "+m);
		m++;
		System.out.println("after ++: "+m);
		
		int n = 9;
		System.out.println("before ++: "+n);
		++n;	//det spelar ingen roll om ++ är före eller efter 
				// pga att ++ endast påverkar det som är inom samma rad
		System.out.println("after ++: "+n);
		n--;
		System.out.println("after --: "+n);
		
		for (int x = 0; x < 5; x++) {
			System.out.println("loop: " +x);
		}
		
		
	}

}

package strings;

public class TernaryOperator {

	public static void main(String[] args) {

		int i = 7;
		int j;
		String js;
//
//		if (i == 7) {
//			j = 1;
//		} else {
//			j = 2;
//		}

		

		j = (i == 7) ? 1 : 2; // setting J to different values depending on if
								// the condition is true or false
								// "Is i equal to 7? If yes, give j the value 1,
								// if no, give j the value 2.
		
		js = (i==7)? "i is 7": "i is not 7";

		System.out.println("j has the value of: "+j);
		System.out.println(js);
		
	}
}

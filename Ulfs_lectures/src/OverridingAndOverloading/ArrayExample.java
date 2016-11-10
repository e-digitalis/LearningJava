package OverridingAndOverloading;

public class ArrayExample {

	public static void main(String[] args) {

		double[] novemberTemp;
		novemberTemp = new double[30]; // arrays are classlike but have no
										// methods
		// they are sort of like objects

//		System.out.println(novemberTemp[6]);
//		novemberTemp[6] = 4.5;		//indexing = "picking a value"
//		System.out.println(novemberTemp[6]);
//		
		//operations on array is getting the length with .length and also getting an item through indexing
		
		// arraylists are flexible, but cost in performance
		// arrays are inflexible but more streamlined
		
		int counter;
		for (counter = 0; counter < novemberTemp.length; counter++){ //this length refers to a field, it's not a method
			novemberTemp[counter] = 0.0;
		}
		
		System.out.println(novemberTemp[counter]);
		
		
		//enhanced for loop for arrays
		for (double d : novemberTemp){
			System.out.println(d);
			/// d = 0.0 DON'T DO THIS - REFERENCE OF VALUE TYPE, WILL ONLY AFFECT THE COPY NOT THE ACTUAL VALUE
		}
		
		//enhanced forloop in c# foreach (double d in novemberTemp){
		
		String[] strings = new String[3];
		
		for(String s : strings){
			System.out.println(s);
		}
		
		
		String[] strings2 = {"Lissa", "Olga", "Joyce", "Anna"};
				
		for(String s : strings2){
			System.out.println(s);
		}
		
		
		Object[] objects = {"Lissa", "Olga", "Joyce", "Anna"};
				
		for(Object o : objects){
			System.out.println(o);
		}
	}

}

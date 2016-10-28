package librarycase;

public class Main {

	public static void main(String[] args) {

		Book book1 = new Book(1, "introduction to Java", "MG", "123456");
		Book book2 = new Book(2, "better Java", "Maria Liszlo", "234567");
		
		UI ui = new UI();
		ui.printHeader();
		ui.printBook(book1);
		ui.printBook(book2);
					
		
		
		
		
//		Customer joanne = new Customer("doctor", "Joanne", "Lassiter", "Hejvägen", "89561245", "jo@g.com", 1,
//				GenderType.FEMALE);
//		Customer somin = new Customer("teacher", "Somin", "Raxi", "Hejvägen", "89561245", "jo@g.com", 2,
//				GenderType.OTHER);
//		Customer bardia = new Customer("java coach", "Bardia", "Fathi", "Hejvägen", "895623", "bardia@hejhe.com", 3,
//				GenderType.MALE);
//
//		// joanne.setName("doctor", "Joanne", "Lassiter");
//		// somin.setName("teacher", "Somin", "Raxi");
//
//		/*
//		 * The setname function only works if it's public Since we changed it to
//		 * private, it won't work any longer
//		 */
//
//		System.out.println(joanne.getfirstName());
//		System.out.println(somin.getfirstName());
//		System.out.println(bardia.getfirstName());
//
//		System.out.println(joanne.getMailingName());
//		System.out.println(somin.getMailingName());
//		System.out.println(bardia.getMailingName());
//		
//		System.out.println(somin.getGender());
//		System.out.println(joanne.getGender());
//		
//		if (somin.getGender() == GenderType.OTHER){
//			System.out.println("Defined as other.");
//		}
		
	}

}

package vPPLibrarycase;

public class Main {

	public static void main(String[] args) {

		//Book[] bookCatalog = new Book[10];
		BookCatalog bookCatalog = new BookCatalog();

		Book book1 = new Book(1, "introduction to Java", "MG", "123456", "Anytown", 400);
		Book book2 = new Book(2, "better Java", "Maria Liszlo", "234567", "Anytown", 150);

		DVD dvd1 = new DVD(4, "Epic Java reel!", "Some branch", "Alma Dirr", 456798, 120);
		Customer customer = new Customer("Dr.","Lissssie","La","Hejvägen","0812345678","liss@great.com",1,GenderType.OTHER);
		
		System.out.println(dvd1.getTitle());
		book1.relocate("Forest Branch");
		System.out.println(dvd1.lend(customer));
		dvd1.licence();
		if (dvd1.isLicenced()){
			System.out.println("Yes, it is licenced!");
		} else {
			System.out.println("Uhoh! Better check that licence!");
		}

		
//		bookCatalog[0] = book1;
//		bookCatalog[1] = book2;
		
		bookCatalog.addBook(book1);
		bookCatalog.addBook(book2);

		UI ui = new UI();
		ui.printHeader();

		ui.printBookCatalog(bookCatalog.getBookArray());
		
		Book foundBook = bookCatalog.findBook("Better Java");
		if (foundBook != null){
			System.out.println("We found " + foundBook.getTitle());
		}
		
			System.out.println(customer.getExpiryDate());
		
	}

	// ui.printBook(book1);
	// ui.printBook(book2);

	// Customer joanne = new Customer("doctor", "Joanne", "Lassiter",
	// "Hejvägen", "89561245", "jo@g.com", 1,
	// GenderType.FEMALE);
	// Customer somin = new Customer("teacher", "Somin", "Raxi", "Hejvägen",
	// "89561245", "jo@g.com", 2,
	// GenderType.OTHER);
	// Customer bardia = new Customer("java coach", "Bardia", "Fathi",
	// "Hejvägen", "895623", "bardia@hejhe.com", 3,
	// GenderType.MALE);
	//
	// // joanne.setName("doctor", "Joanne", "Lassiter");
	// // somin.setName("teacher", "Somin", "Raxi");
	//
	// /*
	// * The setname function only works if it's public Since we changed it
	// to
	// * private, it won't work any longer
	// */
	//
	// System.out.println(joanne.getfirstName());
	// System.out.println(somin.getfirstName());
	// System.out.println(bardia.getfirstName());
	//
	// System.out.println(joanne.getMailingName());
	// System.out.println(somin.getMailingName());
	// System.out.println(bardia.getMailingName());
	//
	// System.out.println(somin.getGender());
	// System.out.println(joanne.getGender());
	//
	// if (somin.getGender() == GenderType.OTHER){
	// System.out.println("Defined as other.");
	// }

}



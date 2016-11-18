package vPPLibrarycase;

import java.util.Scanner;

public class Main {

	public static Scanner myScan = new Scanner(System.in);

	public static void main(String[] args) {

		// Book[] bookCatalog = new Book[10];
		BookCatalog bookCatalog = new BookCatalog();

		// creating new book objects
		Book book1 = new Book(1, "introduction to Java", "MG", "123456", "Anytown", 400);
		Book book2 = new Book(2, "better Java", "Maria Liszlo", "234567", "Anytown", 150);

		// Creating new DVD objects
		DVD dvd1 = new DVD(4, "Epic Java reel!", "Some branch", "Alma Dirr", 456798, 120);
		Customer customer = new Customer("Dr.", "Lissssie", "La", "Hejvägen", "0812345678", "liss@great.com", 1,
				GenderType.OTHER);

		book1.relocate("Forest Branch");
		// sending material to other branch

		dvd1.license();
		// calling the licence method to set the variable licensed to true

		CheckingMethods.printMaterialTitle(dvd1);
		// to print the title of any material (book, DVD or other future
		// material implemented)
		// choose this method - send the adequate reference

		// checked if DVD is licensed and can be lent out
		System.out.println(dvd1.lend(customer));
		System.out.println(dvd1.lend(customer) + " trying to lend DVD - shouldn't work b/c already on loan \n");
		System.out.println(book1.lend(customer) + " trying to lend book - success");
		System.out.println(book1.lend(customer) + " trying to lend book - shouldn't work b/c already on loan");

		// bookCatalog[0] = book1;
		// bookCatalog[1] = book2;

		bookCatalog.addBook(book1);
		bookCatalog.addBook(book2);

		UI ui = new UI();
		ui.printHeader();

		System.out.println(customer.getExpiryDate());
		
		ui.printBookCatalog(bookCatalog.getBookArray());

	

	

		// Material material = new Material(10,"aaa","town"); //if not abstract,
		// Material objects can be created

		// checkLoanPeriod(book1, dvd1); to call this method I need to send the
		// variables (or declare them at class level)

		System.out.println(dvd1.getClass());
		// dvd1.lastIndexOf(dvd1.getClass());
		// BARDIA!!!

		myScan.close();

	}

	public static void checkLoanPeriod(Book bookAnyName, DVD dvdAnyName) {
		// code written to verify functionality
		System.out.println(bookAnyName.getLoanPeriod());
		// code that checks if return period is working as intended
		System.out.println(dvdAnyName.getLoanPeriod());
		// code that checks if return period is working as intended
	}

	public static void checkLicenceAndLoanStatus(Book bookAName, DVD dvdAName) {

	}

}

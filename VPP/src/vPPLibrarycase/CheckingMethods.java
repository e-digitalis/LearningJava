package vPPLibrarycase;

public class CheckingMethods {
	
	// Checking the title of the material
	public static void printMaterialTitle(Material material) {
		// printing DVD title
		System.out.println("The title of this " + material.getMaterialType() + " is: " + material.getTitle());
	}

	public void checkIfInOrOut(Material materialName, Customer customer) {
		System.out.println(materialName.lend(customer));
		/* For BOOKS this checks if the book already has a borrower or not
		 * For DVDs the method first checks if it is licensed.
		 * Licensed is boolean and unless initialized to true the default value is false
		 */
	}
	
//	public Book findBook(String title) throws BookNotFoundException {
//		//TODO: bookCatalog not working (after I moved the method here from main)
//	Book foundBook = bookCatalog.findBook("Better");
//	System.out.println("We found " + foundBook.getTitle());
//	throw new BookNotFoundException();
//	}
}

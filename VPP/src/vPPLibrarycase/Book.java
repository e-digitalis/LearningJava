package vPPLibrarycase;

public class Book extends Material {

	// each book needs title, authors, ID (barcode) & ISBN (International
	// standard book number)

	private String author;
	private String isbn;
	private int noOfPages;

	public Book(int bookID, String title, String author, String isbn, String branch, int noOfPages) {
		super(bookID, title, branch);
		this.author = author;
		this.isbn = isbn;
		this.noOfPages = noOfPages;

	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void sendForRepair(){
		System.out.println("Book has been sent to repair");
	}
	
}

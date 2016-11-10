package structuringCode;

import vPPLibrarycase.Book;



public class TestUsingAClassInAnotherPackage {

	public static void main(String[] args) {

		
		Book bookFromOtherPackage = new Book(8, "My Book", "me", "123456798", "Sometown", 321);
		System.out.println(bookFromOtherPackage.getID());
							
	}
}
	
//	do i need to have a domain name for github?
//			https://www.virtualpairprogrammers.com/video/player-192.html
//				see at 9:15 in the video
//}

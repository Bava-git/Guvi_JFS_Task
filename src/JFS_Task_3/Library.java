package JFS_Task_3;

public class Library {
	
	//The Library class should include an array to store book objects. 

	// Data member
	Book[] books;
	int bookCount;

	// Constructor
	public Library() {
		books = new Book[5];
		bookCount = 0;
	}

	// Method for add book
	public int addBook(Book book) {

		if (bookCount < books.length) {
			books[bookCount] = book;
			bookCount++;
		} else {
			System.out.println("Library is full");
		}

		return bookCount;
	}

	// Method to remove book
	public void removeBook(int bookID) {

		// Temporary array for remove book
	    Book[] newBooks = new Book[books.length];
	    int newIndex = 0;
	    boolean found = false;

	    // find the book
	    for (int i = 0; i < bookCount; i++) {
	        if (books[i] != null && books[i].getBookID() != bookID) {
	            newBooks[newIndex] = books[i];
	            newIndex++;
	        } else if (books[i] != null && books[i].getBookID() == bookID) {
	            found = true;
	        }
	    }

	    if (found) {
	        bookCount--;

	        // Copy newBooks array back to books
	        for (int i = 0; i < bookCount; i++) {
	            books[i] = newBooks[i];
	        }

	        // Clear the last reference in books array
	        books[bookCount] = null;

	        System.out.println("Book with ID " + bookID + " removed successfully.");
	    } else {
	        System.out.println("Book with ID " + bookID + " not found.");
	    }
	}


	// Method for replace data of an book
	public void replaceBook(int bookID, Book newBook) {

		for (Book book : books) {

			if (book.getBookID() == bookID) {
				books[bookID - 1] = newBook;
				System.out.println("Book with ID " + bookID + " replaced successfully.");
				return;
			}

		}

		System.out.println("Book with ID " + bookID + " not found.");
	}

	// Method for Search an book.
	public Book searchBook(int bookID) {

		for (Book book : books) {

			if (book.getBookID() == bookID) {
				return books[bookID - 1];
			}

		}
		return null;
	}

	// Display all the books
	public void displayBooks() {

        for (int i = 0; i < bookCount; i++) {

			if (books[i].getTitle() != null) {
				String availableBooks = "Book ID : " + books[i].getBookID() + " | " + "Title : " + books[i].getTitle() + " | "
						+ "Author : " + books[i].getAuthor() + " | " + "Available : " + books[i].isAvailable() + " | ";

				System.out.println();
				int charCount = availableBooks.length();

				System.out.println(availableBooks);
				for (int j = 1; j < charCount; j++) {
					System.out.print("-");
				}
			}

		}
	}

}

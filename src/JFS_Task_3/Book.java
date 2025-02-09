package JFS_Task_3;

public class Book {
	
	//The Book class should have attributes such as bookID, title, author, and isAvailable. 

	// Data members
	int bookID;
	String bookTitle, bookAuthor;
	int bookQuantity;
	String isAvailable;

	// Parameterize constructor
	Book(int bookID, String bookTitle, String bookAuthor, int bookQuantity) {
		this.bookID = bookID;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookQuantity = bookQuantity;

		if (bookQuantity > 0) {
			this.isAvailable = "Yes";
		} else {
			this.isAvailable = "No";
		}

	}

	// Getter
	public int getBookID() {
		return bookID;
	}

	public String getTitle() {
		return bookTitle;
	}

	public String getAuthor() {
		return bookAuthor;
	}

	public String isAvailable() {
		return isAvailable;
	}

}

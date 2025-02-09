package JFS_Task_3;

import java.util.Scanner;

public class LibraryMainSystem {
	
//	1.Design a Java program that uses OOP principles to model the Book. 
//	Create two classes: Book and Library. 
	
//	2.Provide methods to add books, remove book search books (using id)and display books. 
//	Write a Java program that demonstrates the use of these classes and methods 
//	by allowing the user to interact with the library system.
//	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Library library = new Library();
		int bookCount = 0;

		// Adding two books to the library
		Book book1 = new Book(1, "Effective Java", "Joshua Bloch", 10);
		Book book2 = new Book(2, "Java: The Complete Reference", "Herbert Schildt", 2);
		bookCount = library.addBook(book1);
		bookCount = library.addBook(book2);

		while (true) {
			System.out.println();
			System.out.println("Library Management System:");
			System.out.println("1. Add Book");
			System.out.println("2. Remove Book");
			System.out.println("3. Replace Book");
			System.out.println("4. Search Book");
			System.out.println("5. Display Books");
			System.out.println("6. Exit");
			System.out.print("How can i help you : ");
			int operation = scan.nextInt();

			switch (operation) {
			case 1: {

				// add new book details with new book id
				System.out.println();
				System.out.println("Please enter following book details");
				System.out.print("Enter Title: ");
				String bookTitle = scan.next();
				System.out.print("Enter Author: ");
				String bookAuthor = scan.next();
				System.out.print("Book Quantity : ");
				int bookQuantity = scan.nextInt();
				Book book = new Book(bookCount + 1, bookTitle, bookAuthor, bookQuantity);
				bookCount = library.addBook(book);

				if (bookCount != 5) {
					System.out.println("Book added successfully.");
				}

				break;

			}

			case 2: {
				// remove book details with book id
				System.out.println();
				System.out.print("Enter book ID to remove: ");
				int removeBookID = scan.nextInt();
				library.removeBook(removeBookID);
				break;
			}

			case 3: {
				// change book details in with same id
				System.out.println();
				System.out.print("Enter book ID to replace: ");
				int replaceBookID = scan.nextInt();
				System.out.print("Enter new title: ");
				String newTitle = scan.next();
				System.out.print("Enter new author: ");
				String newAuthor = scan.next();
				System.out.print("Book Quantity : ");
				int bookQuantity = scan.nextInt();
				Book newBook = new Book(replaceBookID, newTitle, newAuthor, bookQuantity);
				library.replaceBook(replaceBookID, newBook);
				break;
			}
			case 4: {
				// search book by book id
				System.out.println();
				System.out.print("Enter book ID to search: ");
				int searchBookID = scan.nextInt();

				Book searchedBook = library.searchBook(searchBookID);

				if (searchedBook != null) {
					System.out.println("Book found :");
					System.out.println("Book ID : " + searchedBook.getBookID());
					System.out.println("Title : " + searchedBook.getTitle());
					System.out.println("Author : " + searchedBook.getAuthor());
					System.out.println("Available : " + searchedBook.isAvailable());
					
				} else {
					System.out.println("Book not found.");
				}
				break;
			}
			case 5: {
				// display all books
				System.out.println();
				System.out.println("Available Books List :");
				library.displayBooks();
				break;
			}
			case 6: {
				// exit the program
				System.exit(0);
			}
			default:
				System.out.println();
				System.out.println("Invalid operation. Please choice from below.");
				System.out.println();
			}
		}
	}
}

import java.util.Scanner;

public class BookManager {
	Book book;
	
	Scanner input;
	
	BookManager(Scanner input){
		this.input = input;
	}
	
	public void addBook() {
		book = new Book();
		System.out.print("Book ID : ");
		book.id = input.nextInt();
		System.out.print("Book name : ");
		book.name = input.next();
		System.out.println(book.name); 
		System.out.print("Book Info1 : ");
		book.info1 = input.next();
		System.out.println(book.info1);
		System.out.print("Book Info2 : ");
		book.info2 = input.next();
		System.out.println(book.info2);
		
	}
	
	public void deleteBook() {
		System.out.print("Book ID : ");
		int bookId = input.nextInt();
		if (book == null) {
			System.out.println("the book has not been registered");
			return;
		}
		if (book.id == bookId) {
			book = null;
			System.out.println("the book is deleted");
		}
	}
	
	public void editBook() {
		System.out.print("Book ID : ");
		int bookId = input.nextInt();
		if (book.id == bookId) {
			book = null;
			System.out.println("the book to be edited is " + bookId);
		}
	}

	public void viewBook() {
		System.out.print("Book ID : ");
		int bookId = input.nextInt();
		if (book.id == bookId) {
			book.printInfo();
		}
	}

}

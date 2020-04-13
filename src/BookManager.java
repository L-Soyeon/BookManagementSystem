import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {
	ArrayList<Book> books =  new ArrayList<Book>();
	
	Scanner input;
	
	BookManager(Scanner input){
		this.input = input;
	}
	
	public void addBook() {
		Book book = new Book();
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
		books.add(book);
	}
	
	public void deleteBook() {
		System.out.print("Book ID : ");
		int bookId = input.nextInt();
		int index = -1;
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).id == bookId) {
				index = i;
				break;
			}
		}
		if(index >= 0) {
			books.remove(index);
			System.out.println("the book " + bookId + " is deleted");
	
		}
		else {
			System.out.println("the book has not been registered");
			return;
		}
		
	}
	
	public void editBook() {
		System.out.print("Book ID : ");
		int bookId = input.nextInt();
		for (int i = 0; i < books.size(); i++) {
			Book book  = books.get(i);
			if (book.id == bookId) {
				int num = -1;

				while(num != 5) {
					System.out.println("** Student Info Edit Menu **");
					System.out.println("1. Edit Id");
					System.out.println("2. Edit Name");
					System.out.println("3. Edit Info1");
					System.out.println("4. Edit Info2");
					System.out.println("5. Exit"); 
					System.out.println("Select one number between 1 - 5 : ");
					System.out.println("_______________________________________");
					num = input.nextInt();
					if( num == 1) {
						System.out.print("Book ID : ");
						book.id = input.nextInt();
					}
					else if( num == 2) {
						System.out.print("Book name : ");
						book.name = input.next();
					}
					else if( num == 3) {
						System.out.print("Book Info1 : ");
						book.info1 = input.next();
					}
					else if( num == 4) {
						System.out.print("Book Info2 : ");
						book.info2 = input.next();
					}
					else {
						continue;
					}
				}
				break;
			}
		}
	}

	public void viewBooks() {
//		System.out.print("Book ID : ");
//		int bookId = input.nextInt();
		for (int i = 0; i < books.size(); i++) {
			books.get(i).printInfo();
		}
	}

}

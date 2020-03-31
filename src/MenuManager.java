import java.util.Scanner;

public class MenuManager {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;

		while(num != 6) {
			System.out.println("*** Student Management System Menu ***");
			System.out.println("1. Add Book");
			System.out.println("2. Delete Book");
			System.out.println("3. Edit Book");
			System.out.println("4. View Book");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1 - 5 : ");
			System.out.println("_______________________________________");
			num = input.nextInt();
			if( num == 1) {
				addBook();
			}
			else if( num == 2) {
				deleteBook();
			}
			else if( num == 3) {
				editBook();
			}
			else if( num == 4) {
				viewBook();
			}
		}
	}
	
	public static void addBook() {
		Scanner input = new Scanner(System.in);
		System.out.print("Book ID : ");
		int bookId = input.nextInt();
		System.out.print("Book name : ");
		String bookName = input.next();
		System.out.println(bookName); 
		System.out.print("Book Info1 : ");
		String bookInfo1 = input.next();
		System.out.println(bookInfo1);
		System.out.print("Book Info2 : ");
		String bookInfo2 = input.next();
		System.out.println(bookInfo2);
		
	}
	
	public static void deleteBook() {
		Scanner input = new Scanner(System.in);
		System.out.print("Book ID : ");
		int bookId = input.nextInt();		
	}
	
	public static void editBook() {
		Scanner input = new Scanner(System.in);
		System.out.print("Book ID : ");
		int bookId = input.nextInt();		
	}

	public static void viewBook() {
		Scanner input = new Scanner(System.in);
		System.out.print("Book ID : ");
		int bookId = input.nextInt();		
	}
}
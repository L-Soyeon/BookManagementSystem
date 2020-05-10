import java.util.Scanner;

public class MenuManager {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		BookManager bookManager = new BookManager(input);

		int num = -1;

		while(num != 5) {
			showMenu();
			num = input.nextInt();
			
			switch(num) {
			case 1:
				bookManager.addBook();
				break;
			case 2:
				bookManager.deleteBook();
				break;
			case 3:
				bookManager.editBook();
				break;
			case 4:
				bookManager.viewBooks();
				break;
			default:
				continue;
			}
		}
	}
	
	public static void showMenu() {		//메뉴를 보여줌
		System.out.println("*** Student Management System Menu ***");
		System.out.println("1. Add Book");
		System.out.println("2. Delete Book");
		System.out.println("3. Edit Book");
		System.out.println("4. View Books");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1 - 5 : ");
		System.out.println("_______________________________________");
	}
}
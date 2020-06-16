package manager;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		BookManager bookManager = getObject("bookManager.ser");
		if (bookManager == null) {
			bookManager = new BookManager(input);
		}
		else {
			bookManager.setScanner(input);
		}
		
		WindowFrame frame = new WindowFrame(bookManager);
		selectMenu(input, bookManager);
		putObject(bookManager, "bookManager.ser");
		
	}
	
	public static void selectMenu(Scanner input, BookManager bookManager) {
		int num = -1;

		while(num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				
				switch(num) {
				case 1:
					bookManager.addBook();
					logger.log("add a book");
					break;
				case 2:
					bookManager.deleteBook();
					logger.log("delete a book");
					break;
				case 3:
					bookManager.editBook();
					logger.log("edit a book");
					break;
				case 4:
					bookManager.viewBooks();
					logger.log("view a list of book");//
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				System.out.println("_______________________________________");
				if(input.hasNext()) {	//
					input.next();
				}
				num = -1;
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
	
	public static BookManager getObject(String filename) {
		BookManager bookManager = null;
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			bookManager = (BookManager) in.readObject();
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return bookManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return bookManager;
	}
	
	public static void putObject(BookManager bookManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(bookManager);
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
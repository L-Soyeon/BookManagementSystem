package manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import book.Book;
import book.BookGenre;
import book.BookInput;
import book.FictionBook;
import book.NonfictionBook;
import book.Other_GenreBook;

public class BookManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8867333931238636841L;

	ArrayList<BookInput> books =  new ArrayList<BookInput>();	//books라는 ArrayList 생성
	
	transient Scanner input; ////
	BookManager(Scanner input){
		this.input = input;
	}
	
	public void setScanner(Scanner input) {
        this.input = input;
    }
	
	public void addBook() {		//book의 정보를 추가
		int genre = 0;
		BookInput bookInput;
		while(genre != 1 && genre != 2 && genre != 3) {	//
			try {
				System.out.println("1 for Fiction");
				System.out.println("2 for Nonfiction");
				System.out.println("3 for Other_Genre");
				System.out.println("Select num 1,2 or 3 for Book Genre : ");
				System.out.println("_______________________________________");
				genre = input.nextInt();
				if(genre == 1) {
					bookInput = new FictionBook(BookGenre.Fiction);	//객체 생성
					bookInput.getBookInput(input);
					books.add(bookInput);
					break;
				}
				else if(genre == 2) {
					bookInput = new NonfictionBook(BookGenre.Nonfiction);
					bookInput.getBookInput(input);
					books.add(bookInput);
					break;
				}
				else if(genre == 3) {
					bookInput = new Other_GenreBook(BookGenre.Other_Genre);
					bookInput.getBookInput(input);
					books.add(bookInput);
					break;
				}
				else {
					System.out.print("Select num 1,2 or 3 for Book Genre : ");
					System.out.println("_______________________________________");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3!");
				System.out.println("_______________________________________");
				if(input.hasNext()) {	//
					input.next();
				}
				genre = -1; 
			}
		}
	}
	
	public void deleteBook() {		//book의 정보를 삭제
		System.out.print("Book ID : ");
		int bookId = input.nextInt();
		int index = findIndex(bookId);
		removefromBooks(index, bookId);
	}
	
	public int findIndex(int bookId) {
		int index = -1;
		for (int i = 0; i < books.size(); i++) {	//index 값을 초기화
			if (books.get(i).getId() == bookId) {
				index = i;
				break;		//for문을 빠져나감
			}
		}
		return index;	
	}
	
	public int removefromBooks(int index, int bookId) {
		if(index >= 0) {
			books.remove(index);	//books의 index번째를 삭제
			System.out.println("the book " + bookId + " is deleted");
			System.out.println("_______________________________________");
			return 1;
		}
		else {	//다른 경우라면 등록되지 않았다는 메시지를 출력
			System.out.println("the book has not been registered");
			System.out.println("_______________________________________");
			return -1;
		}
	}
	
	public void editBook() {	//book의 정보를 수정
		System.out.print("Book ID : ");
		int bookId = input.nextInt();
		for (int i = 0; i < books.size(); i++) {
			BookInput book  = books.get(i);	//객체 생성
			if (book.getId() == bookId) {
				int num = -1;

				while(num != 5) {
					showEditMenu();
					
					num = input.nextInt();
					switch(num) {
					case 1:
						book.setBookID(input);
						break;
					case 2:
						book.setBookName(input);
						break;
					case 3:
						book.setBookCode(input);
						break;
					case 4:
						book.setBookInfo(input);
						break;
					default:
						continue;
					}
				}
				break;
			}
		}
	}

	public void viewBooks() {	//ID를 입력 받을 시 book의 정보를 보여줌
		System.out.println("# of registered books: " + books.size()); 
		System.out.println("_______________________________________");
		for (int i = 0; i < books.size(); i++) {
			books.get(i).printInfo();
		}
		System.out.println("_______________________________________");
	}
	
	public int size() {
		return books.size();
	}
	
	public BookInput get(int index) {
		return (Book) books.get(index);
	}
	
	public void showEditMenu() {
		System.out.println("** Student Info Edit Menu **");
		System.out.println("1. Edit Id");
		System.out.println("2. Edit Name");
		System.out.println("3. Edit Code");
		System.out.println("4. Edit Info");
		System.out.println("5. Exit"); 
		System.out.println("Select one number between 1 - 5 : ");
		System.out.println("_______________________________________");
	}
}

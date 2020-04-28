import java.util.ArrayList;
import java.util.Scanner;

import book.Book;
import book.BookGenre;
import book.FictionBook;
import book.Other_GenreBook;

public class BookManager {
	ArrayList<Book> books =  new ArrayList<Book>();	//books라는 ArrayList 생성
	
	Scanner input; ////
	BookManager(Scanner input){
		this.input = input;
	}
	
	public void addBook() {		//book의 정보를 추가
		int genre = 0;
		Book book;
		while(genre != 1 && genre != 2) {
			System.out.println("1 for Fiction");
			System.out.println("2 for Nonfiction");
			System.out.println("3 for Other_Genre");
			System.out.println("Select num 1,2 or 3 for Book Genre : ");
			genre = input.nextInt();
			if(genre == 1) {
				book = new FictionBook(BookGenre.Fiction);	//객체 생성
				book.getBookInput(input);
				books.add(book);
				break;
			}
			else if(genre == 2) {
				book = new Book(BookGenre.Nonfiction);
				book.getBookInput(input);
				books.add(book);
				break;
			}
			else if(genre == 3) {
				book = new Other_GenreBook(BookGenre.Other_Genre);
				book.getBookInput(input);
				books.add(book);
				break;
			}
		
			else {
				System.out.print("Select num 1,2 or 3 for Book Genre : ");
			}
		}
		
	}
	
	public void deleteBook() {		//book의 정보를 삭제
		System.out.print("Book ID : ");
		int bookId = input.nextInt();
		int index = -1;
		for (int i = 0; i < books.size(); i++) {	//index 값을 초기화
			if (books.get(i).getId() == bookId) {
				index = i;
				break;		//for문을 빠져나감
			}
		}
		if(index >= 0) {
			books.remove(index);	//books의 index번째를 삭제
			System.out.println("the book " + bookId + " is deleted");
	
		}
		else {	//다른 경우라면 등록되지 않았다는 메시지를 출력
			System.out.println("the book has not been registered");
			return;
		}
		
	}
	
	public void editBook() {	//book의 정보를 수정
		System.out.print("Book ID : ");
		int bookId = input.nextInt();
		for (int i = 0; i < books.size(); i++) {
			Book book  = books.get(i);	//객체 생성
			if (book.getId() == bookId) {
				int num = -1;

				while(num != 5) {
					System.out.println("** Student Info Edit Menu **");
					System.out.println("1. Edit Id");
					System.out.println("2. Edit Name");
					System.out.println("3. Edit Code");
					System.out.println("4. Edit Info");
					System.out.println("5. Exit"); 
					System.out.println("Select one number between 1 - 5 : ");
					System.out.println("_______________________________________");
					num = input.nextInt();
					if( num == 1) {
						System.out.print("Book ID : ");
						int id = input.nextInt();
						book.setId(id);
					}
					else if( num == 2) {
						System.out.print("Book name : ");
						String name = input.next();
						book.setName(name);
					}
					else if( num == 3) {
						System.out.print("Book Code : ");
						String code = input.next();
						book.setCode(code);
					}
					else if( num == 4) {
						System.out.print("Book Info : ");
						String info = input.next();
						book.setInfo(info);
					}
					else {
						continue;
					}
				}
				break;
			}
		}
	}

	public void viewBooks() {	//ID를 입력 받을 시 book의 정보를 보여줌
//		System.out.print("Book ID : ");
//		int bookId = input.nextInt();
		System.out.println("# of registered books: " + books.size()); 
		for (int i = 0; i < books.size(); i++) {
			books.get(i).printInfo();
		}
	}

}

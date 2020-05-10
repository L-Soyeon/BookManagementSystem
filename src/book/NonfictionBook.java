package book;

import java.util.Scanner;

public class NonfictionBook extends Book {
	
	public NonfictionBook(BookGenre genre) {		// ������
		super(genre);
	}
	
	public void getBookInput(Scanner input) {
		setBookID(input);
		setBookName(input);
		setBookCode(input);
		setBookInfo(input);
	}
	
	public void printInfo() {	//book�� ������ ������
		String bgenre = getGenreString();
		System.out.println("genre: " + bgenre + " name: " + name + " id: " + id + " code: " + code + " info: " + info );
	}
}

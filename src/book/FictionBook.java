package book;

import java.util.Scanner;

public class FictionBook extends HCodeBook {
	
	public FictionBook(BookGenre genre) {		// »ý¼ºÀÚ
		super(genre);
	}
	
	public void getBookInput(Scanner input) {
		setBookID(input);
		setBookName(input);
		setBookCodewithYN(input);
		setBookInfo(input);
	}	
}

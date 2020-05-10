package book;

import java.util.Scanner;

public class Other_GenreBook extends HCodeBook {
	
	protected String section;
	
	public Other_GenreBook(BookGenre genre) {		// ����ü ����
		super(genre);
	}
	
	public void getBookInput(Scanner input) {
		setBookID(input);
		setBookName(input); 
		setBookCodewithYN(input);
		setBookSectionwithYN(input);
		setBookInfo(input);
	}
	
	public void setBookSectionwithYN(Scanner input) {
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.print("This book have a section? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.println("Section : ");
				this.section  =input.next();
//				this.setSection(section);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
//				this.setSection("");
				break;
			}
			else {	
			}
		}
	}
		
	public void printInfo() {	//book�� ������ ������
		String bgenre = getGenreString();
		System.out.println("genre : " + bgenre + " name: " + name + " id: " + id + " code: " + code + " info: " + info + " section: " + section );
	}
}

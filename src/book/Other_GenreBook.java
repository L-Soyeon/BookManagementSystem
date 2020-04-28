package book;

import java.util.Scanner;

public class Other_GenreBook extends Book {
	
	protected String section;
	
	public Other_GenreBook(BookGenre genre) {		// 구조체 생성
		super(genre);
	}
	
	public void getBookInput(Scanner input) {
		System.out.print("Book ID : ");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("Book name : ");
		String name = input.next();
		this.setName(name);
		
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.print("This book have a code? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.println("Code : ");
				String code =input.next();
				this.setCode(code);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				this.setCode("");
				break;
			}
			else {	
			}
		}
		
		answer = 'x';
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
		
		System.out.print("Book Info : ");
		String info = input.next();
		this.setInfo(info);
	}
	
	public void printInfo() {	//book의 정보를 보여줌
		String bgenre = "none";
		switch(this.genre) {
		case Fiction:
			bgenre = "Fic.";
			break;
		case Nonfiction:
			bgenre = "Nonfic.";
			break;
		case Other_Genre:
			bgenre = "Other.";
			break;
		default:		
		}
		System.out.println("genre : " + bgenre + " name: " + name + " id: " + id + " code: " + code + " info: " + info + " section: " + section );
	}

}

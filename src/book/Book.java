package book;

import java.util.Scanner;

import exception.CodeFormatException;

public abstract class Book implements BookInput { //Book이라는 객체를 생성하지 않음
	protected BookGenre genre = BookGenre.Fiction;
	protected String name;
	protected int id;
	protected String code;
	protected String info;
//	protected String section;	//상속
	
	public Book() {		// 생성자 생성
		
	}
	
	public Book(BookGenre genre) {		// 생성자 생성
		this.genre = genre;
	}
	
	public Book(String name, int id, String code, String info) {	//name, id, info1, info2를 매개 변수로 받는 생성자 생성
		this.name = name;
		this.id = id;
		this.code = code;
		this.info = info;
	}
	
	public Book(BookGenre genre, String name, int id, String code, String info) {	//name, id, info1, info2를 매개 변수로 받는 생성자 생성
		this.genre = genre;
		this.name = name;
		this.id = id;
		this.code = code;
		this.info = info;
	}
	
//	public Book(BookGenre genre, String name, int id, String code, String info, String section) {	//name, id, info1, info2를 매개 변수로 받는 생성자 생성
//		this.genre = genre;
//		this.name = name;
//		this.id = id;
//		this.code = code;
//		this.info = info;
//		this.section = section;
//	}
	
	public Book(String name, int id) {	//name, id를 매개 변수로 받는 생성자 생성
		this.name = name;
		this.id = id;
	}
	
	public BookGenre getGenre() {
		return genre;
	}

	public void setGenre(BookGenre genre) {
		this.genre = genre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) throws CodeFormatException {
		if(!(code.length() == 3) && !code.equals("")) {
			throw new CodeFormatException();
		}
		
		this.code = code;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
//	public String getSection() {
//		return section;
//	}
//
//	public void setSection(String section) {
//		this.section = section;
//	}
	
	public abstract void printInfo();	//book의 정보를 보여줌
	
	public void setBookID(Scanner input) {
		System.out.print("Book ID : ");
		int id = input.nextInt();
		this.setId(id);
	}
	
	public void setBookName(Scanner input) {
		System.out.print("Book name : ");
		String name = input.next();
		this.setName(name);
	}
	
	public void setBookCode(Scanner input) {
		String code = "";
		while(!(code.length() == 3)) {
			System.out.print("Book Code(3) : ");
			code = input.next();
			try {
				this.setCode(code);
			} catch (CodeFormatException e) {
				System.out.println("Incorrect Code Format. put the correct format book code");
				System.out.println("_______________________________________");
//				e.printStackTrace();
			}
		}
	}
	
	public void setBookInfo(Scanner input) {
		System.out.print("Book Info : ");
		String info = input.next();
		this.setInfo(info);
	}
	
	public String getGenreString() {
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
		return bgenre;
	}
}	

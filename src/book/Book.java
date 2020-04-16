package book;

import java.util.Scanner;

public class Book {
	protected BookGenre genre = BookGenre.Fiction;
	protected String name;
	protected int id;
	protected String code;
	protected String info; //���
	
	public Book() {		// ����ü ����
		
	}
	
	public Book(String name, int id, String code, String info) {	//name, id, info1, info2�� �Ű� ������ �޴� ����ü ����
		this.name = name;
		this.id = id;
		this.code = code;
		this.info = info;
	}
	
	public Book(String name, int id) {	//name, id�� �Ű� ������ �޴� ����ü ����
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

	public void setCode(String code) {
		this.code = code;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	
	public void printInfo() {	//book�� ������ ������
		System.out.println("name: " + name + " id: " + id + " code: " + code + " info: " + info );
	}
	
	public void getBookInput(Scanner input) {
		System.out.print("Book ID : ");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("Book name : ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Book Code : ");
		String code = input.next();
		this.setCode(code);
		
		System.out.print("Book Info : ");
		String info = input.next();
		this.setInfo(info);
	}
}	

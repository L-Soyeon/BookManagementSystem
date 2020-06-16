package book;

import java.util.Scanner;

import exception.CodeFormatException;

public interface BookInput {
	
	public int getId();
	
	public void setId(int id);
	
	public String getName();
	
	public void setName(String name);
	
	public String getCode();
	
	public void setCode(String code) throws CodeFormatException;
	
	public String getInfo();
	
	public void setInfo(String info);
	
	public void getBookInput(Scanner input);

	public void printInfo();
	
	public void setBookID(Scanner input) ;
	
	public void setBookName(Scanner input) ;
	
	public void setBookCode(Scanner input) ;
	
	public void setBookInfo(Scanner input) ;	
}

package book;

import java.util.Scanner;

public interface BookInput {
	
	public int getId();
	
	public void setId(int id);
	
	public void setName(String name);
	
	public void setCode(String code);
	
	public void setInfo(String info);
	
	public void getBookInput(Scanner input);

	public void printInfo();
	
	public void setBookID(Scanner input) ;
	
	public void setBookName(Scanner input) ;
	
	public void setBookCode(Scanner input) ;
	
	public void setBookInfo(Scanner input) ;
	
}

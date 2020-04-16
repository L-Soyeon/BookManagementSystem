package book;

import java.util.Scanner;

public class FictionBook extends Book {
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
		
		System.out.print("Book Info : ");
		String info = input.next();
		this.setInfo(info);
	}
}

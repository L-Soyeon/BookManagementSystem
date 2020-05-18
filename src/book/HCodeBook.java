package book;

import java.util.Scanner;

import exception.CodeFormatException;

public abstract class HCodeBook extends Book {
	
	public HCodeBook(BookGenre genre) {		// 생성자
		super(genre);
	}

	@Override
	public abstract void getBookInput(Scanner input) ;

	@Override
	public void printInfo() {	//book의 정보를 보여줌
		String bgenre = getGenreString();
		System.out.println("genre: " + bgenre + " name: " + name + " id: " + id + " code: " + code + " info: " + info );
	}
	
	public void setBookCodewithYN(Scanner input) {	//조건에 따른 정보입력
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.print("This book have a code? (Y/N)");
			answer = input.next().charAt(0);
			try {
				if(answer == 'y' || answer == 'Y') {
					setBookCode(input);
					break;
				}
				else if(answer == 'n' || answer == 'N') {
					this.setCode("");
					break;
				}
				else {	
				}
			}
			catch(CodeFormatException e) {
				System.out.println("Incorrect Code Format. put the correct format book code");
			}
		}	
	}
}

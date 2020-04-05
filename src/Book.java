
public class Book { 
	String name;
	int id;
	String info1;
	String info2;
	
	public Book() {
		
	}
	
	public Book(String name, int id, String info1, String info2) {
		this.name = name;
		this.id = id;
		this.info1 = info1;
		this.info2 = info2;
	}
	
	public Book(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public void printInfo() {
		System.out.println("name: " + name + "id: " + id + "info1: " + info1 + "info2: " + info2 );
	}
}	

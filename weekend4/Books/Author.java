package ba.bitcamp.edvin.weekend4.Books;

public class Author {
	String name;
	Integer year;
	Book[] books;
	
	public Author(String name, Integer year, Book[] books) {
		super();
		this.name = name;
		this.year = year;
		this.books = books;
	}
	
	public String toString(){
		String s= "";
		
		s += "Author name: " + name + "\n";
		s += "Year of birth: " + year + "\n";
		
		for (int i = 0; i < books.length; i++) {
			s += "\n" + books[i] + "\n";
			
		}
		return s;
	}
	public Author(){
		
	}

}

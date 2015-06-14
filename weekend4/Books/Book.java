package ba.bitcamp.edvin.weekend4.Books;

public class Book {
	
	String name;
	Integer year;
	String genre;
	Boolean isBestseller;
	
	public Book(String name, Integer year, String genre, Boolean isBestseller) {
		super();
		this.name = name;
		this.year = year;
		this.genre = genre;
		this.isBestseller = isBestseller;
	}
	
	public String toString(){
		String s = "";
		
		s += "Name of the book: " + name + "\n";
		s += "Published: " + year + "\n";
		s += "Genre: " + genre + "\n";
		s += "This book is bestseller: " + isBestseller + "\n";
		
		return s;
	}
	public Book (){
		
	}
}

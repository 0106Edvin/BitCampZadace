package ba.bitcamp.edvin.zadaca01;

import java.util.Arrays;

public class BookStore {
	/**
	 * Creating constants
	 */
	public static final int MAX_BOOK_CAPACITY = 3;
	public static final int MIN_BOOK_CAPACITY = 0;

	private String bookStoreName;
	private Book[] books;

	public BookStore() {
	}

	public String getBookStoreName() {
		return bookStoreName;
	}

	public void setBookStoreName(String bookStoreName) {
		this.bookStoreName = bookStoreName;
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	/**
	 * Allows user to sell books When book is sold, the capacity decreases If
	 * user try to sell more books than capacity, nothing will happen
	 * 
	 * @param num
	 * @return
	 */

	public int sellBook(Book b, int num) {
		for (int i = 0; i < books.length; i++) {

			if (books[i].getStock() - num > MIN_BOOK_CAPACITY
					|| books[i].getStock() - num == MIN_BOOK_CAPACITY) {
				books[i].setStock(books[i].getStock() - num);
				return books[i].getStock();
			} else if (books[i].getStock() - num < 0) {
			}
			return books[i].getStock();
		}
		return 0;
	}

	/**
	 * Allows user to buy books User can buy only up to 3 books, because that is
	 * capacity
	 */

	public int buyBook(Book b, int num) {
		for (int i = 0; i < books.length; i++) {

			if (books[i].getStock() + num > MAX_BOOK_CAPACITY) {
				return MAX_BOOK_CAPACITY;
			} else
				books[i].setStock(books[i].getStock() + num);

			return books[i].getStock();
		}
		return 0;
	}

	public String getBooksByAuthor(String nameOfAuthor) {
		String s = " ";
		for (int i = 0; i < books.length; i++) {
			if (books[i].getName().equals(nameOfAuthor)) {
				s += books[i].getBookName() + "\n";
			}
		}
		return s;
	}

	public String toString() {
		String s = " ";
		s += "Name of Book Store: " + bookStoreName + "\n";
		s += Arrays.toString(books);
		return s;
	}

}

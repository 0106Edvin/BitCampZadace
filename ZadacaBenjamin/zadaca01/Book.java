package ba.bitcamp.edvin.zadaca01;

public class Book extends Author {
	public static final int MAX_BOOK_CAPACITY = 3;
	public static final int MIN_BOOK_CAPACITY = 0;

	/**
	 * Properties of book
	 */
	private String bookName;
	private int price;
	private int stock;

	/**
	 * Creating constructor with information of author from class Author
	 * 
	 * @param authorName
	 * @param mail
	 * @param isMale
	 * @param bookName
	 *            Name of book
	 * @param price
	 *            Book price
	 * @param stock
	 *            How many books are in stock
	 */
	public Book(String authorName, String mail, boolean isMale,
			String bookName, int price, int stock) {
		super(authorName, mail, isMale);
		this.bookName = bookName;
		this.price = price;
		this.stock = stock;
	}

	/**
	 * Returns book name
	 * 
	 * @return
	 */
	public String getBookName() {
		return bookName;
	}

	/**
	 * Gives user opportunity to set Book name
	 * 
	 * @param bookName
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	/**
	 * Returns book price
	 * 
	 * @return
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * Gives user opportunity to set price of a book
	 * 
	 * @param price
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * Returns how many books are in stock (max 3)
	 * 
	 * @return
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * Gives user opportunity to set how many books are in stock, but if he
	 * enters more books than the capacity is, then capacity is set to maximum
	 * 
	 * @param stock
	 */
	public void setStock(int stock) {
		if (stock < MAX_BOOK_CAPACITY) {
			this.stock = stock;
		} else
			this.stock = MAX_BOOK_CAPACITY;
	}
	

	/**
	 * Printing information about book
	 */
	public String toString() {
		String s = super.toString() + "\n";
		s += "Book name : " + bookName + "\n";
		s += "Book price: " + price + "\n";
		s += "Stock: " + stock + "\n";

		return s;
	}
}

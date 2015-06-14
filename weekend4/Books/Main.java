package ba.bitcamp.edvin.weekend4.Books;

public class Main {

	public static void main(String[] args) {

		/**
		 * Creating books
		 */

		Book b1 = new Book("The Da Vinci Code", 2003, "Mystery", true);
		Book b2 = new Book("Angels and Demons", 2000, "Novel", true);
		Book b3 = new Book("Anna Karenina", 1877, "Novel", true);
		Book b4 = new Book("The Alchemist", 1988, "Fiction", true);
		Book b5 = new Book("Veronica decides to die", 1998, "Drama", true);
		Book b6 = new Book("Eleven Minutes", 2003, "Fiction", true);
		Book b7 = new Book("Inferno", 2013, "Mystery", false);

		/**
		 * Creating authors
		 */

		Author a1 = new Author();
		a1.name = "Paulo Coelho";
		a1.year = 1947;
		a1.books = new Book[3];
		a1.books[0] = b4;
		a1.books[1] = b5;
		a1.books[2] = b6;

		Author a2 = new Author();
		a2.name = "Dan Brown";
		a2.year = 1964;
		a2.books = new Book[3];
		a2.books[0] = b1;
		a2.books[1] = b2;
		a2.books[2] = b7;

		Author a3 = new Author();
		a2.name = "Leo Tolstoy";
		a2.year = 1828;
		a3.books = new Book[1];
		a3.books[0] = b3;

		/**
		 * Creating an array of authors
		 */
		Author[] arr = new Author[3];
		arr[0] = a1;
		arr[1] = a2;
		arr[2] = a3;

		System.out.println("The number of bestsellers is: "
				+ countBestsellingBooks(a2));
		System.out.println();

		System.out
				.println("The number of written books by this author, between these two yeaars is: "
						+ getNumberOfWrittenBooks(a2, 2003, 2015));
		System.out.println();

		System.out.println("The author with the most bestsellers is: \n"
				+ getAuthorWithMostBestsellers(arr));
	}

	/**
	 * Counts number of bestsellers of specific author
	 * 
	 * @param a
	 *            specific author entered by user
	 * @return result
	 */

	public static Integer countBestsellingBooks(Author a) {

		Integer counter = 0;
		for (int i = 0; i < a.books.length; i++) {
			if (a.books[i].isBestseller == true) {
				counter++;
			}
		}
		return counter;
	}

	/**
	 * Returns a number of written books by specific author between two years
	 * 
	 * @param a
	 *            author
	 * @param year1
	 *            First year entered by user
	 * @param year2
	 *            Second year entered by user
	 * @return result
	 */

	public static Integer getNumberOfWrittenBooks(Author a, Integer year1,
			Integer year2) {

		Integer counter = 0;
		for (int i = 0; i < a.books.length; i++) {
			if (a.books[i].year >= year1 && a.books[i].year <= year2) {
				counter++;
			}
		}
		return counter;

	}

	public static Author getAuthorWithMostBestsellers(Author[] authors) {

		Integer counter1 = 0;
		Integer counter2 = 0;
		Integer counter3 = 0;
		for (int i = 0; i < authors.length;) {
			if (authors[0].books[i].isBestseller = true) {
				counter1++;

			} else if (authors[1].books[i].isBestseller = true) {
				counter2++;

			} else if (authors[2].books[i].isBestseller = true) {
				counter3++;
			}
			if (counter1 > counter2 && counter2 > counter3) {
			}
			return authors[0];
		}
		if (counter2 > counter1 && counter2 > counter3) {

			return authors[1];

		} else {
			return authors[2];
		}
	}
}

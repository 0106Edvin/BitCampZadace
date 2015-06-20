package ba.bitcamp.edvin.zadaca01;

import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {

		Book b1 = new Book("Edvin Mulabdic", "edvin.mulabdic@bitcmap.ba", true,
				"Bit Camp", 55, 3);
		Book b2 = new Book("Edvin Mulabdic", "edvin.mulabdic@bitcmap.ba", true,
				"Bit Camp2", 66, 2);
		Book b3 = new Book("Edvin Mulabdic", "edvin.mulabdic@bitcmap.ba", true,
				"Bit Camp3", 77, 1);

		System.out.println(b1);

		Book[] array = new Book[3];
		array[0] = b1;
		array[1] = b2;
		array[2] = b3;
		System.out.println(Arrays.toString(array));

		BookStore bs = new BookStore();
		bs.setBookStoreName("IUS");
		bs.setBooks(array);
		bs.sellBook(b2, 2);
		bs.buyBook(b3, 2);

		System.out.println(bs);

	}
}

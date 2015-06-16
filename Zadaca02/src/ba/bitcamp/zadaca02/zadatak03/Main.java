package ba.bitcamp.zadaca02.zadatak03;

import org.w3c.dom.css.Counter;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * Creates new printers
		 */

		Printer p1 = new Printer("Printer 1");
		Printer p2 = new Printer();

		/**
		 * Adds 10 papers, 10 ink and print status
		 * 
		 */
		p2.addPaper(30);
		p2.addInk(9);
		System.out.println(p2);
		p2.printPages(3);
		System.out.println(p2);
		

		System.out.println();

		p1.addPaper(50);
		p1.addInk(18);
		System.out.println(p1);
		p1.printPages(3);
		System.out.println(p1);
		/**
		 * Prints sum of all pages printer ever printed
		 */
		System.out.println("Sum of all pages printer ever printed: " + Printer.getCounter());
	}

}

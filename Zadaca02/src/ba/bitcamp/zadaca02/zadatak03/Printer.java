package ba.bitcamp.zadaca02.zadatak03;

public class Printer {

	private static int counter = 0;

	private String name;
	private int amountOfpaper;
	private int amountOfInk;
	private int sumPrintedPages;
	private String status;

	/**
	 * Creating constructors
	 * 
	 * @param name
	 *            name of the printer
	 */
	public Printer(String name) {
		this();
		this.name = name;
	}

	/**
	 * Creating constructors
	 */
	public Printer() {
		this.name = "Default Printer";
		this.amountOfInk = 0;
		this.sumPrintedPages = 0;
		this.amountOfpaper = 0;

	}

	/**
	 * Returns amount of ink
	 * 
	 * @return true if there is any ink false if there is no ink
	 */

	public boolean ink() {
		if (amountOfInk > 0) {
			return true;
		}
		return false;
	}

	/**
	 * Returns amount of paper
	 * 
	 * @return true if there is any paper false id there is no paper
	 */
	public boolean paper() {
		if (amountOfpaper > 0) {
			return true;
		}
		return false;
	}

	/**
	 * Returns sum of printed pages
	 * 
	 * @return number of printed pages
	 */

	public int printedPages() {
		return sumPrintedPages;
	}

	/**
	 * Adds paper to printer If there is more than 100 papers, that means that
	 * capacity is full, and can't add more papers
	 * 
	 * @param num number of papers added
	 */
	public void addPaper(int num) {
		if (amountOfpaper + num <= 100) {
			amountOfpaper += num;
		} else if (amountOfpaper + num > 100) {
			amountOfpaper = 100;
		}
	}
	/**
	 * Adds ink to printer, If there is more than 100 ink, thath means that
	 * capacity is full, and can't add more ink 
	 * @param num number of ink added
	 */
	public void addInk(int num) {
		if (amountOfInk + num <= 100) {
			amountOfInk += num;
		} else if (amountOfInk + num > 100) {
			amountOfInk = 100;
		}
	}
	/**
	 * Prints pages while there is paper or ink
	 * For every page that is printed sum of printed pages is increased for 1,
	 * amount of paper is decreased for 1, amount of ink is decreased for 3
	 * and counter that counts all printed pages ever, is raised for sum of printed pages
	 * @param num
	 */
	public void printPages(int num) {

		while (amountOfpaper > 0 && amountOfInk > 0) {
			sumPrintedPages++;
			amountOfpaper--;
			amountOfInk -= 3;
			counter += sumPrintedPages;
		}
	}
	/**
	 * Getter and setter for counter
	 * @return
	 */
	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Printer.counter = counter;
	}
	/**
	 * Prints the status of printer
	 * @return
	 */
	public String status() {
		if (amountOfInk > 3 && amountOfpaper >= 1) {
			return "Ready";
		}
		if (amountOfInk < 3 && amountOfpaper > 0) {
			return "No ink";

		}
		if (amountOfInk > 3 && amountOfpaper == 0) {
			return "No paper";

		}
		if (amountOfInk < 3 && amountOfpaper == 0) {
			return "No ink or paper";
		}
		return null;

	}
	/**
	 * Prints information of printer
	 */

	public String toString() {
		return String
				.format("Printer name: %s,amountOfpaper %d, amountOfInk %d, status: %s",
						name, amountOfpaper, amountOfInk, status());
	}

}

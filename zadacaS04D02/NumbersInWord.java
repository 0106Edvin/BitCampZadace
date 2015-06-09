package ba.bitcamp.edvin.zadacaS04D02;

public class NumbersInWord {

	public static void main(String[] args) {
		/**
		 * Printing the result, if there is a numbers in string
		 */
		if (numCounter(args[0]) != 0) {
			System.out.println(args[0] + " contains " + numCounter(args[0])
					+ " numbers");
		}
		/**
		 * Printing to pass one string if user didn't pass anything
		 */
		if (args.length == 0) {
			System.out.println("Please pass one String to the program!");

		} 
		/**
		 * If there is no numbers in String, print to console
		 */
		else if (numCounter(args[0]) == 0) {
			System.out.println(args[0] + " does not contain any numbers");

		}
		/**
		 * If user pass more then one String
		 */
		else if (args.length > 1) {
			System.out.println("Please pass only one String to the program");
		}
	}
	/**
	 * Counting numbers in String
	 * @param s - string
	 * @return - how much numbers there is in String
	 */

	public static int numCounter(String s) {
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
				counter++;

			}
		}
		return counter;

	}
}
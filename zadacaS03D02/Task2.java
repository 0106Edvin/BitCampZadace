package ba.bitcamp.edvin.zadacaS03D02;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			System.out.print("Please enter a file name: ");
			String input = in.next();
			
			TextIO.readFile(input);
			String sNum = TextIO.getWord();
			int num = Integer.parseInt(sNum);
			long factorial = 1;

			for (int i = 1; i <= num; i++) {
				factorial *= i;
				System.out.println("Factorial of: " + num + "is " + factorial);
			}
		} catch (IllegalArgumentException ex) {
			System.out.println("That file doesn't exist");

		}

	}

}

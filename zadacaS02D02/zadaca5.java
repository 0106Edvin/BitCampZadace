package ba.bitcamp.edvin.zadacaS02D02;

import java.util.Scanner;

public class zadaca5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		int rev = 0;
		int input1 = input;

		while (input > 0) {
			int digit = input % 10;
			if (input % 10 != 0) {
				rev = rev * 10 + digit;
			}
			input /= 10;
		}
		while (input > 0) {
			int digit = input % 10;
			input /= 10;
		}
		System.out.println(rev);
	}
}
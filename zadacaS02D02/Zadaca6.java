package ba.bitcamp.edvin.zadacaS02D02;

import java.util.Scanner;

public class Zadaca6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1, num2;
		num1 = in.nextInt();
		num2 = in.nextInt();
		int digit = 0;
		for (int i = 0; i < num2; i++) {
		 digit = num1 % 10;
			num1 /= 10;
		}
		System.out.println(digit);

	}

}

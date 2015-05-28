package ba.bitcamp.edvin.zadacaS02D02;

import java.util.Scanner;

public class Zadaca4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Input number: ");
		int num = input.nextInt();
		int sum = 0;

		while (num != 0) {

			sum = 0;
			// Adding all the divisors to sum
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					sum += i;
				}
			}
			// Printing result
			System.out.println("Sum of all divisors is " + sum + ".");
			// Inputing new number
			System.out.print("Input number: ");
			num = input.nextInt();
		}

	}
}
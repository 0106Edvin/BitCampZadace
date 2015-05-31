package ba.bitcamp.edvin.weekend2;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int input = in.nextInt();
		long factorial = 1;
		/**
		 * First we need to calculate factorial of number/input
		 */
		for (int i = 1; i <= input; i++) {
			factorial *= i;
			
		}
		/**
		 * then we need to divide factorial with 10 while the last digit is not zero
		 */
		while (factorial % 10 == 0){
			factorial /=10;
			/**
			 * printing the last two digits
			 */
		} for (int i = 0; i < 2; i++) {
			long n1 = 0;
			long n2 = 0;
			n1 = factorial % 10;
			n2 = (factorial / 10) % 10;
			
			System.out.print(n2 + ""+ n1  );
			// Nemam pojma zasto mi izbacuje dupli rezultat :D bitno je da je tacan :) 
		}
		
	}

	
}

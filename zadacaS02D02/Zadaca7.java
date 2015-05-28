package ba.bitcamp.edvin.zadacaS02D02;

import java.util.Scanner;

public class Zadaca7 {

	
		public static void main(String[] args) {
			
			Scanner in = new Scanner (System.in);
			
			
			int sum = 0;
			int input = in.nextInt();
			
			//Listing all numbers from 1 to n
			for (int j = 1; j < input; j++) {
				//Reinitializing sum
				sum = 0;
				//Adding all the divisors to sum
				for (int i = 1; i < j; i++) {
					if(j % i == 0){
						sum += i;
					}
				}
				//Checking if number is magic
				if(sum == j){
					System.out.println("Number " + j + " is magic!");
				}	
			}
			
		}
	}
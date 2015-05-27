package ba.bitcamp.edvin.zadacaS02D02;

import java.util.Scanner;

public class Zadaca2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

Scanner input = new Scanner(System.in);
		
		//Declaring and initializing variables
		System.out.print("Input number: ");
		int element = input.nextInt();

		//Checking if input is valid
		if(element > 1 && element <= 50){
			long fibonacci = 0;
			long num1 = 0;
			long num2 = 1;
			
			//Finding nth element in sequence 
			for (int i = 1; i < element; i++) {
				fibonacci = num1 + num2;
				num1 = num2;
				num2 = fibonacci;
			}			
			//Printing result
			System.out.println(element + "th element in sequance is " + fibonacci + ".");
		} else {
			System.out.println("Incorrect input!");
		}
		
		input.close();
	}
}

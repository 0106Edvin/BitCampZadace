package ba.bitcamp.edvin.zadacaS02D02;

import java.util.Scanner;

public class zadaca8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input number: ");
		int  input =in.nextInt();
		int digit = 0;
		int sum = 0;
		
		//Listing all numbers from 1 to n
		for (int j = 1; j < input; j++) {
			//Reinitializing variables
			digit = 0;
			sum = 0;
			//i starts equaling num and decreases 10 times every iteration until it becames 0
			//for example num = 1234 i = 1234, 123 , 12, 1
			for (int i = j; i > 0; i = i / 10) {
				digit = i % 10;
				sum += digit;
			}
			//Checking if number is divisible by sum of its digits 
			if(j % sum == 0){
				System.out.println(j);
			}
		}
	
	}
}
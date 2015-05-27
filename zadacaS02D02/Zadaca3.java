package ba.bitcamp.edvin.zadacaS02D02;

import java.util.Scanner;

public class Zadaca3 {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		int input = in.nextInt();
		int sum  = 0;
		int a = 0;
		do {
			a = input % 10;
			input/=10;
			sum+=a;	
		}
		while (input > 0);
		System.out.println("The sum of number digits is : " + sum );
		
	}
}
	



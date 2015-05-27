package ba.bitcamp.edvin.zadacaS02D02;

import java.util.Scanner;

public class Zadaca9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Input lenght of a side: ");
		int lenght = input.nextInt();
		System.out.println();
		
		//Drawing triangle
		for (int i = 0; i < lenght; i++) {
			for (int j = 0; j < lenght; j++) {
				if(lenght - 1 > i + j){
					System.out.print(" ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
		input.close();
	}
}
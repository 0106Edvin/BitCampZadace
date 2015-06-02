package ba.bitcamp.edvin.zadacaS03D02;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
		System.out.print("Please enter a number: ");
		
		int a = in.nextInt();
		
		switch(a){
		case 1: case 2: case 3: case 4: case 5:
			System.out.println("Work day !");
			break;
		case 6: case 7:
			System.out.println("Weekend !!!");
			break;
		}

	}

}

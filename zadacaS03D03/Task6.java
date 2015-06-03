package ba.bitcamp.edvin.zadacaS03D03;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean found = false;
		System.out.print("Please enter the length of array: ");
		int[] arr = new int[in.nextInt()];
		System.out.print("Please enter the numbers in array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		System.out.print("Please insert the number that you want to check: ");
		int Q = in.nextInt();
		
		
		for (int i = 0; i < arr.length; i++) {
			if (Q == arr[i]) {
				found=true;
				break;
			}

		}
		
			System.out.println(found);
		
			

	}
}
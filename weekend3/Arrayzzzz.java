package ba.bitcamp.edvin.weekend3;

import java.util.Scanner;

public class Arrayzzzz {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Please enter the length of first array: ");
		int num1 = in.nextInt();
		System.out.print("Please enter the length of second array: ");
		int num2 = in.nextInt();

		int[] array1 = new int[num1];
		int[] array2 = new int[num2];

		for (int i = 0; i < array1.length; i++) {
			System.out.print("Enter the numbers of  first array: ");
			array1[i] = in.nextInt();

		}
		for (int i = 0; i < array2.length; i++) {
			System.out.print("Enter the numbers of  second array: ");
			array2[i] = in.nextInt();

			System.out.println(identical(array1, array2));
			

		}
	}//Task 2 - identical arrays

	public static boolean identical(int array1[], int array2[]) {

		if (array1.length != array2.length) {
			return false;

		} else {
			for (int i = 0; i < array1.length; i++) {
				if (array1[i] != array2[i]) {

					return false;
				}
			}

			return true;
		}
		
	}
		
}
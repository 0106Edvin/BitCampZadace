package ba.bitcamp.edvin.weekend3;

import java.util.Arrays;
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
			System.out.println(arrayToArray (array1, array2));

	
		}
	}//Task 2 - identical arrays

	public static boolean identical(int array1[], int array2[]) {

		boolean identical = true;
		for(int i = 0; i < array1.length; i++) {
			for(int j = 0; j < array2.length; j++) {
				if (array1[i] != array2[i]) {
					identical = false;
				} 
			}
		}
		return identical;
	}
	public static String arrayToArray (int [] array1, int [] array2){
		// lengths
		int l1 = array1.length;
		int l2 = array2.length;
		int l3 = l1 + l2;
		// create third array
		int[] array3 = new int[l3];
		// add values form first to new array3
		for (int i = 0; i < l1; i++){
			array3[i] = array1[i];
		}
		// counter to add values from index 0 of array2 
		// and continue with array3 where u ended before
		int counter = 0;
			for (int i = l1; i < l3; i++){
				array3[i] = array2[counter];
				counter++;
			}
		return Arrays.toString(array3);
	}
}
	
	
	

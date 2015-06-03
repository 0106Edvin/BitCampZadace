package ba.bitcamp.edvin.zadacaS03D03;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int[]arr= new int [100000];
		for (int i = 0; i < arr.length ; i++) {
			arr[i]= (int)(Math.random()*99999 +1);
		}
		Arrays.sort(arr, 0, arr.length);
		System.out.println(Arrays.toString(arr));
		System.out.println("Please enter number to check: ");
		int N = in.nextInt();
		Arrays.binarySearch(arr, N);
		
	}

}

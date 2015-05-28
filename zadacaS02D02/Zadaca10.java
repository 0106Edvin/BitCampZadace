package ba.bitcamp.edvin.zadacaS02D02;

import java.util.Scanner;

public class Zadaca10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1, num2;
		System.out.println("Unesi broj: ");
		num1 = in.nextInt();
		num2 = in.nextInt();
		int num = 0;
		int gcd = 0;
		if (num1 < num2) {
			num = num1;
		} else if (num1 > num2) {
			num = num2;
		}

		for (int i = 1; i <= num; i++) {
			
			if (num2 % i == 0 && num1 % i == 0) {
				gcd = i;
}
		}
		System.out.println(gcd);

	}
}
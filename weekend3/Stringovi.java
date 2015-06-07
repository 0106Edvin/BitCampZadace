package ba.bitcamp.edvin.weekend3;


import java.util.Scanner;

public class Stringovi {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str1 = in.next();
		String str2 = in.next();

		mixedStrings(str1, str2);
		printSecondString(str1, str2);
	}

	public static void mixedStrings(String s1, String s2) {

		for (int i = 0; i < s1.length() + s2.length(); i++) {
			if (s1.length() > i) {
				System.out.print(s1.charAt(i));
			}
			if (s2.length() > i) {
				System.out.print(s2.charAt(i));
			}
		}
		System.out.println();
	}

	public static void printSecondString(String s1, String s2) {
		if (s1.compareToIgnoreCase(s2) > 0) {
			System.out.println(s1);
			return;
		}
		System.out.println(s2);

	}

}

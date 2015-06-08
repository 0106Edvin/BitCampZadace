package ba.bitcamp.edvin.weekend3;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JSpinner.NumberEditor;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Loops {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please insert a number: ");
		int num = in.nextInt();
		printNum(num); // Task1
		numOfDigits(num); // Taks2
		System.out.println("Your new changed number is: " +changedNumber(num)); //Task3
		System.out.println("There is: " + range(num, changedNumber(num)) +" numbers between these two");

	}// Task1

	public static void printNum(int num) {

		DecimalFormat number = new DecimalFormat("#,###");
		System.out.println("Your number with coma: " + number.format(num));

	}// Taks2

	public static void numOfDigits(int num) {
		String s = "" + num;
		int numberOfDigits = 0;
		for (int i = 0; i < s.length() + 1; i++) {
			numberOfDigits = i;

		}
		System.out.println("Your number have: " + numberOfDigits + " digits");

	}// Task3

	public static int changedNumber(int num) {
		String s = "" + num;
		String s1 = "";
		char firstDigit = ' ';
		char lastDigit = ' ';
		String newNumber = "";

		for (int i = 0; i < s.length(); i++) {

			firstDigit = s.charAt(0);
			lastDigit = s.charAt(s.length() - 1);
			s1 = s.substring(1, s.length() - 1);

			newNumber = lastDigit + s1 + firstDigit;

		}

		return Integer.parseInt( newNumber);
	}//Task4

	public static int range(int num1, int num2) {
		
		int range =0;
		for (int i = num1; i < num2; i++) {
			range ++;		
		}
		


	int oddNumbers = 0;
	int evenNumbers = 0;
	// count odd and even numbers
    	
	for (int i = num1; i < num2; i++){
		// if number % 2 is zero it is even number, count them
		if (i % 2 == 0){
			evenNumbers += i +' ';
		// else count odd numbers 
		} else {
			oddNumbers += i + ' ';
		}
	} 
 	// if range is even number print them, or print odd numbers
	if (range % 2 == 0){
		return evenNumbers;
	} else {
		return oddNumbers;
}
}
}
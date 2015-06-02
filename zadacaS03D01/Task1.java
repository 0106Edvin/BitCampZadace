package ba.bitcamp.edvin.zadacaS03D01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please input your number: ");

		String input = in.next();
	/*try{	
	}catch (InputMismatchException ex){
		System.out.println("Please insert correct number !!");
		in.nextLine();*/
	

		String a = "";
		String b = "";
		int c = 0;
		int d = 0;
		int e = 0;
		char sign= '0';

		if (input.indexOf("+") != -1) {
			sign = '+';
			c = input.indexOf('+');

		} else if (input.indexOf("-") != -1) {
			sign = '-';
			c=input.indexOf('-');
		} else if (input.indexOf("/") != -1) {
			sign = '/';
			c = input.indexOf('/');
		} else if (input.indexOf("*") != -1) {
			sign = '*';
			c = input.indexOf('*');
		}
		a = input.substring(0, c);
		b = input.substring(c + 1, input.length());
		d = Integer.parseInt(a);
		e = Integer.parseInt(b);
		
		switch(sign){
		
		case '+' :
			System.out.println("Result is: " + (d + e));
			break;
		case '-' :
			System.out.println("Result is: " + (d - e));
			break;
		case '/' :
			System.out.println("Result is: " + (d / e));
			break;
		case '*' :
			System.out.println("Result is: " + (d * e));
			break;
			
		}
		
	}

}

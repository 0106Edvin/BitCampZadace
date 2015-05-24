package ba.bitcamp.edvin.weekend1;

/*Napisati program koji sadrži varijablu a. Ispisati da li se varijabla a nalazi izmeðu 5 i 7.5,
 izmeðu 7.5 i 10 ili je van opsega */

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 7.6;

		if (a > 5 && a < 7.5) { // checking if number is in this range 5-7.5
			System.out.println("Number is between 5 and 7.5");
		} else if (a > 7.5 && a < 10) { // checking if number is in this range
										// 7.5-10
			System.out.println("Number is between 7.5 and 10");
		} else
			System.out.println("Number is not in range");
		// If number is not in range then the program will print 'not in range'

	}

}

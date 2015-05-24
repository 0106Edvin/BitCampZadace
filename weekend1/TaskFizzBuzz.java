package ba.bitcamp.edvin.weekend1;

public class TaskFizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program that will expect the number as an argument and the
		 * forwarded number of print: - If the number is divisible by 3 - "Fizz"
		 * - If the number is divisible by 5 - "Buzz" - If the number is
		 * divisible with 3 and 5 - "FizzBuzz" - Otherwise print number
		 */

		int num = 17;

		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("FizzBuzz");
		} else if (num % 3 == 0) {
			System.out.println("Fizz");
		} else if (num % 5 == 0) {
			System.out.println("Buzz");
		} else
			System.out.println(+num);{
		}

	}

}

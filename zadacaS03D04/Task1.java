package ba.bitcamp.edvin.zadacaS03D04;

public class Task1 {

	public static void main(String[] args) {

		System.out.println(getMin2(0, -5, 3));
	}

	public static int getMin1(int num1, int num2) {
		//Comparing number1 and number2 and printing the smaller one
		if (num1 <= num2) {
			return num1;
		}
		return num2;

	}

	public static int getMin2(int num1, int num2, int num3) {
		//Checking if number3 is the smallest, if he is, then print, if he is not print the smaller of num1 and 2
		if (num3 <= num2 && num3 <= num1) {

			return num3;

		}
		return getMin1(num1, num2);
	}
}
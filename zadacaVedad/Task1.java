package ba.bitcamp.edvin.zadacaVedad;

public class Task1 {

	public static void main(String[] args) {

		int num1 = 10;
		double num2 = 3.3;
		int num3 = 5;
		int num4 = 6;
		double num5 = 10.1;
		double num6 = 10.2;
		System.out.println("The result is: " + pomnozi(num1));
		System.out.println("The result is: " + pomnozi(num2));
		System.out.println("The result is: " + pomnozi(num3, num4));
		System.out.println("The result is: " + pomnozi(num5, num6));
	}
	/**
	 * returns square of number
	 * @param num1 number
	 * @return square
	 */
	public static int pomnozi(int num1) {
		return num1 * num1;
	}
	/**
	 * returns square of a double
	 * @param num2 double
	 * @return square
	 */
	public static double pomnozi(double num2) {
		return num2 * num2;
	}
	/**
	 * returns product of two numbers
	 * @param num3 first number
	 * @param num4 second number
	 * @return product
	 */
	public static int pomnozi(int num3, int num4) {
		return num3 * num4;
	}
	/**
	 * returns product of two double
	 * @param num5 first double
	 * @param num6 second double
	 * @return product
	 */
	public static double pomnozi(double num5, double num6) {
		return num5 * num6;

	}
}
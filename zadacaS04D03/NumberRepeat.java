package ba.bitcamp.edvin.zadacaS04D03;

public class NumberRepeat {

	public static void main(String[] args) {
		/**
		 * 2D array with values
		 */
		int[][] arr2d = { { 1, 2, 1 }, { 5, 2, 8 }, { -4, 2, 3 } };

		System.out.println(countNum(arr2d, 2));
	}
	/**
	 * method for printing 2d array
	 * @param arr2d - 2d array
	 */
	public static void print2d(int[][] arr2d) {
		for (int i = 0; i < arr2d.length; i++) {
			for (int j = 0; j < arr2d[i].length; j++) {
				System.out.println(arr2d[i][j]);
			}
		}
	}
	/**
	 * checks how many times number is repeated in 2D array
	 * and every time number is repeated counter will increase for one
	 * @param arr2d - 2D array
	 * @param num - number
	 * @return result 
	 */

	public static int countNum(int[][] arr2d, int num) {

		int counter = 0;
		for (int i = 0; i < arr2d.length; i++) {
			for (int j = 0; j < arr2d[i].length; j++) {

				if (arr2d[i][j] == num) {
					counter++;
					// System.out.println(counter);
				}
			}
		}
		return counter;
	}

}

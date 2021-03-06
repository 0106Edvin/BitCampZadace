package ba.bitcamp.edvin.zadacaS04D03;

public class MaxPoints {

	public static void main(String[] args) {
		int[][] arr2d = { { 1, 2, 1 }, { 5, 2, 8 }, { -4, 2, 3 } };

		System.out.println(getMaxPoints(arr2d, 0, 0));
		System.out.println(getMaxPoints(arr2d, 1, 1));
		System.out.println(getMaxPoints(arr2d, 0, 2));

	}
	/**
	 * Returns max points player can win
	 * @param matrix array with values
	 * @param x number of a row
	 * @param y number of a column
	 * @return possible player position
	 * @throws IllegalArgumentException
	 */

	public static int getMaxPoints(int[][] matrix, int x, int y) throws IllegalArgumentException{

		String str = x + " " + y;

		switch (str) {

		case "00":
			return maxPoints(matrix[0][0], matrix[1][2], matrix[2][1]);
		case "01":
			return maxPoints(matrix[0][1], matrix[2][0], matrix[2][2]);
		case "02":
			return maxPoints(matrix[0][2], matrix[1][0], matrix[2][1]);
		case "10":
			return maxPoints(matrix[1][0], matrix[0][2], matrix[2][2]);
		case "11":
			return maxPoints(matrix[1][1], matrix[1][1], matrix[1][1]);
		case "12":
			return maxPoints(matrix[1][2], matrix[0][0], matrix[0][2]);
		case "20":
			return maxPoints(matrix[2][0], matrix[0][1], matrix[1][2]);
		case "21":
			return maxPoints(matrix[2][1], matrix[0][0], matrix[0][2]);
		case "22":
			return maxPoints(matrix[1][0], matrix[0][1], matrix[2][2]);
		default:
			throw new IllegalArgumentException();
		}

	}
	/**
	 * Finds biggest number / maximum points
	 * @param num1 number 1
	 * @param num2 number 2
	 * @param num3 number 3
	 * @return maximum points
	 */

	public static int maxPoints(int num1, int num2, int num3) {
		if (num1 > num2 && num1 > num3) {
			return num1;
		} else if (num2 > num3) {

			return num2;

		}

		return num3;
	}
	/**
	 * 
	 */

}

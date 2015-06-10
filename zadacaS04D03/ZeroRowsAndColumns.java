package ba.bitcamp.edvin.zadacaS04D03;

//ZADATAK NIJE URADJEN DO KRAJA :(

/**
public class ZeroRowsAndColumns {

	public static void main(String[] args) {
		int[][] arr2d = { { 1, -2, 1 }, { 5, 0, 4 }, { -4, 2, 2 } };

		System.out.println(getNumOfZeroRowsandColumns(arr2d));
		
	}

	/**
	 * method for printing 2d array
	 * 
	 * @param arr2d
	 *            - 2d array
	 */
	/**public static void print2d(int[][] arr2d) {
		for (int i = 0; i < arr2d.length; i++) {
			for (int j = 0; j < arr2d[i].length; j++) {
				System.out.println(arr2d[i][j]);
			}
		}
	}

	public static int getNumOfZeroRowsandColumns(int[][] matrix) {
		
		return Columns(matrix) + Rows (matrix);
	}
	public static int Columns (int [][] matrix){
		int sum1=0;
	
		for (int i = 0; i < matrix.length; i++) {
			if (isArrayZero(getColumns(matrix, i)));
				sum1 ++;
			}return sum1;
			
		}
	public static int Rows(int[][] matrix) {
		int counter = 0;
		for (int i = 0; i < matrix.length; i++) {
			if(isArrayZero(matrix[i])){
				counter++;
			}
		}
		return counter;
	}


	public static int[] getColumns(int[][] matrix, int index) {
		 
		int[] arrColumns = new int[matrix.length];
		for (int i = 0; i < arrColumns.length; i++) {
			arrColumns[i] = matrix[i][index];
			
		}

		return arrColumns;

	}
	public static boolean isArrayZero (int[]arrColumns){
		int sum = 0;
		for (int i = 0; i < arrColumns.length; i++) {
			sum += arrColumns[i];
			
		}
	if (sum == 0){
		return true;
	}
	return false;
}
}*/
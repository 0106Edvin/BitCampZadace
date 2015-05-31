package ba.bitcamp.edvin.weekend2;

public class Task5 {

	public static void main(String[] args) {
		System.out.print("The next odd number is: ");
		System.out.println(getNextOddNumber(5));
		
		System.out.print("The area of cicrle is: ");
		System.out.println(getAreaOfCircle(200));
		
		System.out.print("The number is in range: ");
		System.out.println(isInRange ( 10 , 50, 55));
	
	}
	/**
	 * calculating next odd number by dividing number with 2 and adding 1 or 2 n result
	 * @param num
	 * @return
	 */
	public static int getNextOddNumber(int num){
		if ( num % 2 != 0){
			num+=2;
		}else 
			num++;
		
		return num;
	}
	/**
	 * calculating area of circle 
	 * @param diameter
	 * @return
	 */
	public static double getAreaOfCircle( int diameter ){
		double area = ( diameter / 2 ) * ( diameter / 2 ) * Math.PI;
		return area;
}
	/**
	 * finding if the number n is in range of start number nad finish number
	 * @param start
	 * @param finish
	 * @param n
	 * @return
	 */
	public static boolean isInRange( int start, int finish, int n ){
		boolean numIsInRange = true;
		if( start < n && n < finish){
			numIsInRange = true;
		} else
			numIsInRange = false;
		return numIsInRange;
}
}
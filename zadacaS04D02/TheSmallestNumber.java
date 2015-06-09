package ba.bitcamp.edvin.zadacaS04D02;

public class TheSmallestNumber {

	public static void main(String[] args) {
		/**
		 * checking the result
		 */
		array (args);
		

	}
	/**
	 * first number in array is set as a smallest one
	 * <p>
	 * Check if the first number is smaller than others
	 * and if it is not, then give him the smaller value 
	 * which is converted into integer
	 * @param args - values from string array
	 */
public static void array(String []args){
	int smallestNumber = 0;
	try{
	smallestNumber = Integer.parseInt(args[0]);
	
	for (int i = 0; i < args.length; i++) {
		 if (smallestNumber > Integer.parseInt(args[i])){
			 smallestNumber = Integer.parseInt(args[i]);
			 
			 
		 }
		
	} 
	System.out.println("The smallest number is: " + smallestNumber);
		
} catch (NumberFormatException ex) {
	System.out.println("Please input  numbers in to array!");

} catch (IndexOutOfBoundsException ex){
	System.out.println("Please input  numbers in to array!");
		
}
}
}
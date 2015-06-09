package ba.bitcamp.edvin.zadacaS04D02;

import java.util.Scanner;

public class CelsiusToKelvin {

	public static void main(String[] args) {
		/**
		 * Entering number from console
		 */
		Scanner in = new Scanner (System.in);
		
		System.out.print("Please enter the temperture in Celsius to convert: ");
		double num = in.nextDouble();
		
		System.out.println(num + " Celsius degrees is equivalent to: " + celsiusToKelvin(num )+ " Kelvin");
	}
	/**
	 * Converts Celsius degrees into Kelvin, by adding 
	 * 273,15 on Celsius temperture 
	 * @param celsius - temperture in Celsius
	 * @return Kelvin
	 */
	public static double celsiusToKelvin(double celsius){
		double num = celsius + 273.15;
		
		return num;
	}

}

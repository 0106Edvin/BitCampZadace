package ba.bitcamp.edvin.weekend1;

/*Napisati program koji sadrži šest varijabli koje predstavljaju dva datuma. Ispisati na
 konzolu datum koji od ta dva datuma doðe prije drugoga.*/
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day = 4;
		int month = 2;
		int year = 2014;
		int day2 = 2;
		int month2 = 2;
		int year2 = 2014;

		if (year < year2) { // compares days, months and years and then prints
							// the date which comes first
			System.out.println(day + "." + month + "." + year + ".");
		} else if (year > year2) {
			System.out.println(day2 + "." + month2 + "." + year2 + ".");
		} else if (month < month2) {
			System.out.println(day + "." + month + "." + year + ".");
		} else if (month > month2) {
			System.out.println(day2 + "." + month2 + "." + year2 + ".");
		} else if (day < day2) {
			System.out.println(day + "." + month + "." + year + ".");
		} else if (day > day2) {
			System.out.println(day2 + "." + month2 + "." + year2 + ".");

		} else if (day == day2 && month == month2 && year == year2) {
			System.out.println("The dates are equal");
		}
	}

}

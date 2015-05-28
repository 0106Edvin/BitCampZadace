package ba.bitcamp.edvin.weekend1;

/*Napraviti program koji za dati datum odredi horoskopski znak koji pripada tom datumu.*/

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day = 21;
		int month = 5;

		if (day >= 21 && month == 3 || day <= 20 && month == 4) {
			System.out.println("ARIES");
		} else if (day >= 21 && month == 4 || day <= 21 && month == 5) {
			System.out.println("TAURUS");
		} else if (day >= 22 && month == 5 || day <= 21 && month == 6) {
			System.out.println("GEMINI");
		} else if (day >= 22 && month == 6 || day <= 22 && month == 7) {
			System.out.println("CANCER");
		} else if (day >= 23 && month == 7 || day <= 23 && month == 8) {
			System.out.println("LEO");
		} else if (day >= 24 && month == 8 || day <= 23 && month == 9) {
			System.out.println("VIRGO");
		} else if (day >= 24 && month == 9 || day <= 23 && month == 10) {
			System.out.println("LIBRA");
		} else if (day >= 24 && month == 10 || day <= 22 && month == 11) {
			System.out.println("SCORPIO");
		} else if (day >= 23 && month == 11 || day <= 21 && month == 12) {
			System.out.println("SAGITTARIUS");
		} else if (day >= 22 && month == 12 || day <= 20 && month == 1) {
			System.out.println("CAPRICORN");
		} else if (day >= 21 && month == 1 || day <= 19 && month == 2) {
			System.out.println("AQUARIUS");
		} else if (day >= 20 && month == 2 || day <= 20 && month == 3) {
			System.out.println("PISCES");
		}

	}
}
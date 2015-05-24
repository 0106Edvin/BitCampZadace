package ba.bitcamp.edvin.weekend1;

/*Napraviti program koji sadrži èetiri varijable. Ispisati na konzolu varijable tako da su
 sortirane od najmanje ka najveæoj.*/

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 6.54;
		double b = 324.24;
		double c = 64.3668768;
		double d = 324.32;

		if (a < b && a < c && a < d && b < c && c < d) {
			System.out.println(a + ", " + b + ", " + c + ", " + d);
		} else if (a < b && a < c && a < d && d < c && b < d) {
			System.out.println(a + ", " + b + ", " + d + ", " + c);
		} else if (a < b && a < c && a < d && b < d && c < b) {
			System.out.println(a + ", " + c + ", " + b + ", " + d);
		} else if (a < b && a < c && a < d && b < c && d < b) {
			System.out.println(a + ", " + d + ", " + b + ", " + c);
		} else if (a < b && a < c && a < d && d < b && c < d) {
			System.out.println(a + ", " + c + ", " + d + ", " + b);
		} else if (a < b && a < c && a < d && c < b && d < c) {
			System.out.println(a + ", " + d + ", " + c + ", " + b);
		} else if (b < a && b < c && b < d && c < d && a < c) {
			System.out.println(b + ", " + a + ", " + c + ", " + d);
		} else if (b < a && b < c && b < d && d < c && a < d) {
			System.out.println(b + ", " + a + ", " + d + ", " + c);
		} else if (c < a && c < b && c < d && b < d && a < b) {
			System.out.println(c + ", " + a + ", " + b + ", " + d);
		} else if (d < a && d < b && d < c && b < c && a < b) {
			System.out.println(d + ", " + a + ", " + b + ", " + c);
		} else if (d < a && d < b && d < c && c < b && a < c) {
			System.out.println(d + ", " + a + ", " + c + ", " + b);
		} else if (c < a && c < b && c < d && d < b && a < d) {
			System.out.println(c + ", " + a + ", " + d + ", " + b);
		} else if (b < a && b < c && b < d && a < d && c < a) {
			System.out.println(b + ", " + c + ", " + a + ", " + d);
		} else if (b < a && b < c && b < d && a < c && d < a) {
			System.out.println(b + ", " + d + ", " + a + ", " + c);
		} else if (d < a && d < b && d < c && a < b && c < a) {
			System.out.println(d + ", " + c + ", " + a + ", " + b);
		} else if (d < a && d < b && d < c && a < c && b < a) {
			System.out.println(d + ", " + b + ", " + a + ", " + c);
		} else if (c < a && c < b && c < d && a < b && d < a) {
			System.out.println(c + ", " + d + ", " + a + ", " + b);
		} else if (c < a && c < b && c < d && a < d && b < a) {
			System.out.println(c + ", " + b + ", " + a + ", " + d);
		} else if (b < a && b < c && b < d && d < a && c < d) {
			System.out.println(b + ", " + c + ", " + d + ", " + a);
		} else if (b < a && b < c && b < d && c < a && d < c) {
			System.out.println(b + ", " + d + ", " + c + ", " + a);
		} else if (c < a && c < b && c < d && d < a && b < d) {
			System.out.println(c + ", " + b + ", " + d + ", " + a);
		} else if (c < a && c < b && c < d && b < a && d < b) {
			System.out.println(c + ", " + d + ", " + b + ", " + a);
		} else if (d < a && d < b && d < c && c < a && b < c) {
			System.out.println(d + ", " + b + ", " + c + ", " + a);
		} else if (d < a && d < b && d < c && b < a && c < b) {
			System.out.println(d + ", " + c + ", " + b + ", " + a);
		}

	}
}
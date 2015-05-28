package ba.bitcamp.edvin.weekend1;

/*Napisati program koji sadrži tri cijela broja a, b i c. Ispisati da li je moguæe konstruisati
 trougao sa stranicama vrijednosti a, b i c */

public abstract class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 3.5;
		double b = 4.5;
		double c = 7;

		if ((a + b) > c && (a + c) > b && (b + c) > a) {
			System.out.println("It is possible to draw triangle");
		} else
			System.out.println("It is impossible to draw triangle");
	}
}

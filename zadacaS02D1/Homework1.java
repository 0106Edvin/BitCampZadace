package ba.bitcamp.edvin.zadacaS02D1;

/*Vaš program sadri broj n. Napisati takav code da odredi koliko se n moe puta podijeliti prije nego 

 što postane nula i ispisati rezultat na konzolu.*/

public class Homework1 {

	public static void main(String[] args) {
		int number = 56;
		int num = number;
		int counter = 0;
		do {
			// divides number with 2 and increase counter by 1 until number
			// reach 0
			num /= 2;

			counter++;

		} while (num > 0);
		System.out.println("The number can be divided " + counter + " times");
	}

}

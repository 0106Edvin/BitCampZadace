package ba.bitcamp.edvin.zadacaS02D1;

/*Vaš program sadrži broj n. Napisati program koji pronalazi sumu svih parnih brojeva od 1 do n, 

 iskljuèujuæi broj n.*/

public class Homework2 {

	public static void main(String[] args) {
		int number = 10;
		int num = number;
		int counter = 0;
		int result = 0;
		do {
			//increasing result for counter, and add +2 to counter until counter is smaller then number
			result += counter;

			counter += 2;
		} while (counter < num);
		System.out.println("The sum of all even numbers from 1 to " + number + " is " +result);
	}

}

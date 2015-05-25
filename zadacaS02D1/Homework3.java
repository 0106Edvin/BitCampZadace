package ba.bitcamp.edvin.zadacaS02D1;

/*Vaš program sadrži broj n. Napisati program koji odreðuje da li je dati broj n savršen ili ne. Savršen 
 (engl. perfect) je broj u kojega suma svih djelioca (iskljuèujuæi sebe) daje zapravo taj broj. Npr. broj 
 28 je savršen jer je suma svih njegovih djelioca 1, 2, 4, 7 i 14 zapravo 28 (sam taj broj).*/

public class Homework3 {

	public static void main(String[] args) {
		int number = 25;
		int num = number;
		int counter = 0;

		int sum = 0;

		while (counter < num / 2) {
			counter++;
			if (num % counter == 0) {
				sum += counter;
			}

		}
		if (number == sum){
			;
		System.out.println("The number " + number + " is perfect number");

	}else System.out.println("The number " + number + " is not a perfect number");
}
}
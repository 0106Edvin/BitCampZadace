package ba.bitcamp.edvin.zadacaS02D1;

/*Va� program sadr�i broj n. Napisati program koji odre�uje da li je dati broj n savr�en ili ne. Savr�en 
 (engl. perfect) je broj u kojega suma svih djelioca (isklju�uju�i sebe) daje zapravo taj broj. Npr. broj 
 28 je savr�en jer je suma svih njegovih djelioca 1, 2, 4, 7 i 14 zapravo 28 (sam taj broj).*/

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
package ba.bitcamp.zadaca01.zadatak02;

public class Main {

	public static void main(String[] args) {
		/**
		 * Creates animals
		 */
		Animal a1 = new Animal("Animal 1", 7, 1);
		Animal a2 = new Animal("Animal 2" , 0, 3);
		
		a1.animalStatus();
		a2.animalStatus();
		
		Animal.cycleDayNight();
		Animal.setAmountOfWater(9);
		
		a1.animalStatus();
		a2.animalStatus();
	}

}

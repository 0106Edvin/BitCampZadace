package ba.bitcamp.edvin.zadacaZivotinje;

public class Zivotinja {

	public static void main(String[] args) {
		Animal cow = new Animal("Cow","Mooooooo" , 4, false);
		System.out.println(cow);
		System.out.println();
		
		Animal cat = new Animal("Cat", "meow meow", 4, false);
		System.out.println(cat);
		System.out.println();
		
		Animal dog = new Animal("Dog", "bow-wow", 4, false);
		System.out.println(dog);
		System.out.println();
		
		Animal duck = new Animal("Duck", "quack-quack", 2, false);
		System.out.println(duck);
		System.out.println();
		
		Animal bull = new Animal("Bull", "Moooo", 4, true);
		System.out.println(bull);
		System.out.println();
		
		Animal frog = new Animal("Frog", "croak", 4, false);
		System.out.println(frog);
		System.out.println();
		
		Animal chicken = new Animal("Chicken", "cluck-cluck", 2, false);
		System.out.println(chicken);
	}

}

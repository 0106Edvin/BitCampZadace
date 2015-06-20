package ba.bitcamp.zadaca03;

public class Main {

	public static void main(String[] args) {
	
	Pet p = new Pet("Rex", 4, "Dog");
	
	
	Dog d = new Dog("Rex", 2, "Dog", "Collie");
	System.out.println(d);
	Cat c = new Cat(null, 0, null);
	System.out.println(c);

}
}
package ba.bitcamp.zadaca02.zadatak02;

public class Main {

	public static void main(String[] args) {
		
		Glass g1 = new Glass(null, 0, 1);
		
		g1.addLiquid("Sprite", 0.2);
		System.out.println(g1.getCurrentCapacity());
		System.out.println(g1.getTypeOfLiquid());
		g1.addLiquid("Sprite", 0.3);
		System.out.println(g1.getCurrentCapacity());
		System.out.println(g1.getTypeOfLiquid());
		g1.emptyGlass();
		System.out.println(g1.getCurrentCapacity());
	}

}

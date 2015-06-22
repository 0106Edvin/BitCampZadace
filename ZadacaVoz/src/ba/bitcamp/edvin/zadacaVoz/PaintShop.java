package ba.bitcamp.edvin.zadacaVoz;

public class PaintShop {

	public static void main(String[] args) {
		
		Wagon w1 = new Wagon(3, new Rectangle(7, 3));
		Wagon w2 = new Wagon(3, new Rectangle (4,2));
		Wagon w3 = new Wagon(3, new Rectangle (8,1));
		System.out.println("The area of wagon is: " + w1.calculateArea());

		Locomotive l = new Locomotive(new Rectangle(7, 3), new Square(2), 3);
		System.out.println("The area of locomotive is: " + l.calculateArea());
		
		Wagon [] arrayWagon= new Wagon[] {w1,w2,w3};
		Train t = new Train(arrayWagon, l);
		System.out.println("The area of the train is: " + t.calculateArea(arrayWagon, l));
	}
}
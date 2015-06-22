package ba.bitcamp.edvin.zadacaVoz;

public class Square {

	private double a;
	/**
	 * Creating constructor
	 * @param a side of a square
	 */
	public Square(double a) {
		super();
		this.a = a;
	}
	/**
	 * Returns side of a square
	 * @return
	 */
	public double getA() {
		return a;
	}
	/**
	 * Allows user to set a side of a square
	 * @param a
	 */
	public void setA(double a) {
		this.a = a;
	}
	/**
	 * Returns area of a square
	 * @return
	 */
	public double getArea() {

		return a * a;
	}
	
	@Override
	public String toString() {
		return "Square [a=" + a + "]";
	}

}

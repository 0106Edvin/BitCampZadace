package ba.bitcamp.edvin.zadacaVoz;

public class Circle {

	private double radius;
	/**
	 * Creating constructor
	 * @param radius radius of a circle
	 */
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	/** 
	 * Returns radius
	 * @return
	 */
	public double getRadius() {
		return radius;
	}
	/**
	 * Allows user to set a radius of a circle
	 * @param radius
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	/**
	 * Returns area of a circle
	 * @return
	 */
	public double getArea() {

		return radius * radius * Math.PI;

	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
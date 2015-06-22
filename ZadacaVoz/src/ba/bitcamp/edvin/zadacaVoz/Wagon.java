package ba.bitcamp.edvin.zadacaVoz;

import java.util.Arrays;

/**
 * Creating a wagon of a two circles and a rectangle
 * @author HP
 *
 */
public class Wagon {

	private Circle[] circles;
	private Rectangle rectangle;

	/**
	 * Creating constructor
	 * @param wheel size of a circle which represents a wheel
	 * @param rectangle wagon body
	 */
	public Wagon(double wheel, Rectangle rectangle) {
		super();
		this.rectangle = rectangle;
		this.circles = new Circle[] { new Circle(wheel), new Circle(wheel) };

	}
	/**
	 * Returns circle
	 * @return
	 */
	public Circle[] getCircles() {
		return circles;
	}
	/**
	 * Returns rectangle
	 * @return
	 */
	public Rectangle getRectangle() {
		return rectangle;
	}
	/**
	 * Allows user to set a rectangle size
	 * @param rectangle
	 */
	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}
	/**
	 * Calculates and returns area of a wagon
	 * @return
	 */
	public double calculateArea() {
		double area = 0;
		for (int i = 0; i < circles.length; i++) {
			area += circles[i].getArea();
		}

		return rectangle.getArea() + area;
	}

	@Override
	public String toString() {
		return "Wagon [circles=" + Arrays.toString(circles) + ", rectangle="
				+ rectangle + "]";
	}

}

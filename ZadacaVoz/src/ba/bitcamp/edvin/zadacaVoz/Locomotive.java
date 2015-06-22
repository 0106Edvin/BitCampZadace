package ba.bitcamp.edvin.zadacaVoz;

import java.util.Arrays;

/**
 * Creating a locomotive of a two circles, rectangle and square
 * 
 * @author HP
 *
 */
public class Locomotive {

	private Circle[] circles;
	private Rectangle rectangle;
	private Square square;

	/**
	 * Creating constructor
	 * 
	 * @param rectangle
	 *            represents a body of a train
	 * @param square
	 *            represents a cabin
	 * @param wheel
	 *            represents a size of a circle (wheel)
	 */
	public Locomotive(Rectangle rectangle, Square square, double wheel) {
		super();
		this.circles = new Circle[] { new Circle(wheel), new Circle(wheel) };
		this.rectangle = rectangle;
		this.square = square;
	}

	/**
	 * returns circle
	 * 
	 * @return
	 */
	public Circle[] getCircles() {
		return circles;
	}

	/**
	 * Allows user to set a size of circles (wheels)
	 * 
	 * @param circles
	 */
	public void setCircles(Circle[] circles) {
		this.circles = circles;
	}

	/**
	 * Calculates are of a Train Calculate area of every part of a train and
	 * then sum all areas in one
	 * 
	 * @return
	 */
	public double calculateArea() {
		double area1 = 0;

		for (int i = 0; i < circles.length; i++) {
			area1 += circles[i].getArea();
		}

		return square.getArea() + area1 + rectangle.getArea();
	}

	@Override
	public String toString() {
		return "Locomotive [circles=" + Arrays.toString(circles)
				+ ", rectangle=" + rectangle + ", square=" + square + "]";
	}

}

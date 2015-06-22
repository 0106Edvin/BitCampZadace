package ba.bitcamp.edvin.zadacaVoz;

public class Rectangle {
	
	private double length;
	private double width;

	/**
	 * Creating constructor
	 * @param length length of a rectangle
	 * @param width width of a rectangle
	 */
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	/**
	 * Returns length of a rectangle
	 * @return
	 */
	public double getLength() {
		return length;
	}
	/**
	 * Allows user to set a length of a rectangle
	 * @param length
	 */
	public void setLength(double length) {
		this.length = length;
	}
	/**
	 * Returns width of a rectangle
	 * @return
	 */
	public double getWidth() {
		return width;
	}
	/**
	 * Allows user to set a width of a rectangle
	 * @param width
	 */
	public void setWidth(double width) {
		this.width = width;
	}
	/**
	 * Returns area of a rectangle
	 * @return
	 */
	public double getArea() {

		return width * length;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}

}

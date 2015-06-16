package ba.bitcamp.zadaca02.zadatak02;

public class Glass {

	private String type;
	private double amount;
	private double maximum;

	public Glass(String type, int amount, int maximum) {
		this.type = null;
		this.amount = 0;
		this.maximum = 1;
	}
	/**
	 * 
	 * @return type of liquid
	 */

	public String getTypeOfLiquid() {
		return type;

	}
	/**
	 * 
	 * @return maximum capacity
	 */
	public double getMaxCapacity() {
		return maximum;
	}
	/**
	 * Calculates current capacity 
	 * @return current capacity
	 */
	public double getCurrentCapacity() {
		double capacity = 0;
		capacity += amount;
		return capacity;
	}
	/**
	 * Adds liquid in glass
	 * If glass is empty just add liquid
	 * If glass is not empty but liquid is the same type, add liquid
	 * If glass is not empty and liquid is not the same type do nothing
	 * @param s type of liquid
	 * @param num amount of liquid
	 */
	public void addLiquid(String s, double num) {

		if (type == null) {
			if (amount + num <= maximum) {
				amount += num;
				type = s;
			} else
				amount = maximum;
		} else if (type.equals(s)) {
			if (amount + num <= maximum) {
				amount += num;
			} else
				amount = maximum;
		}

	}
	/**
	 * Remove all liquid from glass
	 */
	public void emptyGlass() {
		amount = 0;
	}
}
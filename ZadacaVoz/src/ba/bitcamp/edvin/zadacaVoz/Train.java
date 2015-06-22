package ba.bitcamp.edvin.zadacaVoz;

import java.util.Arrays;
/**
 * Creating a train of a array of wagons and locomotive
 * @author HP
 *
 */
public class Train {
	private Wagon[] w;
	private Locomotive l;

	public Train(Wagon[] w, Locomotive l) {
		super();
		this.w = w;
		this.l = l;
	}
	/**
	 * Calculate area of Train by summing area of a wagons and locomotive 
	 * @param w
	 * @param l
	 * @return
	 */
	public double calculateArea(Wagon[] w, Locomotive l) {
		double area = 0;
		for (int i = 0; i < w.length; i++) {
			area += w[i].calculateArea();
		}
		return area + l.calculateArea();
	}

	@Override
	public String toString() {
		return "Train [w=" + Arrays.toString(w) + ", l=" + l + "]";
	}

}

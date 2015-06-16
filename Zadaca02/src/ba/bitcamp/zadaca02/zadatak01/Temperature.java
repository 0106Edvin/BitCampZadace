package ba.bitcamp.zadaca02.zadatak01;

public class Temperature {

	private double celsius;

	public Temperature(int celsius) {
		this.celsius = celsius;

	}

	/**
	 * Prints temperature in celsius
	 */
	public void getCelsisus() {

		System.out.println("Temperature in celsius: " + celsius);
	}
	/**
	 * Prints temperature in kelvin, by adding 273,15 on celsius
	 */
	public void getKelvin() {
		double kelvin;
		kelvin = 273.15 + celsius;
		System.out.println("Temperature in kelvin: " + kelvin);
	}
	/**
	 * Prints temperature in farenheit by adding 32 on celsius
	 */
	public void getFarenheit() {
		double farenheit;
		farenheit = celsius + 32;
		System.out.println("Temperature in farenheit: " + farenheit);
	}
	/**
	 * Gives opportunity to set the temperature
	 * @param num temperature
	 * @return temperature in celsius
	 */
	public double setTemperature(int num) {
		celsius = num;
		return celsius;
	}

	public String toString() {
		return String.format("Celsius: %d", celsius);
	}
}

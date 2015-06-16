package ba.bitcamp.zadaca02.zadatak04;

public class Employee {

	private String name;
	private String maleOrFemale;
	private double salary;

	/**
	 * Creating constructor
	 * @param name name of employee
	 * @param maleOrFemale is employee male or female
	 * @param salary employee salary
	 */
	public Employee(String name, String maleOrFemale, double salary) {
		this.name = name;
		this.maleOrFemale = maleOrFemale;
		this.salary = salary;
	}
	/**
	 * Getter for name
	 * @return name of employee
	 */
	public String getName() {
		return name;
	}
	/**
	 * Getter for male or female
	 * @return male or female
	 */
	public String getmaleOrFemale() {
		return maleOrFemale;
	}
	/**
	 * Getter for salary
	 * @return salary
	 */

	public double getSalary() {
		return salary;
	}
	/**
	 * Setter for salary
	 * @param salary sets salary
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
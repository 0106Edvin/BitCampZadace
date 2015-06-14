package ba.bitcamp.edvin.weekend4.School;

public class Director {

	String name;
	Integer year;
	
	public Director(String name, Integer year) {
		super();
		this.name = name;
		this.year = year;
	}
	public String toString(){
		String s = "";
		
		s += "Directors name: " + name + "\n";
		s += "Directors age: " + year + "\n";
		return s;
	}
	
}

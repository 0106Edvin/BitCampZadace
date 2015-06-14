package ba.bitcamp.edvin.weekend4.School;

public class Class {

	String name;
	Integer number;
	
	public Class(String name, Integer number) {
		super();
		this.name = name;
		this.number = number;
	}
	public String toString (){
		String s = "";
		
		s += "Name of class: " + name + "\n";
		s += "Number of students: " + number + "\n";
		
		return s;
	}
	
}

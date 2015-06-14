package ba.bitcamp.edvin.weekend4.School;

public class School {

	String name;
	Director director;
	Class[] classes;
	
	public School(String name, Director director, Class[] classes) {
		super();
		this.name = name;
		this.director = director;
		this.classes = classes;
	}
	public String toString(){
		String s = "";
		
		s += "School name: " + name + "\n";
		s +=  director + "\n";
		
		for (int i = 0; i < classes.length; i++) {
			
			s += "\n" + classes[i] + "\n";
			
		}
		return s;
	}
	public School(){
		
	}
}

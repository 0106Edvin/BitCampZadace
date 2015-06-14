package ba.bitcamp.edvin.weekend4.Football;

public class FootballPlayer {
	
	String name;
	Integer yearOfBirth;
	String position;
	
	public FootballPlayer(String name, Integer yearOfBirth, String position) {
		super();
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.position = position;
	}
	
	public String toString (){
		String s = "";
		
		s += "Player name: " + name + "\n";
		s += "Year of birth: " + yearOfBirth + "\n";
		s += "Player position: " + position + "\n";
		
		return s;
	}

}

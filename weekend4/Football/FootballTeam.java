package ba.bitcamp.edvin.weekend4.Football;


public class FootballTeam {
	String name;
	FootballPlayer[] player;
	
	public FootballTeam(String name, FootballPlayer[] player) {
		super();
		this.name = name;
		this.player = player;
	}
	public String toString(){
		String s= "";
		s += "Name of Football club: " + name + "\n";
		
		for (int i = 0; i < player.length; i++) {
			s += "\n" + player[i] + "\n";
		}
		return s;
	}
	public FootballTeam (){
		
	}
	
}

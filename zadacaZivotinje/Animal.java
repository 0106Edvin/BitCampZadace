package ba.bitcamp.edvin.zadacaZivotinje;

public class Animal {

	private String Name;
	private String Sound;
	private int Extremities;
	private Boolean Horns = false;
	
	public Animal(String name, String sound, int extremities, Boolean horns) {
		super();
		Name = name;
		Sound = sound;
		Extremities = extremities;
		Horns = horns;
	}

	
	public String toString(){
		String zivotinja = "";
		zivotinja = zivotinja + "Name: " + Name + "\n";
		zivotinja = zivotinja + "Sound: " + Sound + "\n";
		zivotinja = zivotinja + "Number of Extremities: " + Extremities + "\n";
		zivotinja = zivotinja + "Have Horns: " + Horns + "\n";
	
		return zivotinja;
	}

}

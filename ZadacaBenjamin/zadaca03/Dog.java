package ba.bitcamp.zadaca03;

public class Dog extends Pet{
	private String kind;

	public Dog(String name, int age, String species, String kind) {
		super(name, age, species);
		this.kind = kind;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public String toString(){
		String s = "Av Av";
		return s;
		
	}

}

package ba.bitcamp.edvin.zadaca02;

public class CampStringBuilder {
public static void main(String[] args) {
	
}
private char[] characters;
/**
 * Creating constructor
 * @param characters  characters inserted by user
  */
public CampStringBuilder(char[] characters) {
	super();
	this.characters = characters;
}
/**
 * Adds characters after string 
 * @param o
 */
public void append(Object o) {
	System.out.println(this.toString() + o.toString());
}
/**
 * First add characters and then string
 * @param o 
 */
public void prepend(Object o) {
	System.out.println(o.toString() + this.toString());
}

public String toString() {
	String s = " ";
	for (int i = 0; i < characters.length; i++) {
		s += characters[i] + "";
	}
	return s;
}

}

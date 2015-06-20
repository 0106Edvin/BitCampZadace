package ba.bitcamp.edvin.zadaca02;

public class Main {
	public static void main(String[] args) {

		String name = "Edvin";
		char c = 'M';
		char c1 = 'r';
		char c2 = '.';

		char[] cc = new char[3];
		cc[0] = c;
		cc[1] = c1;
		cc[2] = c2;
		
		CampStringBuilder cs = new CampStringBuilder(cc);
		cs.append(name);
		cs.prepend(name);
		
		
	}

}

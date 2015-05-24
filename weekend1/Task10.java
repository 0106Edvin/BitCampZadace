package ba.bitcamp.edvin.weekend1;
/*Implementirati kod koji odreðuje da li je dati broj jedan od rješenja date kubne jednaèine
oblika ax^3 + bx^2 + cx + d = 0. Vaš kod treba da ima pet varijabli: vrijednosti a, b, c, i d,
kao i dato (potencijalno) rješenje*/

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1;
		double b = 2;
		double c = 3;
		double d = 4;
		double solution = 5;
		
		if (a*solution*solution*solution + b*solution*solution + c*solution + d == 0 ){
			System.out.println("The number is solution");
		}else System.out.println("The number is not solution");
				
	}

}

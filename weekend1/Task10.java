package ba.bitcamp.edvin.weekend1;
/*Implementirati kod koji odre�uje da li je dati broj jedan od rje�enja date kubne jedna�ine
oblika ax^3 + bx^2 + cx + d = 0. Va� kod treba da ima pet varijabli: vrijednosti a, b, c, i d,
kao i dato (potencijalno) rje�enje*/

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

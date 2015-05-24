package ba.bitcamp.edvin.weekend1;

/*Dizajnirati program koji za dati trocifreni broj odredi da li je taj broj djeljiv sa zbirom svojih
 cifara.*/
public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double  a = 112; 
		boolean rezultat = (a % ((a % 10) + (((a % 100) - a % 10) / 10)	+ (((a % 1000) - a % 100) / 100)) == 0);
		System.out.println(rezultat);

	}
}

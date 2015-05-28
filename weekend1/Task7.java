package ba.bitcamp.edvin.weekend1;

/*Dizajnirati program koji sadrži jednu èetverocifrenu varijablu int tipa. Ispisati na konzolu
 sumu njezinih cifara, npr. ukoliko je varijabla 1815 onda je rezultat 1+8+1+5=15.*/
public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1815;

		System.out.println((a % 10) + (((a % 100) - a % 10) / 10)
				+ (((a % 1000) - a % 100) / 100)
				+ (((a % 10000) - a % 1000) / 1000));

	}

}

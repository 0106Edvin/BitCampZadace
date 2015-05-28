package ba.bitcamp.edvin.weekend1;
/*Implementirati kod koji odreðuje u koliko sati i minuta avion slijeæe na aerodrom ukoliko
vam je poznato u koliko sati i minuta avion uzlijeæe i koliko minuta bude u letu. Avion
uzlijeæe i slijeæe u istoj vremenskoj zoni.*/

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour = 23; // Hour when plane take off
		int minute = 0; //Minute when plate take off
		int minuteInAir= 1250 ; // How much minutes will plane spend in air
		int c = 0; 
		int d = 0;
		int arrivingHour = 0;
		c = (minute + minuteInAir); 
		
		 if (c < 60 ){
			System.out.println("The plane will land at " + hour +":" + c);
	
		 }else if (c >= 60 && c < 120 ){
			System.out.println("The plane will land at " +(hour + 1) + ":" + (c - 60));
		
		}else if (c >= 120);
		 
		 d= c / 60 ; //Turns minutes into hours
		 arrivingHour = (hour + d) - 24;  
		 System.out.println("The plane will land at " + arrivingHour + ":" + ( c % 60));
	}// Print arriving time in hours and minutes
}

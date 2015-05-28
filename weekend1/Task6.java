package ba.bitcamp.edvin.weekend1;

/*Napraviti program koji sadrži dvije varijable koje predstavljaju vrijeme u formatu 24:00h
 (military time). Ispisati na ekran u formatu AM/PM. */

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour = 00;
		int minute = 1;

		
		 if (hour >= 0 && hour < 12 && minute <60) {
			System.out.println(hour + ":" + minute + " AM");
		} else if (hour == 13 && minute <60) { //this command change 13:(<60 minutes) into 1: (<60) PM
			System.out.println(1 + ":" + minute + " PM");
		} else if (hour == 14 && minute <60) {
			System.out.println(2 + ":" +minute  + " PM");
		} else if (hour == 15 && minute <60) {
			System.out.println(3 + ":" + minute + " PM");
		} else if (hour == 16 && minute <60) {
			System.out.println(4 + ":" + minute + " PM");
		} else if (hour == 17 && minute <60) {
			System.out.println(5 + ":" + minute + " PM");
		} else if (hour == 18 && minute <60) {
			System.out.println(6 + ":" + minute + " PM");
		} else if (hour == 19 && minute <60) {
			System.out.println(7 + ":" + minute + " PM");
		} else if (hour == 20 && minute <60) {
			System.out.println(8 + ":" + minute + " PM");
		} else if (hour == 21 && minute <60) {
			System.out.println(9 + ":" + minute + " PM");
		} else if (hour == 22 && minute <60) {
			System.out.println(10 + ":" + minute + " PM");
		} else if (hour == 23 && minute <60) {
			System.out.println(11 + ":" + minute + " PM");
		} else if (hour == 24 && minute == 00) {// if it is 24:00 hours, print 12:00 AM
			System.out.println(12 + ":" + 0+0 + " AM");
		}else if (minute > 59 || hour >24 || hour == 24 && minute >0){
			System.out.println("Incorrect time");
		}else if (hour == 12){ //if it is 12:00 hours, print 12 AM
			System.out.println(12 + ":" + minute +" PM");
		}
	}

}

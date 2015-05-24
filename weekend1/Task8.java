package ba.bitcamp.edvin.weekend1;
/*Dizajnirati program koji za date koordinate x, y i z taèke A u 3D prostoru odreðuje koliko
je taèka daleko od koordinatnog poèetka (0,0,0)*/
public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 6;
		int y = 2;
		int z = -2;
		
		double distance;
		distance = Math.sqrt( (x * x + y * y + z * z)); 	// Print to console the distance from origin point
	
		System.out.printf("Distance A point (%d,%d,%d) from the origin point(0,0,0) is: %s",x, y, z, distance);

	}

}


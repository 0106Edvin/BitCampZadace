package ba.bitcamp.edvin.weekend3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Main {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800, BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		// **** Draw here ****
		
		g.setColor(Color.black);
		g.drawRect(100, 50,700, 400);
		g.setColor(Color.BLUE);
		g.drawString("java", 105, 70);
		g.setColor(Color.BLACK);
		g.drawRect(130, 80, 200, 350);
		g.setColor(Color.BLUE); 
		g.drawString("lang",135 , 100);
		g.setColor(Color.BLACK);
		g.drawRect(140, 115, 170, 170);
		g.setColor(Color.GREEN);
		g.drawString("Math", 145, 135);
		g.setColor(Color.BLACK);
		g.drawRect(155, 150, 140, 40);
		g.setColor(Color.RED);
		g.drawString("sqrt()", 200, 170);
		g.setColor(Color.BLACK);
		g.drawRect(155, 210, 140, 40);
		g.setColor(Color.RED);
		g.drawString("random()", 200, 235);
		g.setColor(Color.BLACK);
		g.drawRect(140, 320 , 170, 40);
		g.setColor(Color.GREEN);
		g.drawString("String", 150,340);
		g.setColor(Color.BLACK);
		g.drawRect(140, 370 , 170, 40);
		g.setColor(Color.GREEN);
		g.drawString("Integer", 150,390);
		
		g.setColor(Color.BLACK);
		g.drawRect(380, 80, 200, 350);
		g.setColor(Color.BLUE); 
		g.drawString("awt",385 , 100);
		g.setColor(Color.BLACK);
		g.drawRect(390, 115, 170, 170);
		g.setColor(Color.GREEN);
		g.drawString("Graphics", 395, 135);
		g.setColor(Color.BLACK);
		g.drawRect(405, 150, 140, 40);
		g.setColor(Color.RED);
		g.drawString("drawRect()", 450, 170);
		g.setColor(Color.BLACK);
		g.drawRect(405, 210, 140, 40);
		g.setColor(Color.RED);
		g.drawString("setColor()", 450, 235);
		g.setColor(Color.BLACK);
		g.drawRect(390, 320 , 170, 40);
		g.setColor(Color.GREEN);
		g.drawString("Color", 400,340);
		g.setColor(Color.BLACK);
		g.drawRect(390, 370 , 170, 40);
		g.setColor(Color.GREEN);
		g.drawString("Font", 400,390);
		
		g.setColor(Color.BLACK);
		g.drawRect(650, 80, 100, 350);
		g.setColor(Color.BLUE);
		g.drawString("util", 660, 100);
		
		// *******************
		w.setImage(img);
	}
}

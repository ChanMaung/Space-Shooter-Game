import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;


public class Maze extends JPanel {
	
	private Drawable[] items = new Drawable[9];
	
	public void paintComponent (Graphics g) {
		
		super.paintComponent(g);
		g.setColor(Color.lightGray);
		g.drawRect(0, 0, 500, 500);
		
		for(int i = 0; i < items.length; i++) {
			items[i].draw(g);
		}
	}
	
	Maze(SpaceShip spaceship){
		items[0] = spaceship;
		items[1] = new Alien(50,50);
		items[2] = new Alien(150,50);
		items[3] = new Alien(300,50);
		items[4] = new Bunker(50,350);
		items[5] = new Bunker(150,350);
		items[6] = new Bunker(250,350);
		items[7] = new Bunker(350,350);
		items[8] = new Score(300,40);

	}
	
}

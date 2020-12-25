import java.awt.*;


public class Alien implements Drawable {
	private int positionX;
	private int positionY;
	private boolean left = true;
	private Score score = new Score();
	
	public Alien(int x, int y) {
		positionX = x;
		positionY = y;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.red);
			
		
		if (left == true) {
			positionX -= 10;

			
		}
		else {
			positionX += 10;
		}
		
		if(positionX > 400) {
			left = true;
			positionY += 10;
			score.increment();
		}
		if(positionY > 400) {
			positionY = 400;
		}
		if(positionX < 0) {
			left = false;
			positionY += 10;
			score.increment();
		}
		if(positionY < 0) {
			positionY = 0;
		}
		
		g.fillRect(positionX, positionY, 20, 20);
	}

}

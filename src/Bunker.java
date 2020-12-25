import java.awt.*;

public class Bunker implements Drawable {
	private int positionX;
	private int positionY;
	
	public Bunker(int x, int y) {
		positionX = x;
		positionY = y;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(positionX, positionY, 20, 20);
	}
}

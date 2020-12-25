import java.awt.*;

public class Projectile implements Drawable {

	private int positionX = 200;
	private int positionY = 400;
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(positionX, positionY, 5, 5);
		
	}
	
	public void shoot() {
		positionY -= 20;
	}

}

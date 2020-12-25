import java.awt.*;
import java.util.concurrent.TimeUnit;

public class SpaceShip implements Drawable {
	private int positionX = 200;
	private int positionY = 400;
	private int projPosX = 0;
	private int projPosY = 0;
	private boolean shot = false;
	
	public void draw(Graphics go) {
		go.setColor(Color.yellow);
		go.fillRect(positionX, positionY, 30, 30);
		
		if(positionX > 400) {
			positionX = 400;
		}
		if(positionY > 400) {
			positionY = 400;
		}
		if(positionX < 0) {
			positionX = 0;
		}
		if(positionY < 0) {
			positionY = 0;
		}
		
		go.setColor(Color.black);
		go.fillRect(projPosX, projPosY, 5, 5);
		if (shot == true) {
			projPosY -= 10;
		}
		
		if (projPosY < 20) {
			shot = false;
		}
	}
	
	public void left() {
		positionX -= 20;
	}
	public void right() {
		positionX += 20;
	}
	
	public void shoot() {
		
		projPosX = positionX;
		projPosY = positionY;
		shot = true;
		
	}
	public int getPosX() {
		return positionX;
		
	}
	public int getPosY() {
		return positionY;
		
	}
	
}

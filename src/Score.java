import java.awt.*;

public class Score implements Drawable {
	private int positionX = 400;
	private int positionY = 40;
	private static int score = 0;
	private static int Hiscore = 10;
	private static int Newhiscore = 0;
	
	public Score() {
		
	}
	public Score(int x, int y) {
		positionX = x;
		positionY = y;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.black);
		Font myFont = new Font ("Courier New",1,11);
		g.setFont(myFont);
		g.drawString("score: " + score, positionX, positionY);
		g.drawString("Hiscore: " + Hiscore, 50, 40);
		if (score > Hiscore) {
			g.drawString("New Hiscore: " + Newhiscore, 50, 30);
		}
		
	}
	public void increment() {
		score++;
		if (score > Hiscore) {
			Newhiscore = score;
		}
	}
	
}

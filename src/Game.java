import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JFrame implements ActionListener, KeyListener {

	private Maze maze;
	private SpaceShip spaceship;
	private Alien alien;
	private Projectile projectile;
	
	public Game() {
		spaceship = new SpaceShip();
		alien = new Alien(50, 50);
		maze = new Maze(spaceship);
		this.getContentPane().add(maze);
		this.addKeyListener(this);
	}
	
	public int getSpaceShipXCord() {
		return spaceship.getPosX();
	}
	public int getSpaceShipYCord() {
		return spaceship.getPosY();
	}
	
	public void startTimer() {
		Timer timer = new Timer(100,this);
		timer.start();
	}
	
	public void actionPerformed(ActionEvent e) {

		maze.repaint();
	}
	
	public static void main(String[] args) {
		Game win = new Game();
		win.setSize(420, 500);
		win.setVisible(true);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.startTimer();
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		int keyCode = e.getKeyCode();
		switch(keyCode) {
		case KeyEvent.VK_LEFT: spaceship.left(); break;
		case KeyEvent.VK_RIGHT: spaceship.right(); break;
		case KeyEvent.VK_SPACE: spaceship.shoot(); break;
		}
	}
	
	@Override
	public void keyTyped(KeyEvent e) {}
	
	@Override
	public void keyPressed(KeyEvent e) {}
}

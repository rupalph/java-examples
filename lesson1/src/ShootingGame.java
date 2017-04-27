package game;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;


public class ShootingGame extends JFrame {
	public static void main(String[] args) {
		ShootingGame panel = new ShootingGame();
	}
	public ShootingGame(){
		super("Game");
		this.setSize(500, 525);
		GamePanel content = new GamePanel();
		this.getContentPane().add(content);
		//window.pack();
		//window.setResizable(false);
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		this.setVisible(true);
		content.requestFocus();
	}
}
class GamePanel extends JPanel implements  KeyListener {
	private Timer bulletTimer, targetTimer,messageTimer;
	private FireBullet fireBullet;
	private Target target;
	private MessageAction messageAction;

	private String message="";
	private final int UP=0,DOWN=1,RIGHT=2;
	private int targetX=450, targetY=0;
	private int x=0,y=250;
	private int score=0;
	public GamePanel() {
		/*
		 * Implement logic
		 */
	}
	public void paintComponent(Graphics g){	
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawString(""+score, 458, 12);
		
		g.fillRect(0, 250, 5, 15);
		
		g.setColor(Color.red);
		g.fillOval(x, y, 16, 16);
		
		g.setColor(Color.green);
		g.fillRoundRect(targetX, targetY, 15, 45, 3, 3);
		
		//TODO Implement logic
		
	}
	
	class MessageAction implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("message timer expired!");
			message="";
			messageTimer.stop();
			repaint();
			grabFocus();
		}
	}
	class FireBullet implements ActionListener{
     	private int direction;
     	public FireBullet(){
     		this.direction=0;
     	}
		public void actionPerformed(ActionEvent e) {
			//TODO Implement logic
		}
		public void setDirection(int dir) {
			direction=dir;
			
		}
	}
	class Target implements ActionListener{
     	public Target(){
     	}
		public void actionPerformed(ActionEvent e) {
			//TODO Implement logic
		}
		
	}
	
	public void keyTyped(KeyEvent e) {}
	public void keyPressed(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {
		//TODO Implement logic
	}  


}

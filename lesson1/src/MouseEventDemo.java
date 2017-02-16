import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * 
 * Extend this to add KeyListener to move the shape based on arrow key up/down.
 *
 */
public class MouseEventDemo 
{
	JFrame frame;
	DisplayBox panel;

	public static void main (String[] args) 
	{
		MouseEventDemo bs = new MouseEventDemo();
		bs.render();
	}

	public void render() 
	{
		frame = new JFrame("Mouse Event Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create JPanel and add to frame
		panel = new DisplayBox();
		frame.getContentPane().add(panel, BorderLayout.CENTER);	// add panel to frame

		frame.setSize(500, 500);		// explicitly set size in pixels
		frame.setVisible(true);		// set to false to make invisible
		panel.requestFocus(true);
	}
}


class DisplayBox extends JPanel implements MouseListener
{
	int x = 50;
	int y = 50;
	DisplayBox() 
	{
		setBackground(Color.gray);
		this.setFocusable(true);
		this.addMouseListener(this);
	}


	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		g.setColor(Color.green);
		g.fillPolygon(new int[] {x-50, x, x+50}, new int[] {y+50, y-50, y+50}, 3);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Mouse click"+e.getX()+" "+e.getY());

	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Mouse Pressed"+e.getX()+" "+e.getY());

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Mouse Release:"+e.getX()+" "+e.getY());
		x=e.getX();
		y=e.getY();
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse Entered:"+e.getX()+" "+e.getY());

	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Mouse Exited:"+e.getX()+" "+e.getY());

	}

}

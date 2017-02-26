/**
 * Complete TODO parts.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawShapes 
{
	JFrame frame;
	DisplayStamp canvas;
  
	public static void main(String[] args) 
	{
		DrawShapes ss = new DrawShapes();
		ss.Run();
	}
  
 	public void Run() 
	{
		// Create a frame to hold everything
		frame = new JFrame ("Draw Shapes");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setBackground(Color.black);	// only needed if frame is larger than panel
		
		// Define panel to draw on
		canvas = new DisplayStamp();		// create a panel to draw on
		canvas.setBackground(Color.lightGray);
		frame.addMouseListener(canvas);	// connects the MouseListerner to the panel window
		
		// Put frame together
		frame.getContentPane().add(canvas);	// puts panel on frame
		frame.setVisible(true);
	}
} // end class SimpleStamper

class DisplayStamp extends JPanel implements MouseListener 
{
	DisplayStamp() 
	{
		setBackground(Color.black);
		addMouseListener(this);
	}

	public void mousePressed(MouseEvent evt) 
	{
		

		int x = evt.getX();
		int y = evt.getY();

		Graphics g = getGraphics();

		//TODO draw shape		
        
	} // end mousePressed();

	public void mouseEntered(MouseEvent evt) { }
	public void mouseExited(MouseEvent evt) { }
	public void mouseClicked(MouseEvent evt) { }
	public void mouseReleased(MouseEvent evt) { }

	//TODO draw oval when o is pressed, rectangle when r is pressed.
	//Location is where user clicks mouse on the canvas, 
	//pick size and color or shape as per your wish.
	//hint: implements KeyListener VK_R and VK_O
}

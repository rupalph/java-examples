
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.JTextComponent;
 
public class GreetingWithLayout {
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Greeting with layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
       
        frame.getContentPane().add(new DisplayPanel(10,10), BorderLayout.CENTER);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    
    
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

class DisplayPanel extends JPanel  {
    private JTextField textField =new JTextField();
    private int x, y;
    private String message="";
    private boolean paintLabel=false;
    private Image image;

	public DisplayPanel(int x,int y){
		super();
        this.setBackground(new Color(248, 213, 131));
        this.setPreferredSize(new Dimension(500, 1500));
        
        this.x=x;
        this.y=y;
        this.setLayout(null);
        //Image image=null;
		try {
			image = ImageIO.read(new File("flower.jpeg"));
			//ImageIcon imgIcon=new ImageIcon(image);
			//JLabel img = new JLabel(imgIcon);
	        //img.setBounds(100, 100,imgIcon.getIconWidth(),imgIcon.getIconHeight());
	        //this.add(img);
		} catch (IOException e) {
			e.printStackTrace();
		}
       

	}
	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g);		
		int cellWidth = 200;
		int cellHeight = 100;
		int padding =10;
		
			g.drawImage(image,
                0,0,
                this);
		
	}
	
	
	
	
}




import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.JTextComponent;
 
/* TopLevelDemo.java requires no other files. */
public class Greeting {
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("TopLevelDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
       
        frame.getContentPane().add(new PaintPanel(), BorderLayout.CENTER);

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

class PaintPanel extends JPanel  {
    private JTextField textField =new JTextField();
    private int x, y;
    private String message="";
    private boolean paintLabel=false;
	public PaintPanel(){
		super();
        this.setBackground(new Color(248, 213, 131));
        this.setPreferredSize(new Dimension(500, 500));
        this.setLayout(null);
        Image image=null;
		
		//TODO Read and load image file

		
        textField.setBounds(150, 460, 200, 20);
        textField.setEditable(true);
		this.add(textField);

	}
	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g);		
		g.setFont(new Font("TimesRoman", Font.BOLD, 14)); 
		g.setColor(Color.red);	
		//TODO draw image and message below the image
		
	}
	
	//TODO implement MouseMotionListener and MouseListener to move image and text around on the panel.
	
}


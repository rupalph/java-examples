import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;


public class LayoutDemo {
	private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("My layout demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setLayout(new BorderLayout(50,50));
        Container container=frame.getContentPane();
        container.add(new LayoutPanel(), BorderLayout.CENTER);
        container.add(new JLabel("My layout .."),BorderLayout.NORTH);
        container.add(new JLabel("------------"),BorderLayout.SOUTH);
        container.add(new JLabel("*"),BorderLayout.EAST);
        container.add(new JLabel("*"),BorderLayout.WEST);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
	
	public static void main(String[] args){
		createAndShowGUI();
	}
}
class LayoutPanel extends JPanel {
	
	JTextField field1,field2;
	JButton button;
	JLabel label1,label2;
	public LayoutPanel() {
		field1=new JTextField();
		field2=new JTextField();
		button=new JButton("Click me");
		label1=new JLabel("Enter name");
		label2=new JLabel("Enter message");
		this.setLayout(new GridLayout(3,2));
		
		this.add(label1);
		this.add(field1);
		this.add(label2);
		this.add(field2);
		this.add(button);
		
	}
	
}

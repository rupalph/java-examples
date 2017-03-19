/*
   A RGBColorChooser shows three sliders that the user can manipulate
   to set the red, green, and blue, components of a color.  A color patch
   shows the selected color, and there are three labels that show the numerical
   values of all the components.  Values are in the range 0 to 255.
   The initial color is black.
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class RGBColorChooser extends JApplet 
                       implements ChangeListener 
{
   
   private JSlider redSlider, greenSlider, blueSlider;   
              // For setting the color.
   
   private JLabel redLabel, greenLabel, blueLabel;  
              // For displaying RGB values.
                 
   private JPanel colorPatch;  
              // Color patch for displaying the color.
                 

   public void init() 
   {
   
       /* Create JSliders with possible values from 0 to 255. */
       
       redSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
       greenSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
       blueSlider = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
       
       /* Create JLabels showing current RGB and HSB values. */
       
       redLabel = new JLabel(" R = 0");
       //TODO Blue and green labels

       
       /* Set the colors of the labels, and make them opaque */
       
       
       redLabel.setBackground(Color.white);
       redLabel.setForeground(Color.red);
       redLabel.setOpaque(true);
       //TODO Blue and green labels
       
       /* Set the applet to listen for changes to the JSliders' values */
       
       redSlider.addChangeListener(this);
       //blue/green slider
       
       /* Create a JPanel whose background color will always be set to the
          currently selected color.  Otherwise, the panel is empty. */
       
       colorPatch = new JPanel();
       colorPatch.setBackground(Color.black);
       
       /* Create the applet layout, which consists of a row of
          three equal-sized regions holding the JSliders,
          the Labels, and the color patch.  The background color
          of the applet is gray, which will show around the edges
          and between components. */
       
       setBackground(Color.gray);
       getContentPane().setBackground(Color.gray);

       getContentPane().setLayout(new GridLayout(1,3,3,3));
       JPanel scrolls = new JPanel();
       JPanel labels = new JPanel();
       scrolls.setBackground(Color.gray);
       labels.setBackground(Color.gray);
       getContentPane().add(scrolls);
       getContentPane().add(labels);
       getContentPane().add(colorPatch);
       
       /* Add the JSliders and the JLabels to their respective panels. */
       
       scrolls.setLayout(new GridLayout(3,1,2,2));
       scrolls.add(redSlider);
       //TODO add sliders
       
       labels.setLayout(new GridLayout(3,1,2,2));
       labels.add(redLabel);
       //TODO add sliders
       
   } // end init();
   

   public void stateChanged(ChangeEvent evt) 
   {
           // This is called when the user has changed the value on
           // one of the sliders.  All the sliders are checked,
           // the labels are set to display the correct values,
           // and the color patch is set to correspond to the new color.
       //TODO implement state changed
   } // end stateChanged

   
   public Insets getInsets() 
   {
          // The system calls this method to find out how much space to
          // leave between the edges of the applet and the components that
          // it contains.  I want a 3-pixel border at each edge.
      return new Insets(3,3,3,3);
   }
   
}  // end class RGBColorChooser

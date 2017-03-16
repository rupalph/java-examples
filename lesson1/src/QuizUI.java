import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;



public class QuizUI extends JFrame{
	public QuizUI() {
		//Create and set up the window.
		//JFrame frame = new JFrame("Greeting with layout");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

		this.getContentPane().add(new DisplayQuizPanel(10,10), BorderLayout.CENTER);

		//Display the window.
		this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args){
		QuizUI ui=new QuizUI();
	}

}
class DisplayQuizPanel extends JPanel implements ActionListener {

	public DisplayQuizPanel(int x,int y){
		super();
		this.setBackground(new Color(248, 213, 131));
		this.setPreferredSize(new Dimension(500, 500));
		this.setLayout(new BorderLayout());
		JPanel questionPanel =new JPanel();
		questionPanel.setLayout(new GridLayout(5,1,10,10));
		String[] options={"Red","Blue","Yellow"};
		questionPanel.add(createQuestionPanel("What is color of apple?",options));
		
		JButton next=new JButton("Next");
		add(next,BorderLayout.SOUTH);
		
		String[] options2={"2","20","45"};
		questionPanel.add(createQuestionPanel("9*5?",options2));
		
		add(questionPanel);
	}
	private JPanel createQuestionPanel(String question,String[] options)
	{
		ButtonGroup group = new ButtonGroup();

		JPanel panel1=new JPanel();
		panel1.setLayout(new GridLayout(4,1));
		JLabel label = new JLabel(question);
		panel1.add(label);

		for(int i=0;i<options.length;i++) {
			JRadioButton option1 = new JRadioButton(options[i]);

			option1.addActionListener(this);
			group.add(option1);
			panel1.add(option1);
		}



		return panel1;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}

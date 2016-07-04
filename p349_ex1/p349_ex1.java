//*********************************
//NAME: Rogger Matamoros
//DATE: 10/28/10 
//ASSIGNMENT: Page 349 Exercise 1
//*********************************

import javax.swing.* ;
import java.awt.* ;
import java.awt.event.*;

public class p349_ex1 extends JFrame
{
	private JButton computeB = new JButton("Calculate");
	private JButton nextB = new JButton("Next");
	private JButton clearB = new JButton("Clear");
	private JButton exitB = new JButton("Exit");
	private JLabel label1= new JLabel("Test Score:   ", SwingConstants.RIGHT);
	private JLabel avgL = new JLabel("Score Average:   ", SwingConstants.RIGHT);
	private JLabel weightL = new JLabel("Weight:   ", SwingConstants.RIGHT);
	private JTextField scoresTF = new JTextField("  enter score", 10);
	private JTextField avgTF = new JTextField("  average", 10);
	private JTextField weightTF = new JTextField("  enter weights", 10);
	
	private ComputeButtHandler cbHandler;
	private nextButtHandler nbHandler;
	private exitButtHandler ebHandler;
	private clearButtHandler clbHandler;
	
	static int score = 0;
	static double avg = 0.0, weight = 0.0, sum = 0.0;
	
	public p349_ex1()
	{
	;
		
		//Layout, etc
		Container pane = getContentPane();
		pane.setLayout(new GridLayout(5, 2));
		pane.add(label1);
		pane.add(scoresTF);
		pane.add(weightL);
		pane.add(weightTF);
		pane.add(computeB);
		pane.add(nextB);
		pane.add(avgL);
		pane.add(avgTF);
		pane.add(clearB);
		pane.add(exitB);
		
		setTitle("Average of Test Scores");
		setSize(480, 320);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
		
		//Handler Declarations
		cbHandler = new ComputeButtHandler();
		computeB.addActionListener(cbHandler);
		
		nbHandler = new nextButtHandler();
		nextB.addActionListener(nbHandler);
		
		ebHandler = new exitButtHandler();
		exitB.addActionListener(ebHandler);
		
		clbHandler = new clearButtHandler();
		clearB.addActionListener(clbHandler);
	}
	//Handlers
	private class ComputeButtHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			avgTF.setText("" + sum);
		}
	}
	private class nextButtHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			score = Integer.parseInt(scoresTF.getText());
			scoresTF.setText("");
			weight = Double.parseDouble(weightTF.getText());
			weightTF.setText("");
			sum += score * weight;
		}
	}
	private class exitButtHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}
	private class clearButtHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			avgTF.setText("");
			sum = 0;
			avgTF.setText("0");
			scoresTF.setText("  enter scores");
			weightTF.setText("  enter weights");
		}
	}
	public static void main(String[] args)
	{
		p349_ex1 window1 = new p349_ex1();
	}
}

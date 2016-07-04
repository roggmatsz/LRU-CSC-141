//*********************************
//NAME: Rogger Matamoros
//DATE: 11/1/10
//ASSIGNMENT: Page 350 Exercise 5
//*********************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pg350_ex5 extends JFrame
{
	private JLabel str1L = new JLabel("Lowercase String");
	private JLabel str2L = new JLabel("Uppercase String");
	private JTextField str1TF = new JTextField("enter string", 10);
	private JTextField str2TF = new JTextField("enter string", 10);
	private JButton strB = new JButton("Uppercase It");
	private JButton exitB = new JButton("Exit");
	
	private UpperButtHandler ubHandler;
	private exitButtHandler ebHandler;
	
	static String str1, str2;
	
	public pg350_ex5()
	{
		setTitle("Lower to Uppercase");
		setSize(480, 320);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Layout, etc
		Container pane = getContentPane();
		pane.setLayout(new GridLayout(3, 2));
		pane.add(str1L);
		pane.add(str1TF);
		pane.add(str2L);
		pane.add(str2TF);
		pane.add(strB);
		pane.add(exitB);
		setVisible(true);
				
		//Handler Declarations
		ebHandler = new exitButtHandler();
		exitB.addActionListener(ebHandler);
		
		ubHandler = new UpperButtHandler();
		strB.addActionListener(ubHandler);
	}
	private class UpperButtHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			str1 = str1TF.getText();
			str2 = str1.toUpperCase();
			str2TF.setText("" + str2);
		}
	}
	private class exitButtHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}
	public static void main(String[] args)
	{
		pg350_ex5 window = new pg350_ex5();
	}
}

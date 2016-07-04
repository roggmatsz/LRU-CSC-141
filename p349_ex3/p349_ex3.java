//*************************************
//NAME: Rogger Matamoros
//DATE: 11/1/10
//ASSIGNMENT: Page 349 Exercise 3
//*************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p349_ex3 extends JFrame 
{
	private JLabel str1L = new JLabel("String 1");
	private JLabel str2L = new JLabel("String 2");
	private JLabel outputL = new JLabel("Largest String");
	private JTextField str1TF = new JTextField("enter string", 10);
	private JTextField str2TF = new JTextField("enter string", 10);
	private JTextField outputTF = new JTextField(10);
	private JButton strB = new JButton("Compare");
	private JButton exitB = new JButton("Exit");
	
	private CompareButtHandler cbHandler;
	private exitButtHandler ebHandler;
	
	static String str1, str2;
	static int result, size1, size2;
	
	public p349_ex3()
	{
		setTitle("Compare Strings");
		setSize(480, 320);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Layout, etc
		Container pane = getContentPane();
		pane.setLayout(new GridLayout(4, 2));
		pane.add(str1L);
		pane.add(str1TF);
		pane.add(str2L);
		pane.add(str2TF);
		pane.add(outputL);
		pane.add(outputTF);
		pane.add(strB);
		pane.add(exitB);
		setVisible(true);
		
		//Handler Declarations
		ebHandler = new exitButtHandler();
		exitB.addActionListener(ebHandler);
		
		cbHandler = new CompareButtHandler();
		strB.addActionListener(cbHandler);
	}
	//Handlers
	private class CompareButtHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			str1 = str1TF.getText();
			str2 = str2TF.getText();
			str1TF.setText("");
			str2TF.setText("");
			size1 = str1.length();
			size2 = str2.length();
			result = size1 - size2;
			if (result < 0)
				outputTF.setText("" + str2);
			else if (result == 0)
				outputTF.setText("" + "They're equal, dufus.. :-|");
			else if (result > 0)
				outputTF.setText("" + str1);
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
		p349_ex3 window = new p349_ex3();
	}
}

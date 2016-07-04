//*********************************
//NAME: Rogger Matamoros
//DATE: 11/3/10
//ASSIGNMENT: Page 350 Exercise 9
//*********************************

//Ye who I'm about to compile for, I salute you!

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p350_ex9 extends JFrame
{
	//Declare UI Elements
	private JLabel num1L = new JLabel("Number  ", SwingConstants.RIGHT);
	private JTextField num1TF = new JTextField(" enter integer number to convert", 2);
	private JLabel base1L = new JLabel("Base   " , SwingConstants.RIGHT);
	private JTextField base1TF = new JTextField(" enter source base");
	private JLabel base2L = new JLabel("Destination Base   ", SwingConstants.RIGHT);
	private JTextField base2TF = new JTextField(" enter dest. base");
	private JLabel resultL = new JLabel("Result   ", SwingConstants.RIGHT);
	private JTextField resultTF = new JTextField("resulting number, base");
	private JButton calcB = new JButton("Calculate");
	private JButton clearB = new JButton("Clear");
	//Declare Handler Functions (or something like that)
	private calcButtHandler cbHandler;
	private clearButtHandler clbHandler;
	//Declare Any Necessary Variables
	static int base, base2;
	static String str;
	//Define Appearace Function
	public p350_ex9()
	{
		setTitle("Base-Number Converter");
		setSize(480, 320);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Layout
		Container pane = getContentPane();
		pane.setLayout(new GridLayout(5, 2));
		pane.add(num1L);
		pane.add(num1TF);
		pane.add(base1L);
		pane.add(base1TF);
		pane.add(base2L);
		pane.add(base2TF);
		pane.add(resultL);
		pane.add(resultTF);
		pane.add(clearB);
		pane.add(calcB);
		setVisible(true);
		//Declare Event Listeners
		cbHandler = new calcButtHandler();
		calcB.addActionListener(cbHandler);

		clbHandler = new clearButtHandler();
		clearB.addActionListener(clbHandler);
	}
	//Define Handler Functions
	private class calcButtHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			str = num1TF.getText();
			base =  Integer.parseInt(base1TF.getText());
			base2 = Integer.parseInt(base2TF.getText());
			long loo = Long.parseLong(str, base);
			String str1 = Long.toString(loo, base2);
			resultTF.setText("" + str1);
		}
	}
	private class clearButtHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			num1TF.setText("  ");
			base2TF.setText("");
			base1TF.setText("");
			resultTF.setText("");
		}
	}
	public static void main(String[] args)
	{
		p350_ex9 window = new p350_ex9();
	}
}

//********************************
//NAME: Rogger Matamoros
//DATE: 11/2/10
//ASSIGNMENT: Page 350 Exercise 7
//********************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math.*;

public class p350_ex7 extends JFrame
{
	//Declare UI Elements
	private JLabel amtDepoL = new JLabel("Amount Deposited   ", SwingConstants.RIGHT);
	private JTextField amtDepoTF = new JTextField(" enter amount", 10);
	private JLabel yearsL = new JLabel("Years   ", SwingConstants.RIGHT);
	private JTextField yearsTF = new JTextField(" enter years", 10);
	private JLabel interRateL = new JLabel("Interest Rate   ", SwingConstants.RIGHT);
	private JTextField interRateTF = new JTextField(" enter interest rate", 10);
	private JLabel resultL = new JLabel("Amount Due   ", SwingConstants.RIGHT);
	private JTextField resultTF = new JTextField(" 0");
	private JButton calcB = new JButton("Calculate");
	private JButton clearB = new JButton("Clear");
	//Declare Handler Functions (or something like that)
	private calcButtHandler cbHandler;
	private clearButtHandler clbHandler;
	//Declare Any Necessary Variables
	static int amtDepo, years;
	static double interRate, result;
	static String str;
	//Define Appearance Function
	public p350_ex7()
	{
		setTitle("CD Maturity Calculator");
		setSize(480, 320);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Layout
		Container pane = getContentPane();
		pane.setLayout(new GridLayout(5, 2));
		pane.add(amtDepoL);
		pane.add(amtDepoTF);
		pane.add(yearsL);
		pane.add(yearsTF);
		pane.add(interRateL);
		pane.add(interRateTF);
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
			amtDepo = Integer.parseInt(amtDepoTF.getText());
			years = Integer.parseInt(yearsTF.getText());
			interRate = Double.parseDouble(interRateTF.getText());
			result = amtDepo * (Math.pow((1 + (interRate / 100)), years));
			resultTF.setText("  " + String.format("%.2f", result));
		}
	}
	private class clearButtHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			resultTF.setText("  " + 0);
			amtDepoTF.setText("");
			yearsTF.setText("");
			interRateTF.setText("");
		}
	}
	public static void main(String[] args)
	{
		p350_ex7 window = new p350_ex7();
	}
}

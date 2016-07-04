//**********************************
//NAME: Rogger Matamoros
//DATE: 11/10/10
//ASSIGNMENT: Page 421 Exercise 16
//**********************************

import java.util.*;
import java.io.*;
import java.lang.Math.*;

public class p421_ex16
{
	static char grade;
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner inFile = new Scanner(new FileReader("list.txt"));
		PrintWriter outFile = new PrintWriter("grades.out");
		double avg;
		String name;
		int x = 0;	
 		for (int i = 0 ; i <= 9 ; i++)
		{
			name = inFile.next();
			grade = calculateGrade(avg);
			x += 6 * i + 1;
			avg = calculateAvg(x);
			System.out.println(name + " - Average: " + avg + " Grade: " + grade);
			outFile.println(name + " - Average: " + avg + " Grade: " + grade);
			for (int k = 1 ; k <= 5 ; k++)
				inFile.next();
		}
	}
	public static double calculateAvg(int x) throws FileNotFoundException
	{
		Scanner inFile = new Scanner(new FileReader("list.txt"));
		double result = 0;
		int convNum, i;
		for (int j = 1; j <= x ; j++)
			inFile.next();
		for (i = 0; i < 5 ; i++)
		{
			convNum = Integer.parseInt(inFile.next());
			result += convNum;
		}
		return result / 5;
	}
	public static String calculateGrade(double x)
	{
		char grade;
		int y = (int) x;
		if ((y >= 90) && (y <= 100))
		{
			grade = 'A';
		}
		else if ((y >= 80) && (y <= 89))
		{
			grade = 'B';
		}
		else if ((y >= 70) && (y <= 79))
		{
			grade = 'C';
		}
		else if ((y >= 60) && (y <= 69))
		{
			grade = 'D';
		}
		else if ((y >= 0) && (y <= 59))
		{
			grade = 'F';
		}
	}
}
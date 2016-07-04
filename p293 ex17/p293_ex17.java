//**********************************
//NAME: Rogger Matamoros
//DATE: 10/13/10
//ASSIGNMENT: Page 293 Exercise 17
//**********************************

import java.io.*;
import java.util.* ;

public class p293_ex17 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner inFile = new Scanner(new FileReader("grades.txt"));
		double gpa, avgM = 0.0, avgF = 0.0;
		char gender;
		String str;
		int m = 0, f = 0;
		
		while (inFile.hasNext())
		{
			str = inFile.next();
			gender = str.charAt(0);
			if (gender == 'm')
			{
				avgM += inFile.nextDouble();
				m++;
			}
			else
			{
				avgF += inFile.nextDouble();
				f++;
			}
		}
		avgM /= m;
		avgF /= f;
		System.out.printf("The men's average GPA is: %.2f" 
						  + "\nThe women's average GPA is: %.2f\n", avgM, avgF);
	}
}

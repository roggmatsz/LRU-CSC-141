//*****************************************
//NAME: Rogger Matamoros
//DATE: 09/22/10
//ASSIGNMENT: Page 162 Exercise 2
//*****************************************

import java.util.*;

public class pg162_ex2 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
		double decimalNum;
		System.out.println("Enter a decimal number");
		decimalNum = console.nextDouble();
		
		System.out.printf("The number, when rounded to 2 decimal places, is: " + 
						  "%.2f", decimalNum);
		System.out.println();
	}
}

//*************************************
//NAME:Rogger Matamoros
//DATE:09/22/10
//ASSIGNMENT: Page 163 Exercise 5
//*************************************

import java.util.*;

public class pg163_ex5 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
		double tempCel, tempFar;
		
		System.out.println("Enter temperature in Celsius");
		tempCel = console.nextDouble();
		tempFar = (5.0 / 9.0) * (tempCel - 32.0);
		System.out.printf(tempCel + " Celsius, when converted to Farenheit, is: " + "%.2f"
						  , tempFar);
		System.out.println();
	}
}

//*********************************
//NAME: Rogger Matamoros
//DATE: 11/22/10
//ASSIGNMENT: Page 586 Exercise 2
//**********************************

import java.util.*;

public class p586_ex2 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
		int j = 1, fooRay[] = new int[5];
		System.out.println("\t\t---* Now Testing *---" +
						   "Enter 5 integer numbers");
		for (int i = 0; i < 5; i++)
		{
			System.out.println("Enter number " + j);
			fooRay[i] = console.nextInt();
			j += 1;
		}
		System.out.println("The index of the smallest number entered is array[" 
						   + (smallestIndex(fooRay, fooRay.length)) + "]");
	}
	public static int smallestIndex(int[] fooRay, int fooSize)
	{
		int smallest = fooRay[0], k = 0;
		for (int i = 0; i < fooSize; i++)
		{
			if (smallest > fooRay[i])
			{
				smallest = fooRay[i];
				k = i;
			}
		}
		return k;
	}
}

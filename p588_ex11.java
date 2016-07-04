//*********************************
//NAME: Rogger Matamoros
//DATE: 11/29/10
//ASSIGNMENT: Page 588 Exercise 11
//*********************************

import java.util.*;

public class p588_ex11 
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		//Given from the Problem
		int[][] inStock = new int[10][4];
		int[] alpha = new int[20];
		int[] beta = new int[20];
		int[] gamma = {11, 13, 15, 17};
		int[] delta = {3, 5, 2, 6, 10, 9, 7, 11, 1, 8};
		int selection;
		
		//Part G, H - Write statements that call all the methods and test them in a "program"
		System.out.println("Now running inputArray() *-------");
		inputArray(alpha);
		System.out.println("Result:\n");
		printArray(alpha);
		
		System.out.println("\n\nNow running doubleArray() *------");
		doubleArray(alpha, beta);
		System.out.println("Result:\n");
		printArray(beta);
		
		System.out.println("\n\nNow running copyGamma() *--------");
		copyGamma(inStock, gamma);
		System.out.println("Result:\n");
		for (int z = 0; z < inStock.length; z++)
		{
			for (int y = 0; y < 4; y++)
				System.out.printf(inStock[z][y] + " ");
		}
		System.out.println();
		
		System.out.println("\n\nNow running copyAlphaBeta() *----");
		copyAlphaBeta(inStock, alpha, beta);
		System.out.println("Choose an array to print: alpha (1), beta (2), gamma (3), delta (4)");
		selection = console.nextInt();
		switch (selection)
		{
			case (1):
				System.out.println("\n----* Now running printArray(alpha[]) *-----");
				printArray(alpha);
				break;
			case (2):
				System.out.println("\n----* Now running printArray(beta[]) *-----");
				printArray(beta);
				break;
			case (3):
				System.out.println("\n-----* Now running printArray(gamma[]) *-----");
				printArray(gamma);
				break;
			case (4):
				System.out.println("\n-----* Now running printArray(delta[]) *-----");
				printArray(delta);
				break;
			default:
				System.out.println("Wrong choice. printArray() will not run.");
				break;
		}
		System.out.println("\n\n-----* Now running setInStock(inStock[][]) *---------");
		setInStock(inStock, delta);
		System.out.println("Results:");
		for (int z = 0; z < inStock.length; z++)
		{
			for (int y = 0; y < 4; y++)
				System.out.printf(inStock[z][y] + " ");
		}
	}
		//Part A
	public static void inputArray(int alpha[])
	{
		System.out.println("Enter 20 numbers");
		Scanner console = new Scanner(System.in);
		for (int i = 0; i < 20; i++)
			alpha[i] = console.nextInt();
	}
		//Part B
	public static void doubleArray(int alpha[], int beta[])
	{
		for (int i = 0; i < beta.length; i++)
			beta[i] = 2 * alpha[i];
	}
		//Part C - Set elements of first row of inStock[][] to gamma[] and the remaining others
		//         of inStock[][] to 3 * the previous row of inStock[][]. -
	public static void copyGamma(int inStock[][], int gamma[])
	{
		for (int i = 0; i < 10; i++)
		{
			if (i == 0)
			{
				for (int j = 0; j < gamma.length; j++)
					inStock[i][j] = gamma[j];
			}
			else
			{
				for (int j = 0; j < 4; j++)
					inStock[i][j] = inStock[i - 1][j] * 3;
			}
		}
	}
		//Part D - Store alpha into the first 5 rows of inStock and beta into the last 5 rows of
		//         inStock. -
	public static void copyAlphaBeta(int inStock[][], int alpha[], int beta[])
	{
		//c counts the # of rows in inStock. d is the column number. i is the index of alpha
		int c = 0, d = 0;
		while (c < 5)
		{
			for (int i = 0; i < alpha.length; i++)
			{
				if (i % 4 == 0)
				{	
					c++;
					d = 0;
				}
				inStock[c][d] = alpha[i];
				d++;
			}
		}
		//k is the number of rows used in inStock; m is the number of columns used in inStock.
		//m is the increasing index of beta that is being copied into inStock.
		c = 5;
		d = 0;
		while (c < 5)
		{
			for (int i = 0; i < alpha.length; i++)
			{
				if (i % 4 == 0)
				{	
					c++;
					d = 0;
				}
				inStock[c][d] = beta[i];
				d++;
			}
		}
	}	
		//Part E - Prints any 1-D array of int type. 15 elements per line. -
	public static void printArray(int array[])
	{
		int counter = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (counter == 15)
				System.out.println();
			System.out.printf(array[i] + " ");
			counter++;
		}
	}
		//Part F - Prompt input for 1st column of instock[]. Set Remainding elements of
		//         columns = to 2x the corresponding elements of the previous column minus
		//         the corresponding element in delta. -
	public static void setInStock(int array[][], int delta[])
	{
		int i;
		Scanner console = new Scanner(System.in);
		System.out.println("Enter " + array.length + " numbers");
		for (i = 0; i < array.length; i++)
			array[i][0] = console.nextInt();
		for (i = 0; i < array.length; i++)
		{
			for (int j = 1; j < 4; j++)
				array[i][j] = array[i][0] * 2 - delta[i];
		}
		System.out.println();
	}					   
}

//************************************
//NAME: Rogger Matamoros
//DATE: 11/30/10
//ASSIGNMENT: Page 589 Exercise 12
//************************************

import java.util.*;

public class p589_ex12 
{
	public static void main(String[] args)
	{
		int index;
		int[][] yearTemp = new int[12][2];
		getData(yearTemp);
		index = indexHighTemp(yearTemp);
		System.out.printf("\nThe average high temperature was %.2f\n", (averageHighTemp(yearTemp)));
		System.out.printf("The average low temperature was %.2f\n", (averageLowTemp(yearTemp)));
		System.out.println("The highest temperature was " + yearTemp[index][0]);
		index = indexLowTemp(yearTemp);
		System.out.println("The lowest temperature was " + yearTemp[index][1]);
		
	}
	public static void getData(int[][] yearTemp)
	{
		System.out.println("Enter the lowest and highest monthly temps of the year");
		Scanner console = new Scanner(System.in);
		for (int i = 0; i < 12; i++)
		{
			System.out.println("Enter highest temperature of the month as integer");
			for (int j = 0; j < 2; j++)
			{	
				yearTemp[i][j] = console.nextInt();
				System.out.println("Enter lowest temp of the month as integer");
			}
		}
	}
	public static int indexHighTemp(int[][] yearTemp)
	{
		int greatest = yearTemp[0][0], greatIndex = 0;
		for (int i = 0; i < 12; i++)
		{
			if (greatest < yearTemp[i][0])
			{
				greatIndex = i;
			}
		}
		return greatIndex;
	}
	public static int indexLowTemp(int[][] yearTemp)
	{
		int lowest = yearTemp[0][1], lowIndex = 0;
		for (int i = 0; i < 12; i++)
		{
			if (lowest > yearTemp[i][1])
				lowIndex = i;
		}
		return lowIndex;
	}		
	public static double averageHighTemp(int[][] yearTemp)
	{
		int avg = 0;
		for (int i = 0; i < 12; i++)
			avg += yearTemp[i][0];
		return avg / 12;
	}
	public static double averageLowTemp(int[][] yearTemp)
	{
		int avg = 0;
		for (int i = 0; i < 12; i++)
			avg += yearTemp[i][1];
		return avg / 12;
	}
}

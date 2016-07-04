//*************************************
//NAME: Rogger Matamoros
//DATE: 11/15/10
//ASSIGNMENT: Page 424 Exercise 18
//*************************************

import java.util.*;

public class p424_ex18 
{
	static int riverWidth,  distance, costUnder, costOver;
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
		
		System.out.println("Enter integer Width of River in miles");
		riverWidth = console.nextInt();
		System.out.println("Enter integerDistance from Factory to the other side of River in miles");
		distance = console.nextInt();
		System.out.println("Enter integer Cost of underwater power line in miles");
		costUnder = console.nextInt();
		System.out.println("Enter integer cost of overland powerline in miles");
		costOver = console.nextInt();
		
		System.out.println("The length of the powerline underwater: " + (powerLengthUnder(riverWidth))
						   + "\nLenght of the powerline overland: $" + (powerLengthOver(distance)) + " per foot"
						   + "\nTotal cost: $" + (totalCost(powerLengthUnder(riverWidth), powerLengthOver(distance))) + " per foot");
	}
	public static int powerLengthUnder(int riverWidth)
	{
		final int FEETINMILES = 5280;
		return riverWidth * FEETINMILES;
	}
	public static int powerLengthOver(int distance)
	{
		final int FEETINMILES = 5280;
		return distance * FEETINMILES;
	}
	public static int totalCost(int x, int y)
	{
		return (x * costUnder) + (y + costOver);
	}
}

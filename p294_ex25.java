//**********************************
//NAME: Rogger Matamoros
//DATE: 10/20/10
//ASSIGNMENT: Page 294 Exercise 25
//**********************************

import java.util.*;

public class p294_ex25 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
		int units, rent, markup, maint, max = 0, i, profit;
		
		System.out.println("Enter number of apartment units");
		units = console.nextInt();
		System.out.println("Enter the rent to occupy all units");
		rent = console.nextInt();
		System.out.println("Enter the increase in rent per vacant unit");
		markup = console.nextInt();
		System.out.println("Enter maintenance cost per rented unit");
		maint = console.nextInt();
		
		for (i = 0; i <= 50; i++)
		{
			profit = ((rent + (40 * i)) * (units - i)) - (maint * i);
			if (profit == 41781)
			{
				max = i;
				i = 51;
			}
			
		}
		System.out.println("Max profit is attained when " + max + " units are rented.");
	}
}

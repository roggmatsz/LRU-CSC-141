//***********************************
//NAME: Rogger Matamoros
//DATE: 10/21/10
//ASSIGNMENT: Page 292 Exercise 5
//***********************************

import java.util.*;
import java.lang.Math.*;

public class p292_ex15 
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		int diff, guess, t;
		final int NUM = 66;
		boolean flag = true;
		
		System.out.println("This is a guessing game. You're looking for a number between "
						   + "0 and 100");
		for (t = 1; t <=5; t++)
		{
			System.out.println("Enter your guess:");
			guess = console.nextInt();
			diff = Math.abs(NUM - guess);
			if (guess == NUM)
			{
				t = 6;
				System.out.println("The guess is correct!");
			}
			if (diff >= 50)
			{
				if (guess > NUM)
					System.out.println("The guess is very high.");
				else
					System.out.println("The guess is very low.");
			}
			else if ((diff >= 30) && (diff < 50))
			{
				if (guess > NUM)
					System.out.println("The guess is high.");
				else
					System.out.println("The guess is low.");
			}
			else if ((diff >= 15) && (diff < 30))
			{
				if (guess > NUM)
					System.out.println("The guess is moderately high.");
				else
					System.out.println("The guess is moderately low.");
			}
			else if((diff > 0) && (diff < 15))
			{
				if (guess > NUM)
					System.out.println("The guess is somewhat high.");
				else
					System.out.println("The guess is somewhat low.");
			}
		}
	}
}

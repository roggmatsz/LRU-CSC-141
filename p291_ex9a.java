//********************************
//NAME: Rogger Matamoros
//DATE: 10/20/10  
//ASSIGNMENT: Page 291 Exercise 9
//********************************

import java.util.*;

public class p291_ex9a 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
		int firstNum = 0, secondNum = 0, oddNum = 0, evenNum = 0, evenNumSum = 0, squ = 0, 
		squ2 = 0;
		boolean f1 = false;
		
		while (f1 != true)
		{
			System.out.println("Enter first number");
			firstNum = console.nextInt();
			System.out.println("Enter second number");
			secondNum = console.nextInt();
			if (firstNum < secondNum)
				f1 = true;
		}
		
		System.out.println();
		System.out.println("Odd numbers between " + firstNum + " and " + secondNum + " inclusive"
						   + "\n" + firstNum);
		oddNum = firstNum;
		while (oddNum < secondNum)
		{
			if ((secondNum % firstNum == 0) || ((secondNum % firstNum) % 2 == 0))
			{
				oddNum += 2;
				System.out.println(oddNum + " ");
			}
			else 
				oddNum += 1;
		}
		
		System.out.println();
		System.out.println("Sum of even numbers between " + firstNum + " and " + secondNum);
		evenNum = firstNum;
		while (evenNum < secondNum)
		{
			if ((secondNum % firstNum == 0) || ((secondNum % firstNum) % 2 == 0))
			{
				evenNum += 2;
				evenNumSum += evenNum;
			}
			else
				evenNum +=1;
		}
		System.out.println("Sum = " + evenNumSum);
		
		System.out.println();
		System.out.println("The Numbers 1-10 and their squares");
		while (squ < 10)
		{
			squ += 1;
			squ2 = (squ * squ);
			System.out.println(squ + " squared = " + squ2);
		}
			
		System.out.println();
		System.out.println("The sums of the squares of the odd #'s between " + firstNum 
						   + " and " + secondNum);
		oddNum = firstNum;
		while (oddNum < secondNum)
		{
			if ((secondNum % firstNum == 0) || ((secondNum % oddNum) % 2 == 0))
			{
				oddNum += 2;
				squ = oddNum * oddNum;
				squ2 += squ;
			}
			else 
				oddNum += 1;
		}
		System.out.println("Sum = " + squ2);
	}
}

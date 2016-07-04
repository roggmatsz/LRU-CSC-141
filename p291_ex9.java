//**********************************
//NAME: Rogger Matamoros
//DATE: 10/13/10 
//ASSIGNMENT: Page 291 Exercise 9
//**********************************

import java.util.* ;

public class p291_ex9 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
		int firstNum, secondNum, oddNum = 0, evenNum = 0;
		boolean flag = true;
		String str;
		char ch;
		
		while (flag == true)
		{
			System.out.println("Enter first number");
			firstNum = console.nextInt();
			System.out.println("Enter second number");
			secondNum = console.nextInt();
			
			while ((oddNum < secondNum))
			{
				oddNum = firstNum;
				if ((secondNum % oddNum == 0) && ((secondNum / oddNum) % 2 != 0))
				{
					oddNum += 2;
					System.out.println(oddNum + " ");
				}
				else 
					oddNum += 1;
			}
			while (evenNum < secondNum)
			{
				if ((secondNum % evenNum == 0) && ((secondNum % evenNum) % 2 == 0))
				{
					evenNum += 2;
					System.out.printf(evenNum + " ");
				}
				else 
					evenNum += 1;
			}
			System.out.println("Would you like to continue? (y or n)");
			str = console.next();
			ch = str.charAt(0);
			if (ch == 'f')
				flag = false;
			}
				
		}			
	}

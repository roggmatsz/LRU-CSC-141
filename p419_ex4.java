//**************************************
//NAME: Rogger Matamoros
//DATE: 11/7/10
//ASSIGNMENT: Page 419 Exercise 4
//**************************************

import java.util.*;

public class p419_ex4 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
		int num;
		System.out.println("\t\t--* Now Testing the method reverseInt() *--" +
						   "\nEnter a number to be reversed");
		num = console.nextInt();
		System.out.println("The result is " + (reverseDigit(num)));
	}
	public static int reverseDigit(int num)
	{
		String str, str1 = "";
		int result, j;
		char a;
		str = Integer.toString(num);
		j = str.length();
		str = Integer.toString(num);
		for (int i = j - 1; i >= 0; i--)
		{
			a = str.charAt(i);
			str1 += a;
		}
			result = Integer.parseInt(str1);
		return result;
	}
}

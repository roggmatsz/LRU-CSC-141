//*******************************************
//NAME: Rogger Matamoros
//DATE: 11/7/10  
//ASSIGNMENT: Page 418 Exercise 3
//*******************************************

import java.util.*;

public class p418_ex3 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
		int num, x, y;
		double dec, a;
		System.out.println("\t\t--* Now testing method one() *-- \n" +
						   "Enter an integer number");
		x = console.nextInt();
		System.out.println("Enter another integer number");
		y = console.nextInt();
		System.out.println("The output of method one() is " + (one(x, y)) + "\n\n" +
						   "\t\t--* Now testing method two() *-- \n" +
						   "Enter an integer number");
		x = console.nextInt();
		System.out.println("Enter a parameter decimal number");
		a = console.nextDouble();
		dec = two(x, a);
		System.out.println("The output of method two() is " + dec);
	}
	public static int one(int x, int y)
	{
	if (x > y)
		return x + y;
	else
		return (x - 2) * y;
	}
	public static double two(int x, double a)
	{
		int first = one(6, 8);
		System.out.println("Enter a decimal number");
		double z = console.nextDouble();
		z += a;
		first += x;
		if (z > (2 * first))
			return z;
		else
			return 2 * first - z;
	}
}

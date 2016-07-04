//********************************
//NAME: Rogger Matamoros
//DATE: 10/6/10
//ASSIGNMENT: p221 exercise 4
//*****************************  

import java.io.*;
import java.util.* ;
import java.lang.Math.*;
public class p221_ex4 
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		double a, b, c;
		
		System.out.println("Enter the first side of the triangle");
		a = console.nextDouble();
		System.out.println("Enter the second side of the triangle");
		b = console.nextDouble();
		System.out.println("Enter the third side of the triangle");
		c = console.nextDouble();
		
		c = Math.pow(c, 2);
		a = Math.pow(a, 2);
		b = Math.pow(b, 2);
		
		if (c == (a + b))
			System.out.println("The triangle IS a right triangle");
		else
			System.out.println("The triangle IS NOT a right triangle");
	}
		
}

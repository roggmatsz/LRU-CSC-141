//********************************
//NAME: Rogger Matamoros
//DATE: 11/7/10
//ASSIGNMENT: Page 419 Exercise 7
//*********************************

import java.util.*;
import java.lang.Math.*;

public class p419_ex7 
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
		int x, x1, y, y1, j;
		String foo;
		System.out.println("\t\t---* (Nearly) All Things Circle App *---\n\n" +
						   "Enter the integer coordinates of the center of the circle (Ex. 3,2)");
		foo = console.next();
		j = foo.indexOf(',');
		x = Integer.parseInt(foo.substring(j + 1));
		y = Integer.parseInt(foo.substring(0, j));
		System.out.println("Enter the integer coordinates of a point on the circle (Ex. 3,2)");
		foo = console.next();
		x1 = Integer.parseInt(foo.substring(j + 1));
		y1 = Integer.parseInt(foo.substring(0, j));
		
		System.out.printf("\nDiameter: %.2f" + "\nRadius: %.2f" + "\nCircumference: %.2f" +
						  "\nArea: %.2f\n", (2 * (distance(x, x1, y, y1))), 
						  (radius(x, x1, y, y1)), (circumference(radius(x, x1, y, y1))), 
						  (area(radius(x, x1, y, y1))));
	}
	public static double distance(int x, int x1, int y, int y1)
	{
		return Math.sqrt(Math.pow((x1 - x), 2) + Math.pow((y1 - y), 2));
	}
	public static double radius(int x, int x1, int y, int y1)
	{
		return distance(x, x1, y, y1);
	}
	public static double circumference(double r)
	{
		return 2 * 3.1416 * r;
	}
	public static double area(double r)
	{
		return 3.1416 * r * r;
	}
}

//**********************************
//NAME: Rogger Matamoros
//DATE: 09/27/10
//ASSIGNMENT: Page 161 Exercise 1
//**********************************

import java.io.* ;
import java.util.* ;
import java.math.* ;

public class p161_ex1 
{	
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner inFile = new Scanner(new FileReader("inData.txt"));
		PrintWriter outFile = new PrintWriter("outFile.dat");
		
		double length, width, radius, area, perimetre, circumference, interestRate, 
			   balanceFinal;
		int balance, age;
		String name, ch ;
		final double PI = 3.1416;
		length = inFile.nextDouble();
		width = inFile.nextDouble();
		radius = inFile.nextDouble();
		name = inFile.next();
		age	 = inFile.nextInt();
		balance = inFile.nextInt();
		interestRate = inFile.nextDouble();
		ch = inFile.next();
		
		//Rectangle
		area = length * width ; 
		perimetre = (2 * length) + (2 * width);
		System.out.printf("Rectangle:%n" + "length = " + length + ", width = " + width +
						  ", area = %.2f" + ", perimetre = %.2f" + "%n", area, perimetre);
		outFile.printf("Rectangle:%n" + "length = " + length + ", width = " + width +
					   ", area = %.2f" + ", perimetre = %.2f" + "%n", area, perimetre);
		System.out.println();
		outFile.println();
		
		//Circle
		area = PI * Math.pow(radius, 2);
		circumference = 2 * PI * radius ; 
		System.out.printf("Circle:%n" + "Radius = " + radius + ", area = %.2f" +	
						  ", circumference = %.2f" + "%n", area, circumference);
		outFile.printf("Circle:%n" + "Radius = " + radius + ", area = %.2f" +	
					   ", circumference = %.2f" + "%n", area, circumference);
		System.out.println();
		outFile.println();
		
		//Name + Balance
		System.out.printf("Name: " + name + ", age: " + age + "%n");
		outFile.printf("Name: " + name + ", age: " + age + "%n");
		
		balanceFinal = balance * (1 + (interestRate / 100)) ;
		System.out.printf("Beginning Balance = " + balance + ", interest rate = " + 
						  interestRate + "%n" + "Balance at the end of the month = " + 
						  balanceFinal + "%n%n");
		outFile.printf("Beginning Balance = " + balance + ", interest rate = " + 
					   interestRate + "%n" + "Balance at the end of the month = " + 
					   balanceFinal + "%n%n");
		
		System.out.printf("The character that comes after A in the ASCII set is " + ch + "%n");
		outFile.printf("The character that comes after A in the ASCII set is " + ch);
		System.out.println();
		
		inFile.close();
		outFile.close();
	}
}

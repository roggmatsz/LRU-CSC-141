//********************************
//NAME: Rogger Matamoros
//DATE: 09/09/10
//ASSIGNMENT: Pg. 106 Exercise 18
//********************************

import java.util.* ;

public class p106_ex18 
{
	static Scanner console = new Scanner(System.in);
	static double hourlyRate, clothes, supplies, savBonds, hoursWorked, taxedIncome, income ;
	public static void main(String[] args)
	{
		System.out.println("Enter your hourly pay rate");
		hourlyRate = console.nextDouble();
		System.out.println("Enter the number of hours worked per week");
		hoursWorked = console.nextDouble();
		taxedIncome = hourlyRate * hoursWorked ;
		income = tasxedIncome - (taxedIncome * 0.14) ;
		clothes = (income * 0.1) ;
		supplies = (int) (((income * 0.9) * 0.01) + 0.5) ;
		savBonds = (int) (((income * 0.89) * 0.25) + 0.5) ;
		
		System.out.println("Income before taxes: " + taxedIncome +
						   "\nIncome after taxes: " + income +
						   "\nIncome spent on clothes and other accessories: " + clothes +
						   "\nIncome spent on school supplies: " + supplies +
						   "\nIncome spent on savings bonds: " + savBonds +
						   "\nIncome parents spend on savings bonds: " + (savBonds * 0.5)
						   );
	}
}
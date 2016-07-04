//*********************************
//NAME: Rogger Matamoros
//DATE: 09/28/10
//ASSIGNMENT: Page 163 Exercise 7
//*********************************

import java.io.*;
import java.util.*;

public class p163_ex7 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner inFile = new Scanner(new FileReader("payroll.txt"));
		PrintWriter outFile = new PrintWriter("Ch3_Ex7Output.dat");
		
		String firstName, lastName;
		double salary, percentIncrease, updatedSalary;
		
		
		lastName = inFile.next();
		firstName = inFile.next();
		salary = inFile.nextDouble();
		percentIncrease = inFile.nextDouble();
		updatedSalary = salary * ((percentIncrease / 100) + 1);
		System.out.printf(firstName + " " + lastName + ":\t $ %.2f", updatedSalary);
		outFile.printf(firstName + " " + lastName + ":\t $ %.2f", updatedSalary);
	
		lastName = inFile.next();
		firstName = inFile.next();
		salary = inFile.nextDouble();
		percentIncrease = inFile.nextDouble();
		updatedSalary = salary * ((percentIncrease / 100) + 1);
		System.out.printf("%n" + firstName + " " + lastName + ":\t $ %.2f", updatedSalary);
		outFile.printf("%n" + firstName + " " + lastName + ":\t $ %.2f", updatedSalary);
		
		lastName = inFile.next();
		firstName = inFile.next();
		salary = inFile.nextDouble();
		percentIncrease = inFile.nextDouble();
		updatedSalary = salary * ((percentIncrease / 100) + 1);
		System.out.printf("%n" + firstName + " " + lastName + ":\t $ %.2f", updatedSalary);
		System.out.println();
		outFile.printf("%n" + firstName + " " + lastName + ":\t $ %.2f", updatedSalary);
		System.out.println();
		System.out.println("A copy of the output has been saved to the file, Ch3_Ex7Output.dat");
		
		inFile.close();
		outFile.close();
	}
}
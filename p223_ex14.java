//**********************************
//NAME: Rogger Matamoros
//DATE: 10/11/10  
//ASSIGNMENT: Page 223 Exercise 14
//**********************************

import java.io.* ;
import java.util.* ;

public class p223_ex14 
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		char serviceType;
		final double REGSERVRATE = 0.2, PRESERVRATED = 0.10, PRESERVRATEN = 0.05;
		int accNumber, minsUsed, preMinD = 0, preMinN = 0;
		double cost = 0.0;
		String str;
		
		System.out.println("Enter account number");
		accNumber = console.nextInt();
		System.out.println("Select service type (Regular / Premium)");
		str = console.next();
		serviceType = str.charAt(0);
	
		if (serviceType == 'r' || serviceType == 'R')
		{
			System.out.println("Enter minutes used");
			minsUsed = console.nextInt();
			cost += 10.0;
			if (minsUsed > 50)
				cost += minsUsed * REGSERVRATE;
			System.out.printf("Account #" + accNumber + "\n\tService Code: " + serviceType 
							   + "\n\tMinutes Used: " + minsUsed 
							   + "\n\tAmount Due: $%.2f\n", cost);
		}
		else if (serviceType == 'p' || serviceType == 'P')
		{
			cost += 25.0;
			System.out.println("Enter daytime minutes (From 6:00am to 6:00pm)");
			preMinD = console.nextInt();
			if (preMinD > 75)
				cost += preMinD * PRESERVRATED;
			
			System.out.println("Enter nighttime minutes (From 6:00pm to 6:00am)");
			preMinN = console.nextInt();
			if (preMinN > 100)
				cost += preMinN * PRESERVRATEN;
			System.out.printf("Account #" + accNumber + "\n\tService Code: " + serviceType 
							   + "\n\tMinutes Used: " + (preMinD + preMinN) 
							   + "\n\tAmount Due: $%.2f\n", cost);
		}
		else
			System.out.println("Fatal Error Type STEREOTYPICAL_ARCANE_ERROR: " 
							   + "Incorrect Service Code.");
	}
}

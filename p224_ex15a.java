//***********************************
//NAME: Rogger Matamoros
//DATE: 10/11/10
//ASSIGNMENT: Page 224 Exercise 15
//***********************************

import java.io.* ;
import java.util.* ; 

public class p224_ex15a 
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		char frameType, response;
		final double REGCOST = 0.15, FANCYCOST = 0.25, CBOARDCOST = 0.02, GLASSCOST = 0.07,
		CROWNCOST = 0.35, COLOURCOST = 0.10;
		double totalCost = 0;
		int length, width, crowns, area, frameArea;
		String colour, str;
	
		System.out.println("Fancy or regular frame? (Enter f or r)");
		str = console.next();
		frameType = str.charAt(0);
		System.out.println("Enter length of frame");
		length = console.nextInt();
		System.out.println("Enter width of frame");
		width = console.nextInt();
		area = ((length - 1) * (width - 1));
		frameArea = ((length * width) - area);
	
		switch (frameType)
		{
			case 'f':
				totalCost += (FANCYCOST * frameArea);
				break;
			case 'r':
				totalCost += (REGCOST * frameArea);
				break;
		}
	
		totalCost += (CBOARDCOST * (frameArea + area)) + (GLASSCOST * area);
	
		System.out.println("Would you like crowns?");
		str = console.next();
		response = str.charAt(0);
		if (response == 'y')
		{
			System.out.println("How many crowns?");
			crowns = console.nextInt();
			totalCost += (crowns * CROWNCOST);
		}
		
		System.out.println("Would you like a custom colour?");
		str = console.next();
		response = str.charAt(0);
		
		if (response == 'y')
		{
			System.out.println("Enter a colour");
			colour = console.next();
			totalCost = totalCost + (frameArea * COLOURCOST);
			System.out.println("\nThe colour you selected is: " + colour);
		}
	
		System.out.printf("The total cost is: $%.2f\n", totalCost);

	}
}

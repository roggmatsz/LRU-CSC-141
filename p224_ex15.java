//***********************************
//NAME: Rogger Matamoros
//DATE: 10/11/10
//ASSIGNMENT: Page 224 Exercise 15
//***********************************

import java.io.* ;
import java.util.* ; 

public class p224_ex15 
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		char frameType, response;
		final double REGFRAMEC = 0.15, FANFRAMEC = 0.25, CARDBOARDC = 0.02, GLASSC = 0.07, 
		COLOURC = 0.10, CROWNC = 0.35;
		double totalCost = 0.0;
		int length = 0, width = 0, crowns, area = 0, frameArea;
		boolean colourD;
		String colour, str;
		
		System.out.println("Fancy or Regular Frame? (Enter F or R)");
		str = console.next();
		frameType = str.charAt(0);
		System.out.println("Enter Length of frame");
		length = console.nextInt();
		System.out.println("Enter Width of frame");
		width = console.nextInt();
		area = ((length - 1) * (width - 1));
		frameArea = ((length * width) - area);
		
		System.out.println("Would you like to colour your frame?");
		str = console.next();
		response = str.charAt(0);
		
		if (response == 'y')
		{
			System.out.println("What colour would you like your frame to be?");
			colour = console.next();
			totalCost += (frameArea * COLOURC);
		}
		
		switch (frameType)
		{
			case 'F':
				totalCost += (FANFRAMEC * frameArea) + (CARDBOARDC * area) + (GLASSC * area);
				break;
			case 'R':
				totalCost += (REGFRAMEC * frameArea) + (CARDBOARDC * area) + (GLASSC * area);
				break;
		}
				
		System.out.println("How many crowns would you like?");
		crowns = console.nextInt();
		if (crowns != 0)
		{
			totalCost += frameArea * CROWNC;
		}
		
		System.out.printf("The Total cost is: $%.2f\n", totalCost);
	}
}

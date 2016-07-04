//********************************
//NAME: Rogger Matamoros
//DATE: 09/20/10
//ASSIGNMENT: Page 162 Exercise #3
//*********************************

import java.util.* ;
import java.io.* ;

public class p162_ex3 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner inFile = new Scanner(new FileReader("salesData.txt"));
		PrintWriter outFile = new PrintWriter("output.dat");
									 
		int totalTickets, totalSales, boxTicketP, sideTicketP, premiumTicketP, generalTicketP;
		int boxTicketS, sideTicketS, premiumTicketS, generalTicketS ;									 
		inFile.next();
		inFile.next();
		boxTicketP = inFile.nextInt();
		boxTicketS = inFile.nextInt();
		sideTicketP = inFile.nextInt();
		sideTicketS = inFile.nextInt();
		premiumTicketP = inFile.nextInt();
		premiumTicketS = inFile.nextInt();	
		generalTicketP = inFile.nextInt();
		generalTicketS = inFile.nextInt();
		
		totalSales = (boxTicketP * boxTicketS) + (sideTicketP * sideTicketS) +
					 (premiumTicketP * premiumTicketS) + (generalTicketP * generalTicketS) ;
		totalTickets = boxTicketS + sideTicketS + premiumTicketS + generalTicketS;
									 
		System.out.printf("The total number of tickets sold is: %d%n" 
						  + "The total sales were: %d%n", totalTickets, totalSales);
		outFile.printf("The total number of tickets sold is: %d%n" 
					   + "The total sales were: %d%n", totalTickets, totalSales);							 
	    System.out.println("A copy of the output has been written in the file \"output.dat\"");
		inFile.close();
		outFile.close();							 
	}	
}

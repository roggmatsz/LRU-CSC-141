//*********************************
//NAME: Rogger Matamoros
//DATE: 11/29/10
//ASSIGNMENT: Page 590 Exercise 15
//*********************************

//To ye who grades my program. I just want to say that I'm really proud of this thing. 
//Its one of the finest (and most frustrating) programs I've done. You may carry on.

import java.util.*;
import java.lang.String.*;

public class p590_ex15
{
	public static int letter2number(String x)
	{
		//My custom method. Here, a string is first turned into lowercase, turned into a char, 
		//and processed by a switch, which will return a certain integer depending on the letter.
		x = x.toLowerCase();
		char xi = x.charAt(0);
		int out = 0;
		switch (xi)
		{
			case 'a':
				out = 1;
				break;
			case 'b':
				out = 2;
				break;
			case 'c':
				out = 3;
				break;
			case 'd':
				out = 5;
				break;
			case 'e':
				out = 6;
				break;
			case 'f':
				out = 7;
				break;
			default:
				break;
		}
		return out;
	}
	public static void main(String[] args)
	{
		//Declaring all the variables and objects the program will need first. Its a C thing.
		Scanner console = new Scanner(System.in);
		boolean offButton = false;
		int row, column;		
		String str;
		char foo;
		String layout[][] = 
			   {{"       ", "A ", "B ", "C ", "  ", "D ", "E ", "F "},
				{"Row 1  ", "* ", "* ", "* ", "  ", "* ", "* ", "* "},
				{"Row 2  ", "* ", "* ", "* ", "  ", "* ", "* ", "* "},
				{"Row 3  ", "* ", "* ", "* ", "  ", "* ", "* ", "* "},
			    {"Row 4  ", "* ", "* ", "* ", "  ", "* ", "* ", "* "},
			    {"Row 5  ", "* ", "* ", "* ", "  ", "* ", "* ", "* "},
			    {"Row 6  ", "* ", "* ", "* ", "  ", "* ", "* ", "* "},
			    {"Row 7  ", "* ", "* ", "* ", "  ", "* ", "* ", "* "},
			    {"Row 8  ", "* ", "* ", "* ", "  ", "* ", "* ", "* "},
			    {"Row 9  ", "* ", "* ", "* ", "  ", "* ", "* ", "* "},
			    {"Row 10 ", "* ", "* ", "* ", "  ", "* ", "* ", "* "},
			    {"Row 11 ", "* ", "* ", "* ", "  ", "* ", "* ", "* "},
			    {"Row 12 ", "* ", "* ", "* ", "  ", "* ", "* ", "* "},
			    {"Row 13 ", "* ", "* ", "* ", "  ", "* ", "* ", "* "}};

		while (offButton != true)
		{
			System.out.println("------* Now entered into the main loop *------");
			System.out.println("\nChoose a class: (F)irst, (B)usiness, or (E)conomy; " +
							   "\nEnter L to view the entire layout and X to exit.");
			//These 3 rows parse the input. The user can either enter the entire option name
			//or they can just enter what's in the parentheses. The input is then turned into
			//lowercase and the choice is then extracted.
			str = console.next();
			str = str.toLowerCase();
			foo = str.charAt(0);
			
			switch (foo)
			{
				case 'f':
					System.out.println("\n-- Available 1st class seats --\n");
					boolean ran_once = false;
					//This loop prints A-F; A carriage return is made at the end for presentation
					for (int i = 0; i < 8; i++)
						System.out.printf("" + layout[0][i]);
					System.out.println();
					//This block is in charge of displaying the layout. First for deals with row
					//range; the second "for" deals with the columns. A carriage return is added
					//once the loop has run once and subsequently.
					
					for (int i = 1; i < 3; i++)
					{
						if (ran_once == true)
							System.out.println();
						for (int j = 0; j < 8; j++)
						{
							System.out.printf("" + layout[i][j]);
							ran_once = true;
						}
					}
					System.out.println("\n\nChoose a seat. Enter the row and column where it is." +
									   "\nEx. 5,A");
					//These 4 lines parse the input, assing the number before the comma to row,
					//pass the letter to a custom method called letter2num which converts the 
					//letters to an appropiate integer and then assigns it to row. The resulting
					//coordinate in the matrix is then turned into an X.
					str = console.next();
					row = Integer.parseInt(str.substring(0, 1));
					str = str.substring(str.indexOf(',') + 1);
					column = letter2number(str);
					layout[row][column] = "X ";
					break;
				case 'b':
					System.out.println("\n-- Available biz class seats --\n");
					ran_once = false;
					//This loop prints A-F; A carriage return is made at the end for presentation
					for (int i = 0; i < 8; i++)
						System.out.printf("" + layout[0][i]);
					System.out.println();
					//This block is in charge of displaying the layout. First for deals with row
					//range; the second "for" deals with the columns. A carriage return is added
					//once the loop has run once and subsequently.
					for (int i = 3; i < 8; i++)
					{
						if (ran_once == true)
							System.out.println();
						for (int j = 0; j < 8; j++)
						{
							System.out.printf("" + layout[i][j]);
							ran_once = true;
						}
					}					
					System.out.println("\n\nChoose a seat. Enter the row and column where it is."
										+ "\nEx. 5,A");
					//These 4 lines parse the input, assing the number before the comma to row,
					//pass the letter to a custom method called letter2num which converts the 
					//letters to an appropiate integer and then assigns it to row. The resulting
					//coordinate in the matrix is then turned into an X.
					str = console.next();
					row = Integer.parseInt(str.substring(0, 1));
					str = str.substring(str.indexOf(',') + 1);
					column = letter2number(str);
					layout[row][column] = "X ";
					break;
				case 'e':
					System.out.println("\n-- Available economy class seats --\n");
					ran_once = false;
					//This loop prints A-F; A carriage return is made at the end for presentation
					for (int i = 0; i < 8; i++)
						System.out.printf("" + layout[0][i]);
					System.out.println();
					//This block is in charge of displaying the layout. First for deals with row
					//range; the second "for" deals with the columns. A carriage return is added
					//once the loop has run once and subsequently.
					for (int i = 8; i < 14; i++)
					{
						if (ran_once == true)
							System.out.println();
						for (int j = 0; j < 8; j++)
						{
							System.out.printf("" + layout[i][j]);
							ran_once = true;
						}
					}					
					System.out.println("\n\nChoose a seat. Enter the row and column where it is" +
									   "\n.Ex. 5,A");
					//These 4 lines parse the input, assing the number before the comma to row,
					//pass the letter to a custom method called letter2num which converts the 
					//letters to an appropiate integer and then assigns it to row. The resulting
					//coordinate in the matrix is then turned into an X.
					str = console.next();
					row = Integer.parseInt(str.substring(0, str.indexOf(',')));
					str = str.substring(str.indexOf(',') + 1);
					column = letter2number(str);
					layout[row][column] = "X ";					
					break;
				case 'l':
					System.out.println("\n-- List of all available seats --\n");
					//This code block displays the entire layout. The same algorithm used to 
					//display the layout in previous cases is used here unbounded to display
					//it in its entirety. A carriage return is made at the end for presentation.
					ran_once = false;
					for (int i = 0; i < 8; i++)
						System.out.printf("" + layout[0][i]);
					System.out.println();
					for (int i = 1; i < 14; i++)
					{
						if (ran_once == true)
							System.out.println();
						for (int j = 0; j < 8; j++)
						{
							System.out.printf("" + layout[i][j]);
							ran_once = true;
						}
					}
					System.out.println("\n");
					break;
				case 'x':
					//This is the "off switch." if a user inputs "X," the boolean is set to true
					//and the while loop in charge of maintaining the program alive stops.
					offButton = true;
					break;
				default:
					//Should the user input something other than the given options, this will 
					//appear.
					System.out.println("\nI don't know what to do with that; Try again ;-)\n");
					break;
			}
		}
	}
}

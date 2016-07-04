//*******************************
//NAME: Rogger Matamoros
//DATE: 09/20/10
//ASSIGNMENT:Chapter 3 Problem A
//*******************************

import java.util.*;

public class ch3_exB
{
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] Args)
	{
		String string, string1, word;
		
		System.out.println("Enter some form of text that includes the word \"love\"");
		string = console.nextLine();
		string1 = string.replaceAll("love", "HATE");
		
		System.out.println("The text you typed, when hate is inverted to love, looks like: \n"
						  + "\t" + string1);
	}
}
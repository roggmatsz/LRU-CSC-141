//NAME: Rogger Matamoros
//DATE: 09/20/10
//ASSIGNMENT:Chapter 3 Problem A

import java.util.*;

public class ch3_exA
{
	static Scanner console = new Scanner(System.in);

	public static void main(String[] Args)
	{
		String string1, string2, string3;
		int length1, length2, length3;

		System.out.printf("Enter 1st String%n");
		string1 = console.nextLine();
		System.out.printf("Enter 2nd String%n");
		string2 = console.nextLine();

		length1 = string1.length();
		length2 = string2.length();
		string3 = string1.concat(" ");
		string3 = string3.concat(string2);
		length3 = string3.length();

		System.out.printf("The first string was: " + string1 + "%n");
		System.out.printf("The length of " + "\"" + string1 + "\"" + " is " + length1 + "%n");
		System.out.printf("The second string was: " + string2 + "%n");
		System.out.printf("The length of " + "\"" + string2 + "\"" + " is " + length2 + "%n");
		System.out.printf("The concatenation of the 1st and 2nd string is " + string3 + "%n");
		System.out.println("The length of " + "\"" + string3 + "\"" + " is " + length3); 
		
		
	}
}
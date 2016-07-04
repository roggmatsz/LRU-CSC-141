//**********************************
//NAME: Rogger Matamoros
//DATE: 10/05/10
//ASSIGNMENT: Page 222 Program 11
//**********************************

import java.util.* ;
import java.io.* ;

public class p222_ex11 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner inFile = new Scanner(new FileReader("banklist.txt"));
		int accNumber, minBalance, accBalance;
		double NewAccBalance;
		char accType;
		String str;
		final int SSERVICECHARGE = 10, CSERVICECHARGE = 25, SINTEREST = 4, CINTEREST1 = 3,
		CINTEREST2 = 5;
		
		//		*--- Account 1 ---*
		accNumber = inFile.nextInt();
		str = inFile.next();
		accType = str.charAt(0);
		minBalance = inFile.nextInt();
		accBalance = inFile.nextInt();
		System.out.println("Account Number: " + accNumber);
		
		switch (accType)
		{
			case 'S':
				System.out.println("\tAccount Type: Savings");
				if (accBalance < minBalance)
				{
					NewAccBalance = accBalance - SSERVICECHARGE;
					System.out.println("\tMessage: The account has less than the minimum balance.\n" 
									   + "\tA Service charge of $10 has been " 
									   + "withdrawn from the account.");
				}
				else 
					NewAccBalance = accBalance * (1 + (SINTEREST / 100.0));
				System.out.println("\tPrevious Balance: " + accBalance + "\t\tCurrent Balance: " 
								   + NewAccBalance);
				break;
			case 'C':
				System.out.println("\tAccount Type: Checking");
				if (accBalance < minBalance)
				{
					NewAccBalance = accBalance - CSERVICECHARGE;
					System.out.println("\tMessage: The account has less than the minimum balance.\n" 
								       + "\tA Service charge of $25 has been withdrawn from the "
									   + "account.");
				}
				else if (accBalance >= (minBalance + 5000))
					NewAccBalance = accBalance * (1 + (CINTEREST1 / 100.0));
				else
					NewAccBalance = accBalance * (1 + (CINTEREST2 / 100.0));
				System.out.println("\tPrevious Balance: " + accBalance + "\t\tCurrent Balance: "
								   + NewAccBalance);
				break;
		}
		System.out.println();
		
		//		*--- Account 2 ---*
		accNumber = inFile.nextInt();
		str = inFile.next();
		accType = str.charAt(0);
		minBalance = inFile.nextInt();
		accBalance = inFile.nextInt();
		System.out.println("Account Number: " + accNumber);
		
		switch (accType)
		{
			case 'S':
				System.out.println("\tAccount Type: Savings");
				if (accBalance < minBalance)
				{
					NewAccBalance = accBalance - SSERVICECHARGE;
					System.out.println("\tMessage: The account has less than the minimum balance.\n" 
									   + "\tA Service charge of $10 has been " 
									   + "withdrawn from the account.");
				}
				else 
					NewAccBalance = accBalance * (1 + (SINTEREST / 100.0));
				System.out.println("\tPrevious Balance: " + accBalance + "\t\tCurrent Balance: " 
								   + NewAccBalance);
				break;
			case 'C':
				System.out.println("\tAccount Type: Checking");
				if (accBalance < minBalance)
				{
					NewAccBalance = accBalance - CSERVICECHARGE;
					System.out.println("\tMessage: The account has less than the minimum balance.\n" 
								       + "\tA Service charge of $25 has been withdrawn from the "
									   + "account.");
				}
				else if (accBalance >= (minBalance + 5000))
					NewAccBalance = accBalance * (1 + (CINTEREST1 / 100.0));
				else
					NewAccBalance = accBalance * (1 + (CINTEREST2 / 100.0));
				System.out.println("\tPrevious Balance: " + accBalance + "\t\tCurrent Balance: "
								   + NewAccBalance);
				break;
		}
		System.out.println();
		
		//		*--- Account 3 ---*
		accNumber = inFile.nextInt();
		str = inFile.next();
		accType = str.charAt(0);
		minBalance = inFile.nextInt();
		accBalance = inFile.nextInt();
		System.out.println("Account Number: " + accNumber);
		
		switch (accType)
		{
			case 'S':
				System.out.println("\tAccount Type: Savings");
				if (accBalance < minBalance)
				{
					NewAccBalance = accBalance - SSERVICECHARGE;
					System.out.println("\tMessage: The account has less than the minimum balance.\n" 
									   + "\tA Service charge of $10 has been " 
									   + "withdrawn from the account.");
				}
				else 
					NewAccBalance = accBalance * (1 + (SINTEREST / 100.0));
				System.out.println("\tPrevious Balance: " + accBalance + "\t\tCurrent Balance: " 
								   + NewAccBalance);
				break;
			case 'C':
				System.out.println("\tAccount Type: Checking");
				if (accBalance < minBalance)
				{
					NewAccBalance = accBalance - CSERVICECHARGE;
					System.out.println("\tMessage: The account has less than the minimum balance.\n" 
								       + "\tA Service charge of $25 has been withdrawn from the "
									   + "account.");
				}
				else if (accBalance >= (minBalance + 5000))
					NewAccBalance = accBalance * (1 + (CINTEREST1 / 100.0));
				else
					NewAccBalance = accBalance * (1 + (CINTEREST2 / 100.0));
				System.out.println("\tPrevious Balance: " + accBalance + "\t\tCurrent Balance: "
								   + NewAccBalance);
				break;
		}
		System.out.println();
		
		//		*--- Account 4 ---*
		accNumber = inFile.nextInt();
		str = inFile.next();
		accType = str.charAt(0);
		minBalance = inFile.nextInt();
		accBalance = inFile.nextInt();
		System.out.println("Account Number: " + accNumber);
		
		switch (accType)
		{
			case 'S':
				System.out.println("\tAccount Type: Savings");
				if (accBalance < minBalance)
				{
					NewAccBalance = accBalance - SSERVICECHARGE;
					System.out.println("\tMessage: The account has less than the minimum balance.\n" 
									   + "\tA Service charge of $10 has been " 
									   + "withdrawn from the account.");
				}
				else 
					NewAccBalance = accBalance * (1 + (SINTEREST / 100.0));
				System.out.println("\tPrevious Balance: " + accBalance + "\t\tCurrent Balance: " 
								   + NewAccBalance);
				break;
			case 'C':
				System.out.println("\tAccount Type: Checking");
				if (accBalance < minBalance)
				{
					NewAccBalance = accBalance - CSERVICECHARGE;
					System.out.println("\tMessage: The account has less than the minimum balance.\n" 
								       + "\tA Service charge of $25 has been withdrawn from the "
									   + "account.");
				}
				else if (accBalance >= (minBalance + 5000))
					NewAccBalance = accBalance * (1 + (CINTEREST1 / 100.0));
				else
					NewAccBalance = accBalance * (1 + (CINTEREST2 / 100.0));
				System.out.println("\tPrevious Balance: " + accBalance + "\t\tCurrent Balance: "
								   + NewAccBalance);
				break;
		}
		System.out.println();
		
		//		*--- Account 5 ---*
		accNumber = inFile.nextInt();
		str = inFile.next();
		accType = str.charAt(0);
		minBalance = inFile.nextInt();
		accBalance = inFile.nextInt();
		System.out.println("Account Number: " + accNumber);
		
		switch (accType)
		{
			case 'S':
				System.out.println("\tAccount Type: Savings");
				if (accBalance < minBalance)
				{
					NewAccBalance = accBalance - SSERVICECHARGE;
					System.out.println("\tMessage: The account has less than the minimum balance.\n" 
									   + "\tA Service charge of $10 has been " 
									   + "withdrawn from the account.");
				}
				else 
					NewAccBalance = accBalance * (1 + (SINTEREST / 100.0));
				System.out.println("\tPrevious Balance: " + accBalance + "\t\tCurrent Balance: " 
								   + NewAccBalance);
				break;
			case 'C':
				System.out.println("\tAccount Type: Checking");
				if (accBalance < minBalance)
				{
					NewAccBalance = accBalance - CSERVICECHARGE;
					System.out.println("\tMessage: The account has less than the minimum balance.\n" 
								       + "\tA Service charge of $25 has been withdrawn from the "
									   + "account.");
				}
				else if (accBalance >= (minBalance + 5000))
					NewAccBalance = accBalance * (1 + (CINTEREST1 / 100.0));
				else
					NewAccBalance = accBalance * (1 + (CINTEREST2 / 100.0));
				System.out.println("\tPrevious Balance: " + accBalance + "\t\tCurrent Balance: "
								   + NewAccBalance);
				break;
		}
		
		inFile.close();
	}
}
//*********************************
//NAME: Rogger Matamoros
//DATE: 09/27/10
//ASSIGNMENT: Page 163 Exercise 6
//*********************************

import java.io.* ;
import java.util.* ;

public class p163_ex6 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner inFile = new Scanner(new FileReader("deductions.txt"));
		Scanner console = new Scanner(System.in);
		PrintWriter outFile = new PrintWriter("outFile.dat");
		
		String str, name;
		double fedTax, stateTax, ssTax, medTax, penTax, penPlan, healthIns, grossAmt;
		
		inFile.next(); inFile.next(); inFile.next(); 
		str = inFile.next();
		fedTax = Double.parseDouble(str);
		
		inFile.next(); inFile.next(); inFile.next();
		str = inFile.next();
		stateTax = Double.parseDouble(str);
		
		inFile.next(); inFile.next(); inFile.next(); inFile.next();
		str = inFile.next();
		ssTax = Double.parseDouble(str);
		
		inFile.next(); inFile.next(); inFile.next();
		str = inFile.next();
		medTax = Double.parseDouble(str);
		
		inFile.next(); inFile.next(); inFile.next();
		str = inFile.next();
		penTax = Double.parseDouble(str);
		
		inFile.next(); inFile.next(); inFile.next(); inFile.next();
		str = inFile.next();
		healthIns = Double.parseDouble(str);
		
		System.out.println("Enter name of employee without spaces (it breaks otherwise)");
		name = console.next();
		
		System.out.println("Enter gross amount");
		grossAmt = console.nextDouble();
		System.out.println();
		
		fedTax = (fedTax / 100) * grossAmt ;
		stateTax = (stateTax / 100) * grossAmt ;
		ssTax = (ssTax / 100) * grossAmt;
		medTax = (medTax / 100) * grossAmt;
		penTax = (penTax / 100) * grossAmt;
		
		
		System.out.printf(name + "%nGross Amount: $ " + grossAmt + "%nFederal Tax: $ " + fedTax 
						  + "%nState Tax: $ %.2f" + "%nSocial Security Tax: $ %.2f" 
						  + "%nMedicare/Medicaid Tax: $ %.2f" + "%nPension Plan: $ %.2f" 
						  + "%nHealth Insurance: $ " + healthIns + "%nNet Pay: $ %.2f", stateTax,
						  ssTax, medTax, penTax, ((0.68 * grossAmt) - penTax));
		outFile.printf(name + "%nGross Amount: $ " + grossAmt + "%nFederal Tax: $ " + fedTax 
					   + "%nState Tax: $ %.2f" + "%nSocial Security Tax: $ %.2f" 
					   + "%nMedicare/Medicaid Tax: $ %.2f" + "%nPension Plan: $ %.2f" 
					   + "%nHealth Insurance: $ " + healthIns + "%nNet Pay: $ %.2f", stateTax,
					   ssTax, medTax, penTax, ((0.68 * grossAmt) - penTax));
		System.out.println();
		System.out.println("A copy of the output has been written in \"outfile.dat\"");
		inFile.close();
		outFile.close();
	}
}

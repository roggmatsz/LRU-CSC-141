//**********************************
//NAME: Rogger Matamoros
//DATE: 09/08/10
//ASSIGNMENT: P.105 Ex. 14 part a-l
//**********************************
import java.util.* ;
import java.math.* ;
import java.lang.Math.*;
public class p105_Ex14 
{
	static double markupPercent, sellingPrice, salesTax, finalPrice, origPrice, taxRate ;
	
	
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter original price");
		origPrice = console.nextDouble();
		System.out.println("Enter markup percentage");
		markupPercent = console.nextDouble();
		System.out.println("Enter sales tax rate");
		taxRate = console.nextDouble();
		
		sellingPrice = origPrice * ((markupPercent / 100) + 1);
		taxRate	= taxRate / 100 ;
		salesTax =  sellingPrice * taxRate ;
		finalPrice = (sellingPrice + salesTax) ;
		finalPrice =  Math.ceiling(finalPrice + 0.05f);
		
		System.out.println("\nThe original price of the item is: " + origPrice +
						   "\nThe markup percentage is: " + markupPercent +
						   "\nThe store's selling price of the item is: " + sellingPrice +
						   "\nThe sales tax rate is: " + taxRate +
						   "\nThe sales tax is: " + salesTax +
						   "\nThe final price is: " + finalPrice);
	}

}

//*********************************
//NAME: Rogger Matamoros
//DATE: 09/08/10
//ASSIGNMENT: pg. 105 exercise 16
//*********************************
import java.util.* ;
import java.math.* ;



public class p105_ex16 
{
	static int milkProduced;
	static double milkCost, cartons, milkProfit;
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("Enter amount of milk produced this morning in Litres");
		milkProduced = console.nextInt();
		cartons = milkProduced / 3.78 ;
		cartons = Math.Round(cartons, 2);
		milkCost = cartons * 0.38;
		milkProfit = cartons * 0.27;
		
		
		System.out.println("The number of cartons needed is: " + cartons +
						   "\nThe cost of producing milk is: " + milkCost +
						   "\nThe profit of producing milk is: " + milkProfit);
	}
}

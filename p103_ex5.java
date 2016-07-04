import java.util.* ;

public class p103_ex5
{
	static Scanner console = new Scanner(System.in);
	static final int SECRET = 11 ;
	static final double RATE = 12.50 ;
	
	public static void main(String[] args)
	{
		int num1, num2, newNum;
		String name ;
		double hoursWorked, wages ;
		
		System.out.println("Enter 1st Number");
		num1 = console.nextInt();
		System.out.println("Enter 2nd Number");
		num2 = console.nextInt();
		
		System.out.println("This is Number 1: " + num1 + " and this is Number 2: " + num2);
		
		newNum = num1 * 2 + num2 ;
		System.out.println("The value of newNum is " + newNum);
		
		newNum = newNum + SECRET ;
		System.out.println("The sum of newNum + SECRET is " + newNum) ;
		
		System.out.println("Enter Last Name");
		name = console.next();
		
		System.out.println("Enter hours worked");
		hoursWorked = console.nextDouble();
		
		wages = RATE * hoursWorked ;
		
		System.out.println("Name: " + name + "\nPay Rate: $" + RATE + "\nHours Worked: " + 
						   hoursWorked + "\nSalary: $" + wages);
	}
}

//Part M
// i) The output is:       ii) The output is:
//	  Name: Jacobson		   Name: Cynthia
//    Pay Rate: $12.5		   Pay Rate: $12.5
//    Hours Worked: 48.3	   Hours Worked: 58.45
//	  Salary: $603.75		   Salary: $730.625

//***************************************
//NAME: Rogger Matamoros
//DATE: 11/22/10
//ASSIGNMENT: Page 586 Exercise 1
//***************************************

public class p586_ex1 
{
	public static void main(String[] args)
	{
		int j = 0, i = 0;
		double[] alpha = new double[50];
		for (i = 0; i < alpha.length / 2; i++)
		{
			alpha[i] = i * i;
		}
		for (i = 25; i < alpha.length; i++)
		{
			alpha[i] = 3 * i;
		}
		i = 0;
		for (j = 0; j <= 5; j++)
		{
			for (int k = 0; k < 10; k++)
			{
				System.out.printf("alpha[" + i + "] = " + alpha[i] + ", ");
				i += 1;
			}
			System.out.println("\n");
			j += 1;
		}
	}
}

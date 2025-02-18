package set_2.J3_Findding_Factorial;

import java.util.Scanner;

public class Factorial
{
	public static void main(String[] args)
	{
		int n, c;
		int fact = 1;
		
		System.out.println("Enter the integer to find its factorial :");
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		if(n < 0)
		{
			System.out.println("The Number should be non-negative..");
		}
		else
		{
			for(c=1; c<=n; c++)
			{
				fact = fact * c ;
				
				System.out.println("Factorial of "+ n + " is " +fact);
			}
		}
		
	}

}

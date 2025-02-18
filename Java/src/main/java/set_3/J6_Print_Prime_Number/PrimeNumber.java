package set_3.J6_Print_Prime_Number;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int n;
		int count = 0;
		
		System.out.println("Enter the number for checking the number is prime or not =");
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			if(n%i == 0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("The number is prime");
		}
		else {
			System.out.println("The number is not prime");
		}

	}

}

package set_2.J4_Findding_Factorial_For_big_Number;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {

	public static void main(String[] args)
	{
		int n, c;
		
		System.out.println("Enter the big Integer :");
		
		BigInteger inc = new BigInteger("1");
		BigInteger fact = 	new BigInteger("1");
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		for(c=1; c<=n; c++)
		{
			fact = fact.multiply(inc);
			
			inc = inc.add(BigInteger.ONE);
			
		}
		System.out.println(n + "! = " + fact);
		

	}

}

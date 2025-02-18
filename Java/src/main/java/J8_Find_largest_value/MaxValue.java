package J8_Find_largest_value;

import java.util.Scanner;

public class MaxValue {

	public static void main(String[] args) 
	{
		
		int x,y,z;
		
		System.out.println("Finding the the lagest value ");
		
		Scanner sc = new  Scanner(System.in);
		
		System.out.println("Enter the 3 numbers");
		
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		
		System.out.println("You Entered Number x is  = " + x + " and y is = "+y + " and z is "+z);
		
		if(x > y && x > z)
		{
			System.out.println("X is an large number = "+x);
		}
		else if(x < y && y > z)
		{
			System.out.println("Y is large number = "+y);
		}
		else if(z > x && z > y )
		{
			System.out.println("Z is large numer = "+z);
		}
		else
		{
			System.out.println("Entered Number are not distinct..");
		}

	}

}

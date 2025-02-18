package J7_Addition_of_two_number;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) 
	{
		System.out.println("Addition of two number ");
		
		int a, b, z;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number for a = ");
		
		a = sc.nextInt();
		
		System.out.println("Enter the number for b = ");
		
		b = sc.nextInt();
		
		System.out.println("The number for a is  = "+ a + " and for b is = "+b);
		
		z = a + b;
		
		System.out.println("Addition of 2 number is  = "+ z);
		

	}

}

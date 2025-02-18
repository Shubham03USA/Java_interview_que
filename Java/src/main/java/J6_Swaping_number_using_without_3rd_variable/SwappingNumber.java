package J6_Swaping_number_using_without_3rd_variable;

import java.util.Scanner;

public class SwappingNumber {

	public static void main(String[] args) 
	{
		int a, b;
		
		System.out.println("Swapping Number without 3rd variable");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of a = ");
		
		a = sc.nextInt();
		
		System.out.println("Enter the value of b = ");
		
		b = sc.nextInt();
		
		System.out.println("Before swpping the number a is = "+ a + " and b is = "+b);
		
		a = a + b;
		
		b = a - b;
		
		a = a - b;
		
		System.out.println("Ater the swapping a is = "+ a + " and b is = " + b);


	}

}

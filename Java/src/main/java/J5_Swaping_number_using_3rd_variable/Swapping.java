package J5_Swaping_number_using_3rd_variable;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args)
	{
		int x, y, temp;
		
		System.out.println("Swapping 2 Number with 3rd varible ");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x = ");
		
		x = sc.nextInt();
		
		System.out.println("Enter y is = ");
		
		y = sc.nextInt();
		
		System.out.println("Befor swapping number x is = "+ x + " and y is = " +y);
		
		temp = x;
		
		x = y;
		
		y = temp;
		
		System.out.println("after swapping number x is = "+ x + " and y is = " +y);

	}

}

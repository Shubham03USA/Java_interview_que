package set_2.J2_Find_Odd_Even;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args)
	{
		int x;
		
		System.out.println("Enter the number to findout is odd or evev :");
		
		Scanner sc = new Scanner(System.in);
		
		x = sc .nextInt();
		
		if(x % 2 == 0)
		{
			System.out.println("The entered number is evevn = "+x);
		}
		else
		{
			System.out.println("The entered number is Odd = "+x);
		}

	}

}

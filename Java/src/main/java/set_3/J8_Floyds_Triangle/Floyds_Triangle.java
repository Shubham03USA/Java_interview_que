package set_3.J8_Floyds_Triangle;

import java.util.Scanner;

public class Floyds_Triangle {

	public static void main(String[] args) 
	{
		int n,c,d;
		int num = 0;
		
		System.out.println("Enter the number to print triangle :");
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		for(c = 1; c <= n; c++)
		{
			for( d = 1; d <= c; d++)
			{
				System.out.print(" "+num);
				num++;
			}
			System.out.println();
		}

	}

}

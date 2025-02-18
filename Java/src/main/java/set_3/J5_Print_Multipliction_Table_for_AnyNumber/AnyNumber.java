package set_3.J5_Print_Multipliction_Table_for_AnyNumber;

import java.util.Scanner;

public class AnyNumber {

	public static void main(String[] args)
	{
		int a,b,c,d;
		
		System.out.println("Enter the number to print there Multipliction number = ");
		
		Scanner sc =  new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		for(c=a; c<=b; c++)
		{
			System.out.println("Multipliction of table = "+c);
			
			for(d=1; d<=10; d++)
			{
				System.out.println(c+" * "+d+" = "+(c*d));
			}
		}

	}

}
